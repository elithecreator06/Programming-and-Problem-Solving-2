public class Coins {
    private int quantityOnHand;
    private final float denomination;
    private final float weight;

    public Coins(float denomination, float weight) {
        quantityOnHand = 0;
        this.denomination = denomination;
        this.weight = weight;
    }

    public float getTotalWeight() {
        return weight * quantityOnHand;
    }

    public float getTotalValue() {
        return denomination * quantityOnHand;
    }

    public void increaseQuantity(int quantity) {
        quantityOnHand += quantity;
    }

    public void decreaseQuantity(int quantity) {
        quantityOnHand -= quantity;
        if (quantityOnHand < 0) {
            quantityOnHand = 0;
        }
    }

    public int getQuantityOnHand() {
        return quantityOnHand;
    }

    public String printPretty(float amount) {
        return ("$" + String.format("%4.2f", amount));
    }

    @Override
    public java.lang.String toString() {
        return printPretty(getTotalValue()) + " in " + printPretty(denomination) + " coins.";
    }
}

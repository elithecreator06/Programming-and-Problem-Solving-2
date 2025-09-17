public class StockItem {
    private final String description;
    private final int id;
    private static int nextId = 0;
    private float price;
    private int quantity;

    StockItem(){
        description = "Void";
        id = nextId;
        nextId++;
        price = 0.0f;
        quantity = 0;
    }

    StockItem(String description, float price, int quantity){
        this.description = description;
        id = nextId;
        nextId++;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String toString(){
        return "Item number: " + id +
                " is " + description +
                " has price " + price +
                " we currently have " + quantity +
                " in stock";
    }

    public void lowerQuantity(int quantity){
        if(this.quantity - quantity < 0){
            System.out.println("Error");
            this.quantity = 0;
        }else{
            this.quantity = (this.quantity - quantity);
        }
    }

    public void raiseQuantity(int quantity){
        this.quantity = (this.quantity + quantity);
    }

    public void setPrice(float price){
        if(price < 0.00f){
            System.out.println("Error");
        }else{
            this.price = price;
        }
    }

    public String getDescription(){
        return description;
    }

    public int getId(){
        return id;
    }

    public float getPrice(){
        return price;
    }

    public int getQuantity() {
        if (quantity < 0) {
            quantity = 0;
        }
        return quantity;
    }
}
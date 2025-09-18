public class Pokemon {
    private int level;
    private double baseCatchRate;

    Pokemon(int level, double baseCatchRate){
        this.level = level;
        this.baseCatchRate = baseCatchRate;
    }

    public int getLevel(){
        return level;
    }

    public double getBaseCatchRate() {
        return baseCatchRate;
    }
}

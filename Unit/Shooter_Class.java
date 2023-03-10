package Unit;

public abstract class Shooter_Class extends BaseHero {

    // accuracy - меткость;
    
    protected int arrovs;
    protected int accuracy;

    public Shooter_Class(int hp, int speed, int damage, int defence, int arrovs, int accuracy, String name) {
        super(hp, speed, damage, defence, name);
        this.arrovs = arrovs;
        this.accuracy = accuracy;        
    }

    @Override
    public String getInfo() {
        return String.format("%s  Arrovs: %d  Accuracy: %d", 
                            super.getInfo(), this.arrovs, this.accuracy);
    }
    
}

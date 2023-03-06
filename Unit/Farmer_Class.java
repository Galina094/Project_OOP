package Unit;

public class Farmer_Class extends BaseHero {

    protected int nutrition;
    protected int goodness;

    public Farmer_Class(int hp, int speed, int damage, int defence, int nutrition, int goodness) {
        super(hp, speed, damage, defence);
        this.nutrition = nutrition;
        this.goodness = goodness;
    }    
    
}

package Unit;

import java.util.ArrayList;

public abstract class Farmer_Class extends BaseHero {

    protected int nutrition;
    protected int goodness;

    public Farmer_Class(int hp, int maxHp, int speed, int damage, int defence, int nutrition, int goodness, String name) {
        super(hp, maxHp, speed, damage, defence, name);
        this.nutrition = nutrition;
        this.goodness = goodness;
    }  
    
    @Override
    public String getInfo() {
        return String.format("FarmerMen: %s  Nutrition: %d Goodness: %d", 
                            super.getInfo(), this.nutrition, this.goodness);
    }

    





    
}

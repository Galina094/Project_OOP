package Unit;

import java.util.ArrayList;

public abstract class Warrior_Class extends BaseHero {

    protected int phisicalPower;    
    protected int maxSpeed;
    
    public Warrior_Class(int hp, int maxHp, int speed, int damage, int defence, int phisicalPower, int maxSpeed, String name) {
        super(hp, maxHp, speed, damage, defence, name);
        this.phisicalPower = phisicalPower;        
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String getInfo() {
        return String.format("%s  PhisicalPower: %d  MaxHp: %d   MaxSpeed: %d", 
                            super.getInfo(), this.phisicalPower, this.maxHp, this.maxSpeed);
    }

    @Override
    public void step(ArrayList<BaseHero> team1, ArrayList<BaseHero> team2) {
        
    }
    
    

    

}

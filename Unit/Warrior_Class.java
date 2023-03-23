package Unit;

import java.util.ArrayList;

public abstract class Warrior_Class extends BaseHero {

    protected int phisicalPower;    
    protected int maxSpeed;      

    public Warrior_Class(int hp, int maxHp, int speed, int damage, int defence, String name, int x, int y,
            int phisicalPower, int maxSpeed) {
        super(hp, maxHp, speed, damage, defence, name, x, y);
        this.phisicalPower = phisicalPower;
        this.maxSpeed = maxSpeed;
    }

    // @Override
    // public String getInfo() {
    //     return String.format("%s ", super.getInfo());
    // }

    // @Override
    // public void step(ArrayList<BaseHero> team1, ArrayList<BaseHero> team2) {
        
    // }
    
    

    

}

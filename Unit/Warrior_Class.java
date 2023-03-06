package Unit;

public class Warrior_Class extends BaseHero {

    protected int phisicalPower;
    protected int maxHp;
    protected int maxSpeed;
    
    public Warrior_Class(int hp, int speed, int damage, int defence, int phisicalPower, int maxHp, int maxSpeed) {
        super(hp, speed, damage, defence);
        this.phisicalPower = phisicalPower;
        this.maxHp = maxHp;
        this.maxSpeed = maxSpeed;
    }
    
    

    

}

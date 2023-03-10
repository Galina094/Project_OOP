package Unit;

public abstract class Warrior_Class extends BaseHero {

    protected int phisicalPower;
    protected int maxHp;
    protected int maxSpeed;
    
    public Warrior_Class(int hp, int speed, int damage, int defence, int phisicalPower, int maxHp, int maxSpeed, String name) {
        super(hp, speed, damage, defence, name);
        this.phisicalPower = phisicalPower;
        this.maxHp = maxHp;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String getInfo() {
        return String.format("%s  PhisicalPower: %d  MaxHp: %d   MaxSpeed: %d", 
                            super.getInfo(), this.phisicalPower, this.maxHp, this.maxSpeed);
    }
    
    

    

}

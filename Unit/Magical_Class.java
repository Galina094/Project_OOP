package Unit;

public class Magical_Class extends BaseHero {
    
    protected int mana;
    protected int magicPower;

    public Magical_Class(int hp, int speed, int damage, int defence, int mana, int magicPower) {
        super(hp, speed, damage, defence);
        this.mana = mana;
        this.magicPower = magicPower;        
    }    
}

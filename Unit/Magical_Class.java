package Unit;

public abstract class Magical_Class extends BaseHero {
    
    protected int mana;
    protected int magicPower;

    public Magical_Class(int hp, int speed, int damage, int defence, int mana, int magicPower, String name) {
        super(hp, speed, damage, defence, name);
        this.mana = mana;
        this.magicPower = magicPower;        
    }  
    
    @Override
    public String getInfo() {
        return String.format("%s  Mana: %d  MagicPower: %d", 
                            super.getInfo(), this.mana, this.magicPower);
    }
}

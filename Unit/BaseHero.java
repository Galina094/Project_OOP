package Unit;

import java.lang.annotation.Native;
import javax.management.ConstructorParameters;

public abstract class BaseHero implements UnitInterface {

    // hp - health point - здоровье, speed - скорость передвижения по полю, damage - урон, 
    // defence - защита

    protected int hp;
    protected int speed;
    protected int damage;
    protected int defence;
    protected final String NAME;

    
    public void getNAME() {
        // System.out.println(NAME);
    }


    public BaseHero(int hp, int speed, int damage, int defence, String name) {
        this.hp = hp;
        this.speed = speed;
        this.damage = damage;
        this.defence = defence;
        NAME = name;
    }  


    @Override
    public void step() {
        System.out.println("Step");        
    }

    @Override
    public String getInfo(){
        return String.format(" %s  Hp: %d  Speed: %d   Damage: %d   Defence: %d" ,   
                                         this.NAME, this.hp, this.speed, this.damage, this.defence);
    }
}

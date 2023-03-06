package Unit;

import java.lang.annotation.Native;
import javax.management.ConstructorParameters;

public class BaseHero {

    // hp - health point - здоровье, speed - скорость передвижения по полю, damage - урон, 
    // defence - защита

    protected int hp;
    protected int speed;
    protected int damage;
    protected int defence;

    
    public BaseHero(int hp, int speed, int damage, int defence) {
        this.hp = hp;
        this.speed = speed;
        this.damage = damage;
        this.defence = defence;
    }

    
    

    
}

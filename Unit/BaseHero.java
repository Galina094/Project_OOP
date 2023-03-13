package Unit;

import java.lang.annotation.Native;
import java.util.ArrayList;
import java.util.Random;

import javax.management.ConstructorParameters;

public abstract class BaseHero implements UnitInterface {

    Random rnd = new Random();

    // hp - health point - здоровье, speed - скорость передвижения по полю, damage - урон, 
    // defence - защита

    protected int hp;
    protected int maxHp;
    protected int speed;
    protected int damage;
    protected int defence;
    protected final String NAME;

    
    public void getNAME() {
        // System.out.println(NAME);
    }

    public int getSpeed() {
        return speed;
    }

      

    public BaseHero(int hp, int maxHp, int speed, int damage, int defence, String nAME) {
        this.hp = hp;
        this.maxHp = maxHp;
        this.speed = speed;
        this.damage = damage;
        this.defence = defence;
        NAME = nAME;
    }

    @Override
    public String getInfo(){
        return String.format(" %s  Hp: %d  Speed: %d   Damage: %d   Defence: %d" ,   
                                         this.NAME, this.hp, this.speed, this.damage, this.defence);
    }

    @Override
    public String toString() {        
        return "";
    }

    @Override
    public void step(ArrayList<BaseHero> team1, ArrayList<BaseHero> team2) {
        // System.out.println("Step");        
    }

    public void getDamage(int damage){
        if (this.hp - damage > 0 ){
            this.hp -= damage;
        } else { this.hp = 0;}
    }

    public void getAttack(BaseHero target, int damage){
        int causedDamage = rnd.nextInt(1, damage);
        System.out.printf("%s attack %s\t", this.getInfo(), target.getClass().getSimpleName());
        System.out.printf(" Power of knock = %d\n", causedDamage);
        target.getDamage(causedDamage);
    }




    
    
}

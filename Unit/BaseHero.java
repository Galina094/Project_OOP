package Unit;

import java.util.ArrayList;
import java.util.Random;

public abstract class BaseHero implements UnitInterface {

    Random rnd = new Random();

    // hp - health point - здоровье, speed - скорость передвижения по полю, damage - урон, 
    // defence - защита

    protected int hp;
    protected int maxHp;
    protected int speed;
    protected int damage;
    protected int defence;
    protected final String name;
    protected String state;
    protected Coordinats position;     

    public Coordinats getPosition() {
        return position;
    }

    public int getHp() {
        return hp;
    }

    public String getNAME() {
        return "";
    }

    public int getSpeed() {
        return speed;
    }    


    public BaseHero(int hp, int maxHp, int speed, int damage, int defence, String name, int x, int y) {
        this.hp = hp;
        this.maxHp = maxHp;
        this.speed = speed;
        this.damage = damage;
        this.defence = defence;
        this.name = name;
        state = "Stand";
        position = new Coordinats(x, y);
    }

    // @Override
    // public String getInfo(){
    //     return String.format(" %s  Hp: %d  Speed: %d   Damage: %d   Defence: %d X: %d Y: %d State: %s" ,   
    //                                      this.name, this.hp, this.speed, this.damage, this.defence, this.position.x, this.position.y, this.state);
    // }

    @Override
    public String getInfo(){
        String outStr = String.format(" %-3s  ⚔️ %-3d  \uD83D\uDEE1 %-3d  ♥️%-3d%%  ☠️%-3d   ", 0, 0, defence,(int) hp * 100/maxHp, this.damage);
        return outStr;
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
        // System.out.printf("%s attack %s\t", this.getInfo(), target.getClass().getSimpleName());
        // System.out.printf(" Power of knock = %d\n", causedDamage);
        target.getDamage(causedDamage);
    }

    public String getDistance(int x, int y, ArrayList<BaseHero> AttacksTeam){
        String target = "";
        double b = 100;
        for (BaseHero baseHero : AttacksTeam) {
            if (!baseHero.state.equals("Die")) {
                double a = Math.sqrt(Math.pow(x - baseHero.position.x, 2) + Math.pow(y - baseHero.position.y,2));
                if (a < b) {                
                    b=a;   
                    target = baseHero.name;             
                }
                
            }
            
        }
        return target;        
    }

    






    
    
}

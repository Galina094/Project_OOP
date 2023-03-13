package Unit;

import java.util.ArrayList;

import javax.naming.directory.InvalidAttributeIdentifierException;

public abstract class Shooter_Class extends BaseHero {

    // accuracy - меткость;
    
    protected int arrovs;
    protected int accuracy;
    private int count = 0;

    public Shooter_Class(int hp, int maxHp, int speed, int damage, int defence, int arrovs, int accuracy, String name) {
        super(hp, maxHp, speed, damage, defence, name);
        this.arrovs = arrovs;
        this.accuracy = accuracy;        
    }

    @Override
    public String getInfo() {
        return String.format("%s  Arrovs: %d  Accuracy: %d", 
                            super.getInfo(), this.arrovs, this.accuracy);
    }

    @Override
    public String toString() {
        return String.format("У %s ОСТАЛОСЬ Arrovs: %d", super.getClass().getSimpleName(), this.arrovs);
    }

    // @Override
    // public String toString(){
    //     return "Осталось стрел" + String.valueOf(arrovs);
    // }

    protected int CountFarmerMen(ArrayList<BaseHero> friendly_team){
        int count = 0;
        for (BaseHero baseHero : friendly_team) {
            if (baseHero.getClass().getSimpleName().equals("FarmerMen") ) {
                count++;               
            }
        }
        System.out.println("ВСЕГО ФЕРМЕРОВ!!!" + count);        
        return count; 
    }


    @Override
    public void step(ArrayList<BaseHero> friendly_team, ArrayList<BaseHero> team2 ) {
        if (count == 0) {
            count = CountFarmerMen(friendly_team);                      
        }        
        if (this.hp > 0 && this.arrovs > 0) {        
            System.out.println("Can Shoot!");   
            for (BaseHero baseHero : team2) {
                if (baseHero.hp > 0 ) {                    
                    System.out.println(this.getClass().getSimpleName() + "Shoot in " + baseHero.getInfo());
                    this.getAttack(baseHero, damage);
                    System.out.println("=== Было стрел " + String.valueOf(this.arrovs));
                    this.arrovs -- ; 
                    System.out.println("--- Осталось стрел" + String.valueOf(this.arrovs));  
                    if (count != 0 ) {
                        this.arrovs++;
                        System.out.println("+++ Добавили стрел" + String.valueOf(this.arrovs));
                        count--;             
                    }                                      
                                                               
                    break;                                        
                }                 
            }  
             
        
            
            
            //System.out.println("+++ Осталось стрел" + String.valueOf(this.arrovs));        
        }       
        
    }
    
    
    
}

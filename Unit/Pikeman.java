package Unit;
public class Pikeman extends Warrior_Class{
    public Pikeman(String name){
        super(150, 5, 30, 30, 40, 200, 15, name);
    }

    
    @Override
    public String getInfo() {        
        return String.format("Pickeman: %s", super.getInfo());   
    } 
}

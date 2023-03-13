package Unit;
public class Pikeman extends Warrior_Class{
    public Pikeman(String name){
        super(4, 8, 4, 3, 5, 4, 6, name);
    }

    
    @Override
    public String getInfo() {        
        return String.format("Pickeman: %s", super.getInfo());   
    } 
}

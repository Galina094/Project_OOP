package Unit;
public class Pikeman extends Warrior_Class{
    public Pikeman(String name, int x, int y){
        super(4, 8, 4, 3, 5, name, x, y, 4, 6);
    }

    
    @Override
    public String getInfo() {        
        return String.format("Pickeman: %s", super.getInfo());   
    } 
}

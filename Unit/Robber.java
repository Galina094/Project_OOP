package Unit;

public class Robber extends Warrior_Class{

    public Robber(String name){
        super(10, 25, 6, 4, 3, 8, 8, name);
    }

    @Override
    public String getInfo() {        
        return String.format("Robber: %s", 
                                    super.getInfo()); 
    } 
    
}

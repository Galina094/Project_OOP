package Unit;

public class Robber extends Warrior_Class{

    public Robber(String name){
        super(150, 5, 30, 30, 40, 200, 15, name);
    }

    @Override
    public String getInfo() {        
        return String.format("Robber: %s", 
                                    super.getInfo()); 
    } 
    
}

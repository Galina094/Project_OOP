package Unit;

public class Magician extends Magical_Class {

    public Magician(String name) {
        super(30, 40, 9,5,12,1,17, name);        
    }    

    @Override
    public String getInfo() {
        return String.format("Magician: %s ", 
                                    super.getInfo());
    }

    @Override
    public String toString() {        
        return "Magician";
    }

    
    
}

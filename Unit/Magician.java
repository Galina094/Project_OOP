package Unit;

public class Magician extends Magical_Class {

    public Magician(String name) {
        super(200, 6,25,25,100,35, name);        
    }    

    @Override
    public String getInfo() {
        return String.format("Magician: %s ", 
                                    super.getInfo());
    }


    
}

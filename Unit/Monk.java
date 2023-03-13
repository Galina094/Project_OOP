package Unit;

public class Monk extends Magical_Class{
    public Monk(String name) {
        super(12, 20, 5,4,7,1,12, name);        
    }

    @Override
    public String getInfo() {
        return String.format("Monk: %s ", 
                                    super.getInfo());
    } 

    @Override
    public String toString() {        
        return "Monk";
    }
}

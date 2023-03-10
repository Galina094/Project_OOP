package Unit;

public class Monk extends Magical_Class{
    public Monk(String name) {
        super(200, 6,25,25,100,35, name);        
    }

    @Override
    public String getInfo() {
        return String.format("Monk: %s ", 
                                    super.getInfo());
    } 
}

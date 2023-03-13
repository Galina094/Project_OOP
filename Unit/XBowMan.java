package Unit;

public class XBowMan extends Shooter_Class {

    public XBowMan(String name) {
        super(10, 15, 4,3,3,16,5, name);
    }    

    @Override
    public String getInfo() {
        return String.format("XBowMan: %s ", 
                                    super.getInfo());
    }    
    
}

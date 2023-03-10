package Unit;

public class XBowMan extends Shooter_Class {

    public XBowMan(String name) {
        super(100,3,15,15,40,8, name);
    }

    @Override
    public void step() {
        System.out.println("XBowMan shoot");
        // super.step();
    }

    @Override
    public String getInfo() {
        return String.format("XBowMan: %s ", 
                                    super.getInfo());
    } 
    
}

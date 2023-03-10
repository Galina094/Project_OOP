package Unit;

public class Sniper extends Shooter_Class {

    public Sniper(String name) {
        super(100,3,15,15,40,8, name);
    }

    

    @Override
    public void step() {
        System.out.println("Sniper shoot");
        // super.step();
    }



    @Override
    public String getInfo() {
        return String.format("Sniper: %s ", 
                                    super.getInfo());
    } 

    



    
}

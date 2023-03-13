package Unit;

import java.util.ArrayList;

public class Sniper extends Shooter_Class {

    public Sniper(String name) {
        super(15, 20, 9,10,10,32,3, name);
    }  

    @Override
    public String getInfo() {
        return String.format("Sniper: %s ", 
                                    super.getInfo());
    } 

       
}

package Unit;

import java.lang.annotation.Target;
import java.util.ArrayList;

public class Coordinats {
    protected int x,y;    

    public Coordinats(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean isEquals(Coordinats coordinats){

        if(coordinats.x == this.x && coordinats.y == this.y ){return true;}
        else return false;
        
    }



    

    

    



    
}

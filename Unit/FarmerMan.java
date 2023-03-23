package Unit;

public class FarmerMan extends Farmer_Class{

    public FarmerMan(String name, int x, int y) {
        super(1, 50, 3, 1, 1, name, x, y, 10, 5);
    }    

    @Override
    public String getNAME() {        
        return "FarmerMan";
    }
    
}

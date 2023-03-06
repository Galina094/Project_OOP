import Unit.FarmerMen;
import Unit.Magician;
import Unit.Monk;
import Unit.Pikeman;
import Unit.Robber;
import Unit.Sniper;
import Unit.XBowMan;

public class Program {

    public static void main(String[] args) {

        FarmerMen farmerMen_1 = new FarmerMen();
        System.out.println(farmerMen_1.toString());

        Pikeman pikeman_1 = new Pikeman();
        Robber robber_1 = new Robber();

        Sniper sniper_1 = new Sniper();
        XBowMan xBowMan_1 = new XBowMan();

        Magician magician_1 = new Magician();
        Monk monk_1 = new Monk();
        
    }
}
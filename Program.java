import java.util.ArrayList;
import java.util.Random;

import Unit.BaseHero;
import Unit.FarmerMen;
import Unit.Magician;
import Unit.Monk;
import Unit.Names;
import Unit.Pikeman;
import Unit.Robber;
import Unit.Sniper;
import Unit.XBowMan;

 // Добавить файл с описанием интерфейса. В котором описать два метода, void step(); 
 // и String getInfo(); Реализовать интерфейс в абстрактном классе и в наследниках так, 
 // чтобы getInfo возвращал тип персонажа. Создать два списка в классе main. В каждый из 
 // списков добавить по десять экземнляров наследников BaseHero. Удалить ненужные методы 
 // из абстрактного класса, если такие есть. В main пройти по спискам и вызвать у всех 
 // персонажей getInfo.

public class Program {

    public static void main(String[] args) {       

        // FarmerMen farmerMen_1 = new FarmerMen(getName());
        // System.out.println(farmerMen_1.toString());

        // Pikeman pikeman_1 = new Pikeman();
        // Robber robber_1 = new Robber(null);

        // Sniper sniper_1 = new Sniper(null);
        // XBowMan xBowMan_1 = new XBowMan();

        // Magician magician_1 = new Magician();
        // Monk monk_1 = new Monk();

        ArrayList<BaseHero> team1 = new ArrayList<>();
        ArrayList<BaseHero> team2 = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            switch (new Random().nextInt(7)) {
                case 0:
                    team1.add(new FarmerMen(getName()));                    
                    break;
                case 1:
                    team1.add(new Magician(getName()));
                    break;
                case 2:
                    team1.add(new Monk(getName()));
                    break;
                case 3:
                    team1.add(new Pikeman(getName()));
                    break;
                case 4:
                    team1.add(new Robber(getName()));
                    break;
                case 5:
                    team1.add(new Sniper(getName()));
                    break;
                default:
                    team1.add(new XBowMan(getName()));
                    break;
            }

            switch (new Random().nextInt(7)) {
                case 0:
                    team2.add(new FarmerMen(getName()));                    
                    break;
                case 1:
                    team2.add(new Magician(getName()));
                    break;
                case 2:
                    team2.add(new Monk(getName()));
                    break;
                case 3:
                    team2.add(new Pikeman(getName()));
                    break;
                case 4:
                    team2.add(new Robber(getName()));
                    break;
                case 5:
                    team2.add(new Sniper(getName()));
                    break;
                default:
                    team2.add(new XBowMan(getName()));
                    break;
            }
            
        }                 

        team1.forEach(u -> u.getNAME());
        team2.forEach(u -> u.getNAME());

        
        System.out.println("!!! Team1 !!!");
        for (int i = 0; i < team1.size(); i++) {
            System.out.println(team1.get(i).getInfo());                                 
        }  
        
        System.out.println("------------------------");
        System.out.println("!!! Team2 !!!");
        for (int i = 0; i < team1.size(); i++) {
            System.out.println(team1.get(i).getInfo());                                 
        }  

        
        
        //System.out.printf(team1.forEach(u -> u.getInfo()));

        
    }

    private static String getName(){        
        return Names.values()[new Random().nextInt(Names.values().length)].toString();
    }
}
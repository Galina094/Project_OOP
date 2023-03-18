import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

import Unit.BaseHero;
import Unit.FarmerMan;
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

    public static final int UNIT = 10;

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
        ArrayList<BaseHero> joinTeam = new ArrayList<>();

        for (int i = 0; i < UNIT; i++) {
            switch (new Random().nextInt(7)) {
                case 0:
                    team1.add(new FarmerMan(getName(), 1, i+1));                    
                    break;
                case 1:
                    team1.add(new Magician(getName(), 1, i+1));
                    break;
                case 2:
                    team1.add(new Monk(getName(), 1, i+1));
                    break;
                case 3:
                    team1.add(new Pikeman(getName(), 1, i+1));
                    break;
                case 4:
                    team1.add(new Robber(getName(), 1, i+1));
                    break;
                case 5:
                    team1.add(new Sniper(getName(), 1, i+1));
                    break;
                default:
                    team1.add(new XBowMan(getName(), 1, i+1));
                    break;
            }

            switch (new Random().nextInt(7)) {
                case 0:
                    team2.add(new FarmerMan(getName(), 10, i+1));                    
                    break;
                case 1:
                    team2.add(new Magician(getName(), 10, i+1));
                    break;
                case 2:
                    team2.add(new Monk(getName(), 10, i+1));
                    break;
                case 3:
                    team2.add(new Pikeman(getName(), 10, i+1));
                    break;
                case 4:
                    team2.add(new Robber(getName(), 10, i+1));
                    break;
                case 5:
                    team2.add(new Sniper(getName(), 10, i+1));
                    break;
                default:
                    team2.add(new XBowMan(getName(), 10, i+1));
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
            System.out.println(team2.get(i).getInfo());                                 
        } 

        joinTeam.addAll(team1);
        joinTeam.addAll(team2);

        joinTeam.sort(new Comparator<BaseHero>() {
            @Override
            public int compare (BaseHero h1, BaseHero h2){
                if (h1.getSpeed() == h2.getSpeed())
                    return 0;
                else if (h1.getSpeed() > h2.getSpeed())
                    return 1;
                else return -1;

            }
        });

        // System.out.println("!!! Sorted_Join_Team !!!");
        // for (int i = 0; i < joinTeam.size(); i++) {
        //     System.out.println(joinTeam.get(i).getInfo());                                 
        // }

        team1.forEach(u -> u.step(team1, team2)); // вызов step у всех, кто записан в этом списке. Всем,
        // кто в team1 находится будет передавться team2, т.е. у каждого из них будет вызываться 
        // метод step и в параметре будет передавться team2. team1 - своя команда, team2 - вражеская
              
               
    }

    private static String getName(){        
        return Names.values()[new Random().nextInt(Names.values().length)].toString();
    }

    

    

}
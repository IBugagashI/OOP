package OOP.ItogDZ.presenter;

import java.util.ArrayList;

import OOP.ItogDZ.model.armors.*;
import OOP.ItogDZ.model.base.HeroBase;
import OOP.ItogDZ.model.charaters.heroes.Archer;
import OOP.ItogDZ.model.charaters.heroes.Magician;
import OOP.ItogDZ.model.charaters.heroes.Warrior;
import OOP.ItogDZ.model.weapons.*;

public class Arena {

    static ArrayList<HeroBase> heroes = new ArrayList<>();
    {
        heroes.add(new Warrior(new Sword(), new IronArmor()));
        heroes.add(new Magician(new WizardsStaff(), new RagArmor()));
        heroes.add(new Archer(new Bow(), new LeatherArmor()));
    }

    public void showAll(){
        int index = 0;
        for (HeroBase heroes : heroes) {
            System.out.printf("Позиция в списке %d\n", index +1);
            System.out.println(heroes);
            System.out.println("-----------------------------@------------------------------");
            index++;
        }

    }

    public void Fight(int input, int input2) {
        HeroBase fighterOne = heroes.get(input);
        HeroBase fighterTwo = heroes.get(input2);
        int round = 1;
        while (fighterOne.getHealth() > 0 && fighterTwo.getHealth() > 0) {
                    System.out.println("------------------Раунд: " + round + "------------------");
                    System.out.printf("%s Бъёт %s на ", fighterOne.getName(), fighterTwo.getName());
                    fighterOne.attack(fighterTwo);
                    System.out.printf("%s Бъёт %s на ", fighterTwo.getName(), fighterOne.getName());
                    fighterTwo.attack(fighterOne);
                    System.out.printf("Здоровье бойцов по окончанию раунда %d: \n%s - %d\n%s - %d\n", round, fighterOne.getName(), fighterOne.getHealth(), fighterTwo.getName(), fighterTwo.getHealth());
                    round++;
                }
                if(fighterOne.getHealth() == 0)
                    System.out.println("Победил "  + fighterTwo.getName());
                else
                    System.out.println("Победил " + fighterOne.getName());
    }
}
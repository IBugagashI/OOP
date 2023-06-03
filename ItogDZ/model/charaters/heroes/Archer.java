package OOP.ItogDZ.model.charaters.heroes;

import OOP.ItogDZ.model.armors.LeatherArmor;
import OOP.ItogDZ.model.charaters.Figter;
import OOP.ItogDZ.model.weapons.Bow;

public class Archer extends Figter {

    public Archer(Bow weapon, LeatherArmor armor) {
        super("Лучник","Индеец \"Вялая тетива\"", weapon, armor);
    }

    public void setBow(Bow weapon){ //Вроде должен проверять, тому ли классу вручается оружие или нет. Пока смотрица "ни к селу ни к городу"
        if(weapon.getClass().getSimpleName().equals("Bow"));
        this.weapon = weapon;
    }
}
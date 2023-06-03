package OOP.ItogDZ.model.charaters.heroes;

import OOP.ItogDZ.model.armors.IronArmor;
import OOP.ItogDZ.model.charaters.Figter;
import OOP.ItogDZ.model.weapons.Sword;


public class Warrior extends Figter {
    public Warrior(Sword weapon, IronArmor armor) {
        super("Воин", "Алёша Попович", weapon, armor);
    }
}
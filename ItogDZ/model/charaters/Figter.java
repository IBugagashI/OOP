package OOP.ItogDZ.model.charaters;

import OOP.ItogDZ.model.base.Armor;
import OOP.ItogDZ.model.base.HeroBase;
import OOP.ItogDZ.model.base.Weapon;

public abstract class Figter extends HeroBase {

    public Figter(String claSS, String name, Weapon weapon, Armor armor) {
        super(claSS, name, weapon, armor);
        this.name = name;
    }

    @Override
    public String toString(){
        return super.toString() + String.format("\nИмя: %s\nОружие: %s\nБроня: %s\n", name, weapon, armor);
    }
}
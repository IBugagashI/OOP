package OOP.ItogDZ.model.charaters.heroes;

import OOP.ItogDZ.model.armors.RagArmor;
import OOP.ItogDZ.model.charaters.Figter;
import OOP.ItogDZ.model.weapons.WizardsStaff;

public class Magician extends Figter {
    public Magician(WizardsStaff weapon, RagArmor armor) {
        super("Маг", "Саша \"Белый\"", weapon, armor);
    }
}

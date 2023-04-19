package OOP.DZ.SuccessorClasses;

import OOP.DZ.Classes.Hygiene;

public class ToiletPaper extends Hygiene{
    private int strata;

    public ToiletPaper(String name, double price, int quantity, String measureUnit, int inPack, int strata){
        super(name, price, quantity, measureUnit, inPack);
        this.strata = strata;
    }

    @Override
    public String toString(){
        return super.toString() + String.format("\nКоличество в упаковке: %d\nКоличество слоёв: %d", InPack(), strata);
    }
}

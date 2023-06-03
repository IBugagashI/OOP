package OOP.ItogDZ.model.base;

public abstract class Armor {//Weapon
    public Armor(String name, int armor) {
        this.name = name;
        this.armor = armor;
    }
    public int getArmor() {
        return armor;
    }
    public String getName() {
        return name;
    }
    private int armor;
    private String name;

    @Override
    public String toString() {
        return String.format("\n(O)Наименование: %s\n(O)Защита: %d",getName(), getArmor());
    }
}
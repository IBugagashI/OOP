package OOP.ItogDZ.model.base;

public abstract class Weapon {
    public Weapon(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }
    public int getDamage() {
        return damage;
    }
    public String getName() {
        return name;
    }
    private int damage;
    private String name;

    @Override
    public String toString() {
        return String.format("\n<O>Наименование: %s\n<O>Максимальный урон: %d",getName(), getDamage());
    }
}
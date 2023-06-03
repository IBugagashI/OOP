package OOP.ItogDZ.model.base;

import java.util.Random;

/*
Базовый класс персонажа
*/
public abstract class HeroBase {
    private String claSS;

    public HeroBase(String claSS, String name, Weapon weapon, Armor armor) {
        this.claSS = claSS;
        this.name = name;
        this.weapon = weapon;
        this.armor = armor;
        health = 100;
    }

    public Weapon getWeapon(){
        return weapon;
    }    

    public Armor getArmor() {
        return armor;
    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }

    protected String name;
    protected Armor armor;
    protected Weapon weapon;
    private int health;

    public void setDamage(int damage) {
        if (damage >= this.health)
            this.health = 0;
        else
            this.health -= damage;
    }

    @Override
    public String toString() {
        return claSS + "(Здоровье = " + health + ")";
    }

    public void attack(HeroBase target) {
        Random rnd = new Random();
        int damage = rnd.nextInt(weapon.getDamage());
        target.setDamage(damage);
        if(damage == 0) System.out.println("ПРОМАХ!!! Какая досада");
        else System.out.println(damage);
    }

}
package models;

public class Attack {
    //this is a enum created in the same file
    // (this is new for us, we investigated and see codes in github that implement this)
    public enum DamageType {
        PHYSICAL, SPECIAL
    }

    private String name;
    private DamageType damageType;
    private int power;

    //builder
    public Attack(String name, String type, String damageType, int power) {
        this.name = name;
        this.damageType = DamageType.valueOf(damageType.toUpperCase());
        this.power = power;
    }

    // Getters
    public String getName() {
        return name;
    }

    public DamageType getDamageType() {
        return damageType;
    }

    public int getPower() {
        return power;
    }

    // Display
    @Override
    public String toString() {
        return name + " | " + damageType + " | Power: " + power;
    }
}


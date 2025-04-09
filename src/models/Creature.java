package models;

public abstract class Creature {
    protected String type;
    protected int healthPoints;

    public Creature(String type, int healthPoints) {
        this.type = type;
        this.healthPoints = healthPoints;
    }

    public String getType() {
        return type;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public void receiveDamage(int damage) {
        this.healthPoints = Math.max(0, this.healthPoints - damage);
    }

    public boolean isAlive() {
        return this.healthPoints > 0;
    }


}

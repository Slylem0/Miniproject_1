package models;

import models.names.Name;

public class Pokemon {
    private Name name;
    private String type;
    private int healthPoints;

    // Constructor
    public Pokemon(Name name, int healthPoints) {
        this.name = name;
        this.type = name.getType(); // Tipo obtenido directamente desde el enum
        this.healthPoints = healthPoints;
    }

    // Getters
    public Name getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    // Setters
    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    // Recibir daño
    public void receiveDamage(int damage) {
        this.healthPoints -= damage;
        if (this.healthPoints < 0) {
            this.healthPoints = 0;
        }
    }

    // Comprobar si sigue vivo
    public boolean isAlive() {
        return this.healthPoints > 0;
    }
}

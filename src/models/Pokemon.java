package models;

import models.names.Name;

import java.lang.reflect.Array;
import java.util.List;

public class Pokemon {

    private Name name;
    private String type;
    private int healthPoints;
    private Array attacks;

    //Builder
    public Pokemon(Name name, String type, int healthPoints, Array attacks){
        this.name = name;
        this.type = type;
        this.healthPoints = healthPoints;
        this.attacks = attacks;
    }


    //Getters and Setters :D
    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHealthPoints() {
        return this.healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public Array getAttacks() {
        return this.attacks;
    }

    public void setAttacks(Array attacks) {
        this.attacks = attacks;
    }
}

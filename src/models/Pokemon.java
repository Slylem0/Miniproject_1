package models;

import models.names.Name;
import java.util.ArrayList;
import java.util.List;

public class Pokemon extends Creature {
    private Name name;
    private List<Attack> attacks;

    public Pokemon(Name name, int healthPoints) {
        super(name.getType(), healthPoints);
        this.name = name;
        this.attacks = new ArrayList<>();
    }

    public Name getName() {
        return name;
    }

    public List<Attack> getAttacks() {
        return attacks;
    }

    public boolean addAttack(Attack attack) {
        if (attacks.size() < 4) {
            attacks.add(attack);
            return true;
        }
        return false;
    }




    //print the attacks
    public void displayAttacks() {
        if (attacks.isEmpty()) {
            System.out.println(name + " has no attacks.");
        } else {
            System.out.println("Attacks of " + name + ":");
            for (Attack attack : attacks) {
                System.out.println("- " + attack);
            }
        }
    }
}

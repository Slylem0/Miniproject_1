package models;

import java.util.ArrayList;
import java.util.List;

public class Trainer {
    private String name;
    private List<Pokemon> team;

    public Trainer(String name) {
        this.name = name;
        this.team = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Pokemon> getTeam() {
        return team;
    }

    public void addPokemon(Pokemon pokemon) {
        if (team.size() < 3) {
            team.add(pokemon);
        } else {
            System.out.println("Team already has 3 Pokémon.");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Trainer: ").append(name).append("\n");
        sb.append("Team:\n");
        for (Pokemon p : team) {
            sb.append("- ").append(p.getName()).append(" (Type: ").append(p.getType()).append(", HP: ").append(p.getHealthPoints()).append(")\n");
        }
        return sb.toString();
    }
}
package models;

import java.util.ArrayList;
import java.util.List;

public class Trainer {
    private String name;
    private List<Pokemon> team;

    public Trainer(String name) {
        this.name = name;
        this.team = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Pokemon> getTeam() {
        return team;
    }

    public void addPokemon(Pokemon pokemon) {
        if (team.size() < 3) {
            team.add(pokemon);
        } else {
            System.out.println("Team already has 3 Pokémon.");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Trainer: ").append(name).append("\n");
        sb.append("Team:\n");
        for (Pokemon p : team) {
            sb.append("- ").append(p.getName()).append(" (Type: ").append(p.getType()).append(", HP: ").append(p.getHealthPoints()).append(")\n");
        }
        return sb.toString();
    }
}


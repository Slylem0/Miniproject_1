package models;

import models.names.AttackName;
import models.names.Name;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TeamBuilder {

    public static void createTeam(Scanner scanner, Trainer trainer) {
        System.out.println("Trainer: " + trainer.getName());

        for (int i = 0; i < 3; i++) {
            System.out.println("- Choose Pokémon " + (i + 1));
            Name[] names = Name.values();
            for (int j = 0; j < names.length; j++) {
                System.out.println((j + 1) + ". " + names[j]);
            }

            int choice = scanner.nextInt();
            Name selectedName = names[choice - 1];
            String type = selectedName.getType();

            System.out.print("Enter HP for " + selectedName + ": ");
            int hp = scanner.nextInt();

            List<AttackName> availableAttacks = getAttacksByType(type);
            System.out.println("\nAvailable attacks for type: " + type);
            for (int j = 0; j < availableAttacks.size(); j++) {
                AttackName a = availableAttacks.get(j);
                System.out.println((j + 1) + ". " + a.getAttackName() + " (Power: " + a.getPower() + ", Type: " + a.getDamageType() + ")");
            }

            List<Attack> selectedAttacks = new ArrayList<>();
            System.out.println("Choose 4 attacks by number:");
            for (int j = 0; j < 4; j++) {
                System.out.print("Attack " + (j + 1) + ": ");
                int attackIndex = scanner.nextInt() - 1;
                while (attackIndex < 0 || attackIndex >= availableAttacks.size()) {
                    System.out.print("Invalid choice. Choose again: ");
                    attackIndex = scanner.nextInt() - 1;
                }
                AttackName chosen = availableAttacks.get(attackIndex);
                selectedAttacks.add(new Attack(
                        chosen.getAttackName(),
                        chosen.getType(),
                        chosen.getDamageType(),
                        chosen.getPower()
                ));
                availableAttacks.remove(attackIndex);
            }

            Pokemon pokemon = new Pokemon(selectedName, hp);
            for (Attack a : selectedAttacks) {
                pokemon.addAttack(a);
            }

            trainer.addPokemon(pokemon);
        }
    }

    public static void generateRandomTeam(Trainer trainer) {
        Random random = new Random();
        Name[] allNames = Name.values();

        for (int i = 0; i < 3; i++) {
            Name randomName = allNames[random.nextInt(allNames.length)];
            String type = randomName.getType();
            int hp = 100 + random.nextInt(101);

            List<AttackName> attacksByType = getAttacksByType(type);
            Collections.shuffle(attacksByType);

            List<Attack> selectedAttacks = new ArrayList<>();
            for (int j = 0; j < 4 && j < attacksByType.size(); j++) {
                AttackName attack = attacksByType.get(j);
                selectedAttacks.add(new Attack(
                        attack.getAttackName(),
                        attack.getType(),
                        attack.getDamageType(),
                        attack.getPower()
                ));
            }

            Pokemon pokemon = new Pokemon(randomName, hp);
            for (Attack a : selectedAttacks) {
                pokemon.addAttack(a);
            }

            trainer.addPokemon(pokemon);
        }
    }

    private static List<AttackName> getAttacksByType(String type) {
        List<AttackName> filtered = new ArrayList<>();
        for (AttackName attack : AttackName.values()) {
            if (attack.getType().equalsIgnoreCase(type)) {
                filtered.add(attack);
            }
        }
        return filtered.subList(0, Math.min(7, filtered.size()));
    }
}


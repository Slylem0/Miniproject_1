package models;


import java.util.List;
import java.util.Scanner;

public class Battle {

    public static void startBattle(Trainer t1, Trainer t2, Scanner scanner) {
        System.out.println("\n--- Pokémon Battle ---");

        // Choose Pokémon
        Pokemon p1 = choosePokemon(t1, scanner);
        Pokemon p2 = choosePokemon(t2, scanner);

        System.out.println(t1.getName() + " chose " + p1.getName());
        System.out.println(t2.getName() + " chose " + p2.getName());

        // The one with less HP starts
        boolean p1First = p1.getHealthPoints() <= p2.getHealthPoints();

        while (p1.getHealthPoints() > 0 && p2.getHealthPoints() > 0) {
            if (p1First) {
                doTurn(p1, p2, scanner);
                if (p2.getHealthPoints() <= 0) break;
                doTurn(p2, p1, scanner);
            } else {
                doTurn(p2, p1, scanner);
                if (p1.getHealthPoints() <= 0) break;
                doTurn(p1, p2, scanner);
            }
        }

        // Result
        if (p1.getHealthPoints() <= 0) {
            System.out.println(p1.getName() + " fainted. " + t2.getName() + " wins!");
        } else {
            System.out.println(p2.getName() + " fainted. " + t1.getName() + " wins!");
        }
    }

    private static Pokemon choosePokemon(Trainer trainer, Scanner scanner) {
        System.out.println("\n" + trainer.getName() + ", choose your Pokémon:");
        List<Pokemon> team = trainer.getTeam();
        for (int i = 0; i < team.size(); i++) {
            System.out.println((i + 1) + ". " + team.get(i).getName());
        }
        int choice = scanner.nextInt();
        return team.get(choice - 1);
    }

    private static void doTurn(Pokemon attacker, Pokemon defender, Scanner scanner) {
        System.out.println("\n" + attacker.getName() + " will attack.");
        List<Attack> attacks = attacker.getAttacks();
        for (int i = 0; i < attacks.size(); i++) {
            System.out.println((i + 1) + ". " + attacks.get(i).getName() + " (Power: " + attacks.get(i).getPower() + ")");
        }
        int choice = scanner.nextInt();
        Attack attack = attacks.get(choice - 1);

        double power = attack.getPower();
        if (hasAdvantage(attack.getType(), defender.getType())) {
            power *= 1.3;
            System.out.println("Type advantage! Damage increased by 30%.");
        }

        int newHp = defender.getHealthPoints() - (int) power;
        defender.setHealthPoints(Math.max(newHp, 0));

        System.out.println(attacker.getName() + " used " + attack.getName());
        System.out.println(defender.getName() + " has " + defender.getHealthPoints() + " HP left.");
    }

    private static boolean hasAdvantage(String attackType, String defenderType) {
        return switch (attackType) {
            case "Fire" -> defenderType.equals("Grass") || defenderType.equals("Steel");
            case "Water" -> defenderType.equals("Fire");
            case "Grass" -> defenderType.equals("Water");
            case "Electric" -> defenderType.equals("Water");
            case "Psychic" -> defenderType.equals("Fighting");
            case "Fighting" -> defenderType.equals("Dark") || defenderType.equals("Steel");
            case "Dark" -> defenderType.equals("Psychic");
            case "Steel" -> defenderType.equals("Dragon");
            case "Dragon" -> defenderType.equals("Dragon");
            default -> false;
        };
    }
}


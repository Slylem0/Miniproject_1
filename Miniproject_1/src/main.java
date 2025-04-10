import models.Trainer;
import models.TeamBuilder;
import models.Battle;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Trainer 1
        System.out.print("Enter name for Trainer 1: ");
        String name1 = scanner.nextLine();
        Trainer trainer1 = new Trainer(name1);

        System.out.print("Do you want to generate a random team for " + name1 + "? (yes/no): ");
        String choice1 = scanner.nextLine();
        if (choice1.equalsIgnoreCase("yes")) {
            TeamBuilder.generateRandomTeam(trainer1);
        } else {
            TeamBuilder.createTeam(scanner, trainer1);
        }

        // Trainer 2
        System.out.print("\nEnter name for Trainer 2: ");
        String name2 = scanner.nextLine();
        Trainer trainer2 = new Trainer(name2);

        System.out.print("Do you want to generate a random team for " + name2 + "? (yes/no): ");
        String choice2 = scanner.nextLine();
        if (choice2.equalsIgnoreCase("yes")) {
            TeamBuilder.generateRandomTeam(trainer2);
        } else {
            TeamBuilder.createTeam(scanner, trainer2);
        }

        // Display teams
        System.out.println("\n--- Trainer Teams ---");
        System.out.println(trainer1);
        System.out.println(trainer2);

        // Start battle
        Battle.startBattle(trainer1, trainer2, scanner);
    }
}


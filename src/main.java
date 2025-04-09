import models.Attack;
import models.Creature;
import models.Pokemon;
import models.Attack.DamageType;
import models.names.AttackName;
import models.names.Name;

import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Select Pokémon
        System.out.println("Select a Number for choose a pokemon :D");

        Name[] names = Name.values();
        for (int i = 0; i < names.length; i++) {
            System.out.println((i + 1) + ". " + names[i]);
        }

        System.out.println("Select a Number for choose a pokemon :D");
        int choice = scanner.nextInt();
        Name selectedName = names[choice - 1];
        String pokemonType = selectedName.getType();

        // Step 2: Enter HP
        System.out.print("Enter health points for " + selectedName + ": ");
        int hp = scanner.nextInt();

        // Step 3: Show 7 attacks of the selected type
        List<AttackName> availableAttacks = getAttacksByType(pokemonType);
        System.out.println("\nAvailable attacks for type: " + pokemonType);
        for (int i = 0; i < availableAttacks.size(); i++) {
            AttackName a = availableAttacks.get(i);
            System.out.println((i + 1) + ". " + a.getAttackName() + " (Power: " + a.getPower() + ", Type: " + a.getDamageType() + ")");
        }

        // Step 4: User selects 4 attacks
        List<Attack> selectedAttacks = new ArrayList<>();
        System.out.println("\nChoose 4 attacks by number:");
        for (int i = 0; i < 4; i++) {

            System.out.print("Attack " + (i + 1) + ": ");
            int attackIndex = scanner.nextInt() - 1;

            // Validar selección
            while (attackIndex < 0 || attackIndex >= availableAttacks.size()) {
                System.out.print("Invalid choice. Choose again: ");
                attackIndex = scanner.nextInt() - 1;
            }

            // Seleccionar ataque y removerlo de los disponibles
            AttackName chosen = availableAttacks.get(attackIndex);
            selectedAttacks.add(new Attack(
                    chosen.getAttackName(),
                    chosen.getType(),
                    chosen.getDamageType(),
                    chosen.getPower()
            ));
            availableAttacks.remove(attackIndex); // Elimina el ataque elegido
        }


        // Step 5: Create Pokémon and assign attacks
        Pokemon pokemon = new Pokemon(selectedName, hp);
        for (Attack a : selectedAttacks) {
            pokemon.addAttack(a);
        }

        // Step 6: Show result
        System.out.println("\nYour Pokémon is ready:");
        System.out.println("Name: " + pokemon.getName());
        System.out.println("Type: " + pokemon.getType());
        System.out.println("HP: " + pokemon.getHealthPoints());
        pokemon.displayAttacks();
    }

    // Function to get 7 attacks by type
    public static List<AttackName> getAttacksByType(String type) {
        List<AttackName> filtered = new ArrayList<>();
        for (AttackName attack : AttackName.values()) {
            if (attack.getType().equalsIgnoreCase(type)) {
                filtered.add(attack);
            }
        }
        return filtered.subList(0, Math.min(7, filtered.size()));
    }
}


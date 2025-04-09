import models.Pokemon;
import models.names.Name;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Mostrar la lista de Pokémon disponibles
        System.out.println("Selecciona un Pokémon de la siguiente lista:");
        Name[] allNames = Name.values();
        for (int i = 0; i < allNames.length; i++) {
            System.out.println((i + 1) + ". " + allNames[i]);
        }

        // Leer la elección del usuario
        System.out.print("Ingresa el número del Pokémon que quieres: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consumir salto de línea

        // Validar elección
        if (choice < 1 || choice > allNames.length) {
            System.out.println("Opción inválida.");
            return;
        }

        Name selectedName = allNames[choice - 1];
        System.out.println("Has seleccionado: " + selectedName);

        // Leer HP
        System.out.print("Ingresa los puntos de salud (HP): ");
        int hp = scanner.nextInt();

        // Crear el Pokémon
        Pokemon userPokemon = new Pokemon(selectedName, hp);

        // Mostrar resumen
        System.out.println("\nTu Pokémon ha sido creado:");
        System.out.println("Nombre: " + userPokemon.getName());
        System.out.println("Tipo: " + userPokemon.getType());
        System.out.println("HP: " + userPokemon.getHealthPoints());
    }
}


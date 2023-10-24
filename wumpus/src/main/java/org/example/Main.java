package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Üdvözöllek a Wumplusz játékban!");
        System.out.print("Kérem, add meg a játékos nevét: ");

        String jatekosNev = scanner.nextLine();

        while (true) {
            System.out.println("Üdvözöllek a Wumplusz játékban!"+jatekosNev);
            System.out.println("\nFőmenü:");
            System.out.println("1. Pályaszerkesztés");
            System.out.println("2. Mentés");
            System.out.println("3. Betöltés");
            System.out.println("4. Játszás");
            System.out.println("5. Kilépés");

            System.out.print("Kérem, válassz egy opciót (1-5): ");
            int valasztas = scanner.nextInt();

            switch (valasztas) {
                case 1:
                    editMap();
                    break;
                case 2:
                    saveGame();
                    break;
                case 3:
                    loadGame();
                    break;
                case 4:
                    playGame();
                    break;
                case 5:
                    System.out.println("Viszontlátás!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Érvénytelen választás. Kérem, válassz 1-5 között!");
            }
        }
    }

    public static void editMap() {
        // Pályaszerkesztés
        System.out.println("Pályaszerkesztés opció kiválasztva.");
    }

    public static void saveGame() {
        // Mentés
        System.out.println("Mentés opció kiválasztva.");
    }

    public static void loadGame() {
        // Betöltés
        System.out.println("Betöltés opció kiválasztva.");
    }

    public static void playGame() {
        // Játékmenet
        System.out.println("Játszás opció kiválasztva.");
    }
}



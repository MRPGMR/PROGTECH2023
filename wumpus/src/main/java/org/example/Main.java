package org.example;

import java.awt.*;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Üdvözöllek a Wumpusz játékban!");
        System.out.print("Kérem, add meg a játékos nevét: ");
        String jatekosNev = scanner.nextLine();
        while (true) {
            System.out.println("Üdvözöllek a Wumplusz játékban " + jatekosNev + "!");
            System.out.println("\nFőmenü:");
            System.out.println("1. Pályaszerkesztés");
            System.out.println("2. Fájl beolvasás");
            System.out.println("3. Adatbázisból betöltés");
            System.out.println("3. Adatbázisba mentés");
            System.out.println("5. Játszás");
            System.out.println("6. Kilépés");
            System.out.print("Kérem, válassz egy opciót (1-5): ");
            int valasztas = scanner.nextInt();
            switch (valasztas) {
                case 1:
                    Szerkesztes();
                    break;
                case 2:
                    palyabeolvaso palya = new palyabeolvaso("src/main/resources/wumpuszinput.txt");
                    System.out.println("A beolvasott pálya:");
                    palya.palyakiiratas(palya.getPalya());
                    System.out.println("A kezdőkoorináták:");
                    System.out.println(palya.kezdopont[0]+";"+palya.kezdopont[1]);
                    System.out.println("A kezdő irány:");
                    System.out.println(palya.getIrany());
                    break;
                case 3:
                    Betoltes();
                    break;
                case 4:
                    Mentes();
                    break;
                case 5:
                    Jatszas();
                    break;
                case 6:
                    System.out.println("Viszontlátás!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Érvénytelen választás. Kérem, válassz 1-5 között!");
            }
        }
    }

    public static void Szerkesztes() {
        // Pályaszerkesztés
        System.out.println("Pályaszerkesztés opció kiválasztva.");
        System.out.printf("Még nincs kész ez a funkció");
    }

    public static void Beolvasas(String palya) {
        // Beolvasass
        System.out.println("Beolvasás opció kiválasztva.");
    }

    public static void Mentes() {
        // Mentés
        System.out.println("Mentés opció kiválasztva.");
        System.out.println("Még nincs kész ez a funkció");
    }

    public static void Betoltes() {
        // Betöltés
        System.out.println("Betöltés opció kiválasztva.");
        System.out.println("Még nincs kész ez a funkció");
    }

    public static void Jatszas() {
        // Játék
        System.out.println("Játszás opció kiválasztva.");
        System.out.println("Még nincs kész ez a funkció");
    }
}

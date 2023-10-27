package org.example;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

public class palyabeolvaso {
    char palya[][];
    String kezdopont[];
    private char irany;
    private int palyameret;

    
    public palyabeolvaso(String file) {
        try {
            RandomAccessFile bemenet = new RandomAccessFile(file, "r");
            String elsosor[] = bemenet.readLine().split(" ");
            this.palyameret = Integer.parseInt(elsosor[0]);
            this.kezdopont = new String[2];
            this.kezdopont[0] = elsosor[1];
            this.kezdopont[1] = elsosor[2];
            this.irany = elsosor[3].charAt(0);
            this.palya = new char[palyameret][palyameret];
            List<String> lista = new ArrayList<>();

            for (int i = 1; bemenet.getFilePointer() < bemenet.length(); i++) {
                lista.add(bemenet.readLine());
            }

            for (int i = 0; i < lista.size(); i++) {
                for (int j = 0; j < palyameret; j++) {
                    this.palya[i][j] = lista.get(i).charAt(j);
                }
            }

            bemenet.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public char[][] getPalya() {
        return palya;
    }

    public String []getKezdopont() {
        return kezdopont;

    }

    public void setKezdopont(String[] kezdopont) {
        this.kezdopont = kezdopont;
    }

    public char getIrany() {
        return irany;
    }

    public void setIrany(char irany) {
        this.irany = irany;
    }

    public void palyakiiratas(char palya[][]) {
        for (int i = 0; i < palya.length; i++) {
            for (int j = 0; j < palyameret; j++) {
                System.out.print(palya[i][j]);
            }
            System.out.print("\n");
        }
    }
}

package org.example;

import java.io.IOException;
import java.io.RandomAccessFile;

public class palyabeolvaso {
    char palya[][];
    String kezdopont[];
    private char irany;

    //wumpuszinput beolvasása
    public palyabeolvaso (String file) {
        try{
            RandomAccessFile bemenet = new RandomAccessFile(file, "r");
            String elsosor[] = bemenet.readLine().split(" ");
            int palyameret = Integer.parseInt(elsosor[0]);
            this.kezdopont[0] = elsosor[1];
            this.kezdopont[1] = elsosor[2];
            this.irany = elsosor[3].charAt(0);

            for(int i = 0; i < palyameret; i++) {
                for (int j=0; j<palyameret-1;j++) {
                    this.palya[i][j]=bemenet.readChar();
                }
            }


            bemenet.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public char[][] getPalya() {
        return palya;
    }

    public String[] getKezdopont() {
        return kezdopont;
    }

    public char getIrany() {
        return irany;
    }

    public void setIrany(char irany) {
        this.irany = irany;
    }
}
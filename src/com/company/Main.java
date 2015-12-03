package com.company;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        // liczy wszystkie znaki u¿yte w pliku.
        Scanner plik = new Scanner(Paths.get("C:\\Users\\USER\\Desktop\\java.txt"));
        String text = plik.nextLine();
        int znak = text.length();
        System.out.println("Plik sklada sie z " + znak + " zanakow");
        // liczenie s³ów w pliku
        Scanner slowa = new Scanner(Paths.get("C:\\Users\\USER\\Desktop\\java.txt"));
        int Slowa = 0;
        while (slowa.hasNext()) {
            slowa.next();
            Slowa++;
        }
        slowa.close();
        System.out.println("W pliku znajduje sie " + Slowa + " slow.");
        // program liczy znaki bia³e
        Scanner bznak = new Scanner(Paths.get("C:\\Users\\USER\\Desktop\\java.txt")).useDelimiter("[ \\s]");
        int Bznak = 0;
        while (bznak.hasNext()) {
            bznak.next();
            Bznak++;
        }
        bznak.close();
        System.out.println("Plik zawiera " + Bznak + " znakow bialych.");
        //program do liczenia znaków poza znakami bia³ymi.
        Scanner litera = new Scanner(Paths.get("C:\\Users\\USER\\Desktop\\java.txt")).useDelimiter("[^\\s]");
        int Litera = 0;
        while (litera.hasNext()) {
            litera.next();
            Litera++;
        }
        litera.close();
        System.out.println("plik zawiera " + Litera + " znakow drukowalnych.");


    }
}

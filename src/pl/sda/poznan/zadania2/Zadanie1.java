package pl.sda.poznan.zadania2;

import java.util.Scanner;

// http://www.jkozak.pl/przedmioty/java/zadania2.pdf
public class Zadanie1 {

    private static Scanner czytnik = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Podaj liczbę całkowitą dodatnią: ");
        int liczba = czytnik.nextInt();
        if (liczba < 0) {
            System.out.println("Zla wartosc. Liczba miala byc dodatnia");
        }

        for (int i = 1; i < liczba; i += 2) {
            System.out.println(i);
        }
    }
}

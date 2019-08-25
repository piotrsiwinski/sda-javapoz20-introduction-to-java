package pl.sda.poznan.zadania2;

import java.util.Scanner;

public class Zadanie5 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        System.out.println("Podawaj liczby. 0 zakonczy wpisywanie");
        int suma = 0;
        // 1. uzytkownik podaje pierwsza liczbe
        // liczba ta jest jednoczesnie najmnijesza i najwieksza liczba
        System.out.println("Podaj liczbe: ");
        int liczba = scanner.nextInt();

        // dlatego inicjalizujemy zmienne min i max podana wartoscia
        int min = liczba;
        int max = liczba;


        // w petli pobieramy kolejne wartosci
        while (liczba != 0) {
            System.out.println("Podaj liczbe: ");
            liczba = scanner.nextInt();
            suma += liczba;
            // przy kazdej nowej liczbie musimy sprawdzic czy nowa liczba nie jest wieksza od aktualnego max
            // badz mniejsza od aktualnego min
            if (liczba > max) {
                max = liczba;
            }

            if (liczba < min) {
                min = liczba;
            }

        }

        // po skonczeniu petli wykonujemy obliczenia

        System.out.println("Suma to: " + suma);
        System.out.println("Najmnijesza liczba to: " + min);
        System.out.println("Najwieksza liczba to: " + max);
        double srednia = (double) (min + max) / 2;

        System.out.println("Srednia to: " + srednia);
    }
}

package pl.sda.poznan.zadania2;

import java.util.Scanner;

public class Zadanie4 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Podawaj liczby. 0 zakonczy wpisywanie");
        int suma = 0;
        int liczba = -1;


        while (liczba != 0) {
            System.out.println("Podaj liczbe: ");
            liczba = scanner.nextInt();
            suma += liczba;
        }

        System.out.println("Suma to: " + suma);
    }
}

package pl.sda.poznan.zadania2;

import java.util.Random;
import java.util.Scanner;

public class Zadanie6 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;

        System.out.println("Losuje liczbe z przedziału 1 - 100. Spróbuj zgadnąc");
        int userNumber = -1; // inicjalizcujemy zmienna - wartosc musi byc rozna od potencjalnej wygenerowanej przez randoma

        while (userNumber != randomNumber) {

            userNumber = scanner.nextInt();
            if (userNumber > randomNumber) {
                System.out.println("Za duza wartosc. Sprobuj mniejsza...");
            } else if (userNumber < randomNumber) {
                System.out.println("Za mala wartosc. Sprobuj wieksza");
            }
        }

        System.out.println("Wygrales! Wylosowana liczba to " + randomNumber);

    }
}

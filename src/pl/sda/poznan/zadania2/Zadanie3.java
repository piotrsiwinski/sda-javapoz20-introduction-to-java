package pl.sda.poznan.zadania2;

import java.util.Scanner;

public class Zadanie3 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int liczba = scanner.nextInt();

        for (int i = 0; Math.pow(2, i) < liczba; i++) {
            System.out.println(Math.pow(2, i));
        }


    }
}

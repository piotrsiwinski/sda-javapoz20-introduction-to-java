package pl.sda.poznan.zadania1;

import java.util.Scanner;

public class FindMax {

    private static Scanner odczyt = new Scanner(System.in);

    public static int findMax(int a, int b, int c) {
        if (a > b && a > c) return a;
        else if (b > a && b > c) return b;
        else return c;
    }

    public static int findMin(int a, int b, int c) {
        if (a < b && a < c) return a;
        else if (b < a && b < c) return b;
        else return c;
    }

    public static void main(String[] args) {
        System.out.println("Podaj 3 liczby: ");
        System.out.println("Podaj 1 liczbe: ");
        int a = odczyt.nextInt();
        System.out.println("Podaj 2 liczbe: ");
        int b = odczyt.nextInt();
        System.out.println("Podaj 3 liczbe: ");
        int c = odczyt.nextInt();

        int max = findMax(a, b, c);
        System.out.println("Najwieksza liczba to: " + max);
        int min = findMin(a, b, c);
        System.out.println("Najmniejsza liczba to: " + min);

    }
}

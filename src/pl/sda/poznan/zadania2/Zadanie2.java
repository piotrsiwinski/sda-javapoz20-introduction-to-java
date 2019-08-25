package pl.sda.poznan.zadania2;

// http://www.jkozak.pl/przedmioty/java/zadania2.pdf

import java.util.Scanner;

public class Zadanie2 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Podaj 2 liczby A i B, takie, ze A < B");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a > b) {
            System.out.println("Zle dane wejsciowe! A nie moze byc wieksze od B");
        } else {
            int sum = 0;
            for (int i = a; i <= b; i++) {
                sum += i; // ten sam zapis co: sum = sum + i;
            }

            System.out.println("suma ciagu liczb od A = " + a + " do B= " + b + " wynosi: " + sum);

            ////////////// petla while
            int i = a;
            sum = 0;
            while (i <= b) {
                sum += i;
                i++;
            }
            System.out.println("suma ciagu liczb od A = " + a + " do B= " + b + " wynosi: " + sum);

            // petla do while

            i = a;
            sum = 0;
            do {
                sum += i++;
            } while (i <=b);

            System.out.println("suma ciagu liczb od A = " + a + " do B= " + b + " wynosi: " + sum);


        }
    }
}

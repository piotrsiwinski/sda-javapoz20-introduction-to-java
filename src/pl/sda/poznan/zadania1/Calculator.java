package pl.sda.poznan.zadania1;

import java.util.Scanner;

public class Calculator {

    private static Scanner odczyt = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Kalkulator");
        System.out.println("Podaj dzialanie w formacie: liczba1 operacja liczba2 ");
        System.out.println("Pamietaj o spacjach pomiedzy liczbami i znakiem operacji ");
        System.out.println("Wpisz exit aby zakonczyc program");


        while (true) {
            System.out.println("Podaj dzialanie: ");

            String dzialanie = odczyt.nextLine();
            if (dzialanie.equals("exit")) {
                break;
            }

            String[] tablica = dzialanie.split(" ");

            double a = 0;
            double b = 0;
            String operacja;
            if (tablica.length != 3){
                System.out.println("Piotr");
                continue;
            }

            try {
                a = Double.parseDouble(tablica[0]);
                operacja = tablica[1];
                b = Double.parseDouble(tablica[2]);
            } catch (NumberFormatException e) {
                System.out.println("Zly format");
                continue;
            }


            switch (operacja) {
                case "+":
                    System.out.println("Wynik to: " + (a + b));
                    break;

                case "-":
                    System.out.println("Wynik to: " + (a - b));
                    break;
                case "*":
                    System.out.println("Wynik to: " + (a * b));
                    break;
                case "/":
                    if (b == 0) {
                        System.out.println("Nie mozna dzielic przez 0");
                    } else {
                        System.out.println("Wynik to: " + (a / b));
                    }
                    break;
                default:
                    System.out.println("Bledny znak operacji...");
                    break;
            }
        }
    }

}

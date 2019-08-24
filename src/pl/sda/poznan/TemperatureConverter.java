package pl.sda.poznan;

import java.util.Scanner;

public class TemperatureConverter {
    // zadanie 1
    // http://www.jkozak.pl/przedmioty/java/zadania1.pdf

    public static double convertCelsiusToFahrenheit(double tempInC) {
        return 1.8 * tempInC + 32;
    }


    public static double convertFahrenheitToCelsius(double tempInF) {
        return (tempInF - 32) * 5 / 9;
    }


    public static void main(String[] args) {
        Scanner czytnik = new Scanner(System.in);
        System.out.println("Podaj rodzaj konwersji");
        System.out.println("1. Konwersja ze stopni Celsjusza na stopnie Fahrenheita");
        System.out.println("2. Konwersja ze stopni Fahrenheita na stopnie Celsjusza ");
        System.out.println("Twoj wybór:");
        int wybor = czytnik.nextInt();


        if (wybor == 1) {
            System.out.println("Podaj temperature w skali Celsjusza");
            double temperatura = czytnik.nextDouble();
            double temperaturaFahrenheit = convertCelsiusToFahrenheit(temperatura);
            System.out.println(temperatura + " *C to: " + temperaturaFahrenheit + " *F");
            System.out.println("Podaj temperature w skali Celsjusza");
            System.out.println(convertCelsiusToFahrenheit(temperatura));
            System.out.println(convertCelsiusToFahrenheit(temperatura));
            System.out.println(convertCelsiusToFahrenheit(temperatura));
            System.out.println(convertCelsiusToFahrenheit(temperatura));
            System.out.println(convertCelsiusToFahrenheit(temperatura));
            System.out.println(convertCelsiusToFahrenheit(temperatura));
            System.out.println(convertCelsiusToFahrenheit(temperatura));
            System.out.println(convertCelsiusToFahrenheit(temperatura));
        } else if (wybor == 2) {
            System.out.println("Podaj temperature w skali Fahrenheita");
            double temperatura = czytnik.nextDouble();
            double temperaturaCelsjusz = convertFahrenheitToCelsius(temperatura);
            System.out.println(temperatura + " *F to: " + temperaturaCelsjusz + " *C");
        } else {
            System.out.println("Zly wybor. Uruchom program jeszcze raz...");
        }


    }

}

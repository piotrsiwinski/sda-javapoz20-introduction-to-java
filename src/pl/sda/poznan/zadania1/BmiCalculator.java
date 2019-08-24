package pl.sda.poznan.zadania1;

import java.util.Scanner;

public class BmiCalculator {
    private static Scanner czytnik = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Podaj swoj wzrost w metrach");
        float wzrost = czytnik.nextFloat();
        System.out.println("Podaj swoja wage w kg");
        float waga = czytnik.nextFloat();
        float bmi = waga / (float) Math.pow(wzrost, 2);
        // 2 wersja obliczania bmi (bez funkcji pow):
        // float bmi = waga / (wzrost * wzrost);

        System.out.println(String.format("Twoje BMI to: %.2f", bmi));

        if (bmi < 18.5) {
            System.out.println("Niedowaga");
        } else if (bmi >= 18.5 && bmi < 24.5) {
            System.out.println("Waga ok");
        } else if (bmi >= 24.5 && bmi < 27) {
            System.out.println("Nadwaga");
        } else if (bmi >= 27 && bmi < 29) {
            System.out.println("Otylosc I stopnia");
        }

    }
}

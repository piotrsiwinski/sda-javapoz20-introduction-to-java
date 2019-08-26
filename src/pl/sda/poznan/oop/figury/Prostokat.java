package pl.sda.poznan.oop.figury;

public class Prostokat {
    private double bokA;
    private double bokB;


    // konstruktor domyslny, bezparametrowy
    public Prostokat() {
        System.out.println("tworze nowy obiekt...");
    }

    public Prostokat(double a, double b) {
        // parametry nazywaja sie inaczej niz pola
        // wiec nie potrzebujemy slowka this
        // choc mozemy go uzyc
        this.bokA = a;
        bokB = b;
        System.out.println("Tworze prostokat o wymiarach: " + bokA + " x " + bokB);
    }

    // czesto przez konwencje nazywamy parametry konstruktora
    // tak samo jak pola
    // dlatego aby uniknac niejednoznacznosci
    // stosujemy slowo kluczowe this
    // this.bokA = bokA;
    public Prostokat(double bokA) {
        // do pola bokA przypisz wartość paramertru bokA
        this.bokA = bokA;
    }


    public double obliczObwod() {
        return 2 * bokA + 2 * bokB;
    }


    public double obliczPole() {
        return bokA * bokB;
    }

}

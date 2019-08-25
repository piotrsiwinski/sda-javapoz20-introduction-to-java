package pl.sda.poznan.oop;

public class Program {
    public static void main(String[] args) {

        // duzyProstokat jest obiektem typu Prostokat
        // duzyProstokat jest instancją typu Prostokat
        Prostokat duzyProstokat = new Prostokat(4, 5);
        Prostokat malyProstokat = new Prostokat(2, 3);


        double obwod = duzyProstokat.obliczObwod();

        System.out.println(obwod);

        System.out.println("DUZY");
        System.out.println(duzyProstokat.obliczObwod());
        System.out.println(duzyProstokat.obliczPole());

        System.out.println();
        System.out.println("MALY");
        System.out.println(malyProstokat.obliczObwod());
        System.out.println(malyProstokat.obliczPole());


    }
}

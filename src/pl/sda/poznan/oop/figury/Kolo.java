package pl.sda.poznan.oop.figury;

public class Kolo extends Figura {
    private double promien;

    public Kolo(String nazwa) {
        super(nazwa);
    }


    public double obliczObwod() {
        return 2 * Math.PI * promien;
    }


    public double obliczPole() {
        return Math.PI * (promien * promien);
    }
}

package pl.sda.poznan.oop.figury;

public class Kwadrat extends Figura {
    // bok
    private double bok;

    public Kwadrat(String nazwa, double bok) {
        super(nazwa);
        this.bok = bok;
    }


    @Override
    public double obliczObwod() {
        return 4 * bok;
    }

    @Override
    public double obliczPole() {
        return bok * bok;
    }
}

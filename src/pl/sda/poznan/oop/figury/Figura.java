package pl.sda.poznan.oop.figury;

public abstract class Figura {

    private String nazwa;

    public Figura(String nazwa) {
        this.nazwa = nazwa;
    }

    public abstract double obliczObwod();

    public abstract double obliczPole();

    public String getNazwa() {
        return nazwa;
    }

    public String toBedzieOdziedziczone(){
        return "";
    }
}

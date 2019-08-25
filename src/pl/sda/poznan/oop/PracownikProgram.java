package pl.sda.poznan.oop;

public class PracownikProgram {
    public static void main(String[] args) {
        Pracownik asystent = new Pracownik("Jan", "Nowak", 20, 2000);
        Pracownik kierownik = new Pracownik("Anna", "Kowalska", 26, 5000);
        Pracownik prezes = new Pracownik("Adam", "Wiśniewski", 40, 20000);


        double pensja = asystent.getPensja();
        pensja = 1000;


        System.out.println(asystent.getPensja());
        System.out.println(pensja);

        prezes.setEmail("prezes@superfirma.com");

        asystent.setNazwisko("Adamiak");


    }
}

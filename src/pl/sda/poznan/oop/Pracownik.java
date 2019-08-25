package pl.sda.poznan.oop;

public class Pracownik {

    private String imie;
    private String nazwisko;
    private int wiek;
    private String email;
    private double pensja;


    // zdefiniuj pola imie, nazwisko, wiek, adres email, pensja
    // zdefiniuj konstruktory przyjmujące:
    // - imie, nazwisko, wiek
    // - imie, nazwisko, wiek, adres email
    // - przyjmujący wszystkie parametry

    // utworz 3 obiekty typu pracownik
    // w kazdym z tych przypadkow wykorzystaj inny konstrukor


    public Pracownik(String i, String n, int w) {
        imie = i;
        nazwisko = n;
        wiek = w;
    }

    public Pracownik(String imie, String nazwisko, int wiek, String email) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.email = email;
    }

    public Pracownik(String imie, String nazwisko, int wiek, double pensja) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.pensja = pensja;
    }

    public Pracownik(String imie, String nazwisko, int wiek, String email, double pensja) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.email = email;
        this.pensja = pensja;
    }

    public double getPensja() {
        return pensja;
    }

    public String getImie() {
//        return this.imie;
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        if (!email.contains("@")) {
            throw new RuntimeException("Invalid email");
        }

        this.email = email.trim().toLowerCase();
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public void setPensja(double pensja) {
        this.pensja = pensja;
    }
}

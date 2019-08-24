package pl.sda.poznan.zadania1;

public class StringFormatDemo {
    public static void main(String[] args) {
        String imie = "Piotr";
        String nazwisko = "Nowak";
        int wiek = 20;
        System.out.printf("imie to: %s, nazwisko to:%s, wiek to: %d%n", imie, nazwisko, wiek);

        System.out.println(
                String.format("imie to: %s, nazwisko to: %s, a wiek to: %d",
                        nazwisko,
                        imie,
                        wiek));

    }
}

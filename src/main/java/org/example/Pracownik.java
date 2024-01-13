package org.example;

public class Pracownik implements WypiszPersonalia {
    protected String imie;
    protected String nazwisko;
    protected Integer wynagrodzenie;
    protected Dzial dzial;
    public Pracownik(String imie, String nazwisko, Integer wynagrodzenie, Dzial dzial) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wynagrodzenie = wynagrodzenie;
        this.dzial = dzial;
    }

    @Override
    public void wypiszDane() {
        System.out.println( "-------------------------------------\n" +
                            "Imię pracownika: " + this.imie + "\n" +
                            "Nazwisko pracownika: " + this.nazwisko + "\n" +
                            "Wynagrodzenie pracownika: " + this.wynagrodzenie + "\n" +
                            "Dział pracownika: " + this.dzial +
                            "\n-------------------------------------");
    }
}

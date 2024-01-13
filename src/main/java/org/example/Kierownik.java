package org.example;

public class Kierownik extends Pracownik {
    protected Integer premiaKierownicza;
    public Kierownik(String imie, String nazwisko, Integer wynagrodzenie, Dzial dzial, Integer premiaKierownicza) {
        super(imie, nazwisko, wynagrodzenie, dzial);
        this.premiaKierownicza = premiaKierownicza;
    }
    @Override
    public void wypiszDane() {
        System.out.println( "-------------------------------------\n" +
                "Imię pracownika: " + this.imie + "\n" +
                "Nazwisko pracownika: " + this.nazwisko + "\n" +
                "Wynagrodzenie pracownika: " + this.wynagrodzenie + "\n" +
                "Dział pracownika: " + this.dzial + "\n" +
                "Premia kierownicza: " + this.premiaKierownicza +
                "\n-------------------------------------");
    }
}

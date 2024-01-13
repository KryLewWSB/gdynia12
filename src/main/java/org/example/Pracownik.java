package org.example;

public class Pracownik {
    public String imie;
    public String nazwisko;
    public Integer wynagrodzenie;
    public Dzial dzial;
    public Pracownik(String imie, String nazwisko, Integer wynagrodzenie, Dzial dzial) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wynagrodzenie = wynagrodzenie;
        this.dzial = dzial;
    }
}

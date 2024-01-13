package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Pracownik> listaPraconicy = new ArrayList<>();
        List<Kierownik> listaKierownicy = new ArrayList<>();
        Scanner scan = new Scanner(System.in);



        while(true) {
            System.out.println("Wybierz z Menu [wpisz cyfrę:]");
            System.out.println("1. Dodaj nowego Pracownika.\n" +
                    "2. Dodaj nowego kierownika.\n" +
                    "3. Wypisz pracowników i kierowników.\n" +
                    "4. Zakończ działanie.\n");
            int wybranaOpcja = scan.nextInt();
            switch (wybranaOpcja) {
                case 1 -> {
                    System.out.println("Podaj imię pracownika: ");
                    String imie = scan.next();
                    System.out.println("Podaj nazwisko pracownika: ");
                    String nazwisko = scan.next();
                    System.out.println("Podaj wynagrodzenie pracownika: ");
                    int wynagrodzenie = scan.nextInt();
                    System.out.println("Podaj dział pracownika: [ IT, KSIEGOWOSC, BOK, BOS ]");
                    String dzialString = scan.next();
                    Dzial dzial = Dzial.IT;
                    if (dzialString.equals(Dzial.IT.toString())) dzial = Dzial.IT;
                    else if (dzialString.equals(Dzial.KSIEGOWOSC)) dzial = Dzial.KSIEGOWOSC;
                    else if (dzialString.equals(Dzial.BOK)) dzial = Dzial.BOK;
                    else if (dzialString.equals(Dzial.BOS)) dzial = Dzial.BOS;
                    listaPraconicy.add(new Pracownik(imie, nazwisko, wynagrodzenie, dzial));
                }
                case 2 -> {
                    System.out.println("Podaj imię kierownika: ");
                    String imie = scan.next();
                    System.out.println("Podaj nazwisko kierownika: ");
                    String nazwisko = scan.next();
                    System.out.println("Podaj wynagrodzenie kierownika: ");
                    int wynagrodzenie = scan.nextInt();
                    System.out.println("Podaj dział kierownika: [ IT, KSIEGOWOSC, BOK, BOS ]");
                    String dzialString = scan.next();
                    Dzial dzial = Dzial.IT;
                    if (dzialString.equals(Dzial.IT.toString())) dzial = Dzial.IT;
                    else if (dzialString.equals(Dzial.KSIEGOWOSC)) dzial = Dzial.KSIEGOWOSC;
                    else if (dzialString.equals(Dzial.BOK)) dzial = Dzial.BOK;
                    else if (dzialString.equals(Dzial.BOS)) dzial = Dzial.BOS;
                    System.out.println("Podaj premię kierownika: ");
                    int premia = scan.nextInt();

                    listaKierownicy.add(new Kierownik(imie, nazwisko, wynagrodzenie, dzial, premia));
                }
                case 3 -> {
                    for (Pracownik pracownik : listaPraconicy) {
                        pracownik.wypiszDane();
                    }
                    for (Kierownik kierownik : listaKierownicy) {
                        kierownik.wypiszDane();
                    }
                }
            }
            if(wybranaOpcja == 4) break;
        }





    }
}
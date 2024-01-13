package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Pracownik> praconicy = new ArrayList<>();
        List<Kierownik> kierownicy = new ArrayList<>();

        Pracownik pracownika1 = new Pracownik( "Anna",
                                            "Nowak",
                                        5000,
                                                    Dzial.IT);
        Kierownik kierownika1 = new Kierownik( "Adam",
                                            "Kowal",
                                        5000,
                                                    Dzial.IT,
                                      3000);

        pracownika1.wypiszDane();
        kierownika1.wypiszDane();

    }
}
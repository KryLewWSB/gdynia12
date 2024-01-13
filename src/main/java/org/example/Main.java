package org.example;

import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

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
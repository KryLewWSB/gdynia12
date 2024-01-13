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

        System.out.println( pracownika1.imie + "\n" +
                            pracownika1.nazwisko + "\n" +
                            pracownika1.wynagrodzenie);


    }
}
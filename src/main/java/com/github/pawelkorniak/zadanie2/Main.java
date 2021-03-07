package com.github.pawelkorniak.zadanie2;

import java.util.Scanner;

/**
 * <strong>Zadanie drugie</strong>
 * Napisz metode która przyjmuje double i zwraca :
 * <li>true jeśli liczba jest parzysta</li>
 * <li>false jeśli jest nieparzysta</li>
 * <li>rzuca wyjątek typu IllegalNumberException jeśli liczba jest ujemna lub zmiennoprzecinkowa</li>
 *
 * W razie wystąpienia wyjątku, program powiniem wyświetlić stosowną wiadomość i kontynuować działanie.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean res = false;
        do {
            try {
                System.out.print("Podaj liczbę : ");
                res = isEven(scanner.nextDouble());
                if (!res) System.out.println("Liczba nieparzysta.");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (!res);
        System.out.println("Liczba parzysta!");
    }

    public static boolean isEven(double d) throws Exception {
        if (d < 0 || d != (int)d) {
            throw new IllegalNumberException();
        }
        if (d % 2 != 0) return false;
        return true;
    }
}
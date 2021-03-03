package com.github.pawelkorniak.zadanie2;

import java.util.Scanner;

/**
 * <strong>Zadanie drugie</strong>
 * napisz metode która przyjmuje double i zwraca :
 * <li>true jeśli liczba jest parzysta</li>
 * <li>false jeśli jest nieparzysta</li>
 * <li>rzuca wyjątek jeśli liczba jest ujemna lub zmiennoprzecinkowa</li>
 */
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean res = false;
        do {
            try {
                System.out.print("Podaj liczbę : ");
                res = isEven(scanner.nextDouble());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (!res);
        System.out.println(res);
    }

    static boolean isEven(double d) throws Exception {
        if (d < 0 || d != (int)d) {
            throw new IllegalNumberException("Number is negative or not natural");
        }
        if (d % 2 != 0) return false;
        return true;
    }
}
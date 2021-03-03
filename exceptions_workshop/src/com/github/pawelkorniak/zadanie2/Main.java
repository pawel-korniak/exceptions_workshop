package com.github.pawelkorniak.zadanie2;

import com.github.pawelkorniak.zadanie3.DecimalPointException;
import com.github.pawelkorniak.zadanie3.NegativeNumberException;

import java.io.IOException;
import java.util.Scanner;
//TODO javadoc
/**
 * zadanie drugie
 * napisz metode która przyjmuje double i zwraca
 *  - true jeśli liczba jest parzysta
 *  - false jeśli jest nieparzysta
 *  - rzuca wyjątek jeśli liczba jest ujemna lub zmiennoprzecinkowa
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

            throw new IllegalNumberException("number is negative or not natural");
        }
        if (d % 2 != 0) return false;
        return true;
    }
}
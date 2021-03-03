package com.github.pawelkorniak.zadanie3;

import java.io.IOException;
import java.util.Scanner;
//TODO javadoc
/**
 * zadanie trzecie
 * napisz metode która przyjmuje double i zwraca
 *  - true jeśli liczba jest parzysta
 *  - false jeśli jest nieparzysta
 *  - rzuca wyjątek który może mieć dwie przyczyny :
 *      > liczba jest ujemna
 *      > liczba jest zmiennoprzecinkowa
 */

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        boolean res = false;
        do {
            try {
                System.out.print("Podaj liczbę : ");
                res = isEven(scanner.nextDouble());
            } catch (Exception e) {
                Throwable cause = e.getCause();
                System.out.println("Exception : cause : " + cause.getClass() + " ,message : " + cause.getMessage());
            }
        } while (!res);
        System.out.println(res);
    }

    static boolean isEven(double d) throws Exception {
        if (d < 0) {
            Exception e = new IOException();
            e.initCause(new NegativeNumberException());
            throw e;
        }
        if (d != (int)d) {
            Exception e = new Exception();
            e.initCause(new DecimalPointException());
            throw e;
        }
        if (d % 2 != 0) return false;
        return true;
    }
}

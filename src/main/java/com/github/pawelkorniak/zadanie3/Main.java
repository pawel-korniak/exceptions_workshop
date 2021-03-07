package com.github.pawelkorniak.zadanie3;

import java.io.IOException;
import java.util.Scanner;

/**
 * <strong>Zadanie trzecie</strong>
 * napisz metode która przyjmuje double i zwraca :
 *  <ul>true jeśli liczba jest parzysta</ul>
 *  <ul>false jeśli jest nieparzysta</ul>
 *  <ul>rzuca wyjątek typu Exception który może mieć dwie przyczyny (Cause) :</ul>
 *  <li>NegativeNumberException - jeśli liczba jest ujemna</li>
 *  <li>DecimalPointException - jeśli liczba jest zmiennoprzecinkowa</li>
 *
 * W razie wystąpienia wyjątku, program powiniem wyświetlić jego przyczynę (Cause), oraz stosowną wiadomość i kontynuować działanie.
 */
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean res = false;
        do {
            try {
                System.out.print("Podaj liczbę : ");
                res = isEven(scanner.nextDouble());
                if (!res) System.out.println("Liczba nieparzysta.");
            } catch (Exception e) {
                Throwable cause = e.getCause();
                System.out.println("Exception : cause : " + cause.getClass() + " ,message : " + cause.getMessage());
            }
        } while (!res);
        System.out.println("Liczba parzysta!");
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

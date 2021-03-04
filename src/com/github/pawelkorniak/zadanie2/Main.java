package com.github.pawelkorniak.zadanie2;

import java.util.Scanner;

/**
 * <strong>Zadanie drugie</strong>
 * napisz metode która przyjmuje double i zwraca :
 * <li>true jeśli liczba jest parzysta</li>
 * <li>false jeśli jest nieparzysta</li>
 * <li>rzuca wyjątek jeśli liczba jest ujemna lub zmiennoprzecinkowa</li>
 * możesz modyfikować metodę main
 */
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean res = false;
        do {
            System.out.print("Podaj liczbę : ");
            res = isEven(scanner.nextDouble());
        } while (!res);
        System.out.println(res);
    }

    static boolean isEven(double d){
        /*
        write your code here
         */
        return false;
    }
}
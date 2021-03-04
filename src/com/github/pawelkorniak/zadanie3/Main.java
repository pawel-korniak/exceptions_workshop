package com.github.pawelkorniak.zadanie3;

import java.util.Scanner;

/**
 * <strong>Zadanie trzecie</strong>
 * napisz metode która przyjmuje double i zwraca :
 *  <ul>true jeśli liczba jest parzysta</ul>
 *  <ul>false jeśli jest nieparzysta</ul>
 *  <ul>rzuca wyjątek który może mieć dwie przyczyny :</ul>
 *  <li>liczba jest ujemna</li>
 *  <li>liczba jest zmiennoprzecinkowa</li>
 * możesz modyfikować metodę main
 *
 */
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean res = false;
        do {
            System.out.print("Podaj liczbę : ");
            res = isEven(scanner.nextDouble());
        } while (!res);
        System.out.println(res);
    }

    static boolean isEven(double d){

        //twoja implementacja

        return false;
    }
}

package com.github.pawelkorniak.zadanie4;

import java.util.Scanner;

/**
 * <strong>Zadanie czwarte</strong>
 * Zmień implementacje zadania trzeciego tak żeby :
 * <li>metoda isEven zgłaszała dwa typy wyjątków : DecimalPointException i NegativeNumberException</li>
 * <li>pojedynczy blok 'catch' obsługiwał wyjątki poprzez wydruk ich wiadomości</li>
 */
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean res = false;
        do {
            System.out.print("Podaj liczbę : ");
            res = isEven(scanner.nextDouble());
            if (!res) System.out.println("Liczba nieparzysta.");
        } while (!res);
        System.out.println("Liczba parzysta!");
    }

    static boolean isEven(double d){
        //twoja implementacja
        return true;
    }
}

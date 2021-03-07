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
            try {
                System.out.print("Podaj liczbę : ");
                res = isEven(scanner.nextDouble());
                if (!res) System.out.println("Liczba nieparzysta.");
            } catch (NegativeNumberException | DecimalPointException e) {
                System.out.println(e.getMessage());
            }

        } while (!res);
        System.out.println("Liczba parzysta!");
    }

    static boolean isEven(double d) throws DecimalPointException,NegativeNumberException {
        if (d < 0) {
            throw new NegativeNumberException();
        }
        if (d != (int)d) {
            throw new DecimalPointException();
        }
        if (d % 2 != 0) return false;
        return true;
    }
}

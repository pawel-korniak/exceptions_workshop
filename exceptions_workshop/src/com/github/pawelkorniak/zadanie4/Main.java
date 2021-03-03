package com.github.pawelkorniak.zadanie4;

import java.util.Scanner;

/**
 * <strong>Zadanie czwarte</strong>
 * zmień metodę z zadania trzeciego tak żeby obługiwała dwa wyjątki w bloku catch z operatorem '|'
 */
public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        boolean res = false;
        do {
            try {
                System.out.print("Podaj liczbę : ");
                res = isEven(scanner.nextDouble());
            } catch (NegativeNumberException | DecimalPointException e) {
                System.out.println(e.getMessage());
            }
        } while (!res);
        System.out.println(res);
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

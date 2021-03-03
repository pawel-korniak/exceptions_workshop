package com.github.pawelkorniak.zadanie4;

import java.util.Scanner;

/**
 * <strong>Zadanie czwarte</strong>
 * zmień metodę z zadania trzeciego tak żeby obługiwała dwa wyjątki w bloku catch z operatorem '|'
 * możesz modyfikować metodę main
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
        /*
        write your code here
         */
        return false;
    }
}

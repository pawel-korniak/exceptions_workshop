package com.github.pawelkorniak.zadanie1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * <strong>Zadanie pierwsze</strong>
 * napisz program który wczytuje z klawiatury text,
 * następnie zapisuje go do pliku plik.txt,
 * następnie czyta ten text z pliku
 */
public class Main {
    public static void main(String[] args){
        File file = new File("plik.txt");
        Scanner systemScanner = new Scanner(System.in);
        String text = systemScanner.next();
        try (PrintWriter pw = new PrintWriter(file)){
           pw.append(text);
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        }
        try {
            Scanner fileScanner = new Scanner(file);
            System.out.println(fileScanner.nextLine());
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        }
    }
}

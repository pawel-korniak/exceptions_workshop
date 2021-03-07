package com.github.pawelkorniak.zadanie1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * <strong>Zadanie pierwsze</strong>
 * Odkomentuj poniższy kod i dodaj obsługę wyjątków.
 * Po wystąpieniu wyjątku wyświetl jego wiadomość.
 */
public class Main {
    public static void main(String[] args){
        File file = new File("plik.txt");
        Scanner systemScanner = new Scanner(System.in);
        System.out.println("Wpisz text : ");
        String input = systemScanner.next();
        try {
            writeToFile(input,file);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println(readFromFile(file));
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    static void writeToFile(String input, File file) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(file);
        pw.append(input);
        pw.close();
    }

    static String readFromFile(File file) throws FileNotFoundException {
        Scanner fileScanner = new Scanner(file);
        return fileScanner.nextLine();
    }
}

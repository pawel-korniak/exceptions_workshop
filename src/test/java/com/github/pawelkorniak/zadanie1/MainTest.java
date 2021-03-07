package com.github.pawelkorniak.zadanie1;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public void returnsSameStringAsGiven() throws FileNotFoundException {
    //given
        Main main = new Main();
    String input = "aaaaa";
    File file = new File("plik.txt");
    //when
    main.writeToFile(input,file);
    String output = main.readFromFile(file);
    //then
    assertEquals(input,output);
    }
}
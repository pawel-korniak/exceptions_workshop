package com.github.pawelkorniak.zadanie3;

import java.io.IOException;

public class NegativeNumberException extends IOException {
    NegativeNumberException(){
        super("Liczba jest ujemna.");
    }
}

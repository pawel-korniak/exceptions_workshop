package com.github.pawelkorniak.zadanie4;

import java.io.IOException;

public class NegativeNumberException extends IOException {
    NegativeNumberException(){
        super("Number is negative");
    }
}

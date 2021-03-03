package com.github.pawelkorniak.zadanie4;

import java.io.IOException;

public class DecimalPointException extends IOException {
    public DecimalPointException() {
        super("number is not natural");
    }
}

package com.github.pawelkorniak.zadanie3;

import java.io.IOException;

public class DecimalPointException extends IOException {
    public DecimalPointException() {
        super("Number is not natural");
    }
}

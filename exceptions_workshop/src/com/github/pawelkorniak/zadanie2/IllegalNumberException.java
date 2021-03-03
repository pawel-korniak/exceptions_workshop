package com.github.pawelkorniak.zadanie2;

import java.io.IOException;

public class IllegalNumberException extends IOException {
    IllegalNumberException(String message){
        super(message);
    }
}

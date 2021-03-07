package com.github.pawelkorniak.zadanie4;

import org.junit.jupiter.api.Test;
import static com.github.pawelkorniak.zadanie4.Main.isEven;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void returnsTrue_givenEvenNumber() throws Exception {
        //given
        double d = 2;
        //when
        boolean res = isEven(d);
        //then
        assertTrue(res);
    }

    @Test
    public void returnsFalse_givenUnEvenNumber() throws Exception {
        //given
        double d = 1;
        //when
        boolean res = isEven(d);
        //then
        assertFalse(res);
    }

    @Test
    public void throwException_givenNegativeNumber(){
        //given
        double d = -1;
        //when
        String message = "";
        try {
            boolean res = isEven(d);
        } catch (Exception e) {
            message = e.getMessage();
        }
        //then
        assertEquals(message,"Liczba jest ujemna.");
    }

    @Test
    public void throwException_givenDecimalNumber(){
        //given
        double d = 2.2;
        //when
        String message = "";
        try {
            boolean res = isEven(d);
        } catch (Exception e) {
            message = e.getMessage();
        }
        //then
        assertEquals(message,"Liczba nie jest liczbą naturalną.");
    }

    @Test
    public void throwExceptionCausedByDecimalPointException(){
        //given
        double d = 2.2;
        //when
        Throwable exception = new Throwable();
        try {
            boolean res = isEven(d);
        } catch (Exception e) {
            exception = e;
        }
        //then
        assertTrue(exception instanceof DecimalPointException);
    }

    @Test
    public void throwExceptionCausedByNegativeNumberException(){
        //given
        double d = -2;
        //when
        Throwable exception = new Throwable();
        try {
            boolean res = isEven(d);
        } catch (Exception e) {
            exception = e;
        }
        //then
        assertTrue(exception.getClass() == NegativeNumberException.class);
    }

}
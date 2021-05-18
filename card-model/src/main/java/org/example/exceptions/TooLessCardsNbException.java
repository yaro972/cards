package org.example.exceptions;

public class TooLessCardsNbException extends Exception {

    public TooLessCardsNbException(String message) {
        super(message);
    }

    public TooLessCardsNbException(String message, Throwable cause) {
        super(message, cause);
    }

}

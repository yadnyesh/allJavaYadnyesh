package io.yadnyesh.yt.durgesh.collection.exceptionhandling;

public class AgeInvalidException extends Exception {
    AgeInvalidException() {
        super("Age Invalid Exception");
    }
    AgeInvalidException(String message) {
        super("AgeInvalidExceptionClass  => " + message);
    }

}

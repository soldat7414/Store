package Exceptions;

public class NotIntException extends Exception {

    String input;

    public NotIntException(String message, String input){
        super(message);
        this.input = input;
    }

    public String getInput() {
        return input;
    }
}

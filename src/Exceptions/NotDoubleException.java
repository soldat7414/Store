package Exceptions;

public class NotDoubleException extends Exception {

    String input;

    public NotDoubleException(String message, String input){
        super(message);
        this.input = input;
    }

    public String getInput() {
        return input;
    }
}

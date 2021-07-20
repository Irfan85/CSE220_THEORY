package Assignment06.Stack;

public class StackUnderflowException extends Exception{
    public StackUnderflowException(String message) {
        super(message);
    }
}
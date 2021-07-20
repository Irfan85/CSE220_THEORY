package Assignment06.Stack;

public class ArrayStack implements Stack {
    int size;
    Object[] data;
    private static final int DEFINED_INIT_SIZE = 5;

    public ArrayStack() {
        size = 0;
        data = new Object[DEFINED_INIT_SIZE];
    }

    @Override
    public int size() {
        //TO DO
        return size;
    }

    @Override
    public boolean isEmpty() {
        //TO DO
        return size == 0;
    }

    @Override
    public void push(Object e) throws StackOverflowException {
        //TO DO
        if (size == data.length) {
            throw new StackOverflowException("Stack is full.");
        } else {
            data[size++] = e;
        }

    }

    @Override
    public Object pop() throws StackUnderflowException {
        //TO DO
        if (size == 0) {
            throw new StackUnderflowException("Stack is empty.");
        } else {
            size--;

            return data[size];
        }
    }

    @Override
    public Object peek() throws StackUnderflowException {
        //TO DO
        if (size == 0) {
            throw new StackUnderflowException("Stack is empty.");
        } else {
            return data[size - 1];
        }
    }

    @Override
    public String toString() {
        //TO DO
        String output = "[";
        for (int i = size - 1; i >= 0; i--)
            output += " " + data[i].toString();

        output += " ]\n";

        return output;
    }

    @Override
    public Object[] toArray() {
        //TO DO
        Object[] ar = new Object[size];
        int idx = 0;

        for (int i = size - 1; i >= 0; i--) {
            ar[idx++] = data[i];
        }

        return ar;
    }

    @Override
    public int search(Object e) {
        //TO DO
        int count = 0;

        for (int i = size - 1; i >= 0; i--) {
            if (e.equals(data[i])) {
                return count;
            }

            count++;
        }

        return -1;
    }
}
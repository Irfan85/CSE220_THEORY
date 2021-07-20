package Assignment06.Stack;

import Assignment06.Node;

public class ListStack implements Stack {
    int size;
    Node top;


    public ListStack() {
        size = 0;
        top = null;
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
        top = new Node(e, top);
        size++;
    }

    @Override
    public Object pop() throws StackUnderflowException {
        //TO DO
        Object popped;

        if (size == 0) {
            throw new StackUnderflowException("Stack is empty");
        } else {
            popped = top.val;
            top = top.next;
            size--;
        }

        return popped;
    }

    @Override
    public Object peek() throws StackUnderflowException {
        //TO DO
        Object popped;

        if (size == 0)
            throw new StackUnderflowException("Stack is empty");
        else
            popped = top.val;

        return popped;
    }

    public String toString() {
        //TO DO
        String output = "[";

        for (Node n = top; n != null; n = n.next)
            output += " " + n.val.toString();

        output += " ]\n";

        return output;
    }

    @Override
    public Object[] toArray() {
        //TO DO
        Object[] ar = new Object[size];
        int idx = 0;

        for (Node n = top; n != null; n = n.next)
            ar[idx++] = n.val;

        return ar;
    }

    @Override
    public int search(Object e) {
        //TO DO
        int count = 0;

        for (Node n = top; n != null; n = n.next) {
            if (e.equals(n.val))
                return count;

            count++;
        }

        return -1;
    }

}
package Assignment06.Queue;

import Assignment06.Node;

/**
 * @author Mujtahid Akon
 */
public class ListQueue implements Queue {
    private Node head, tail;
    private int capacity;
    //int rear = -1 ; //rear = (start+ size)%data.length; = (0+0)
    private int size;

    public ListQueue(int capacity) {
        this.capacity = capacity;
        head = tail = null;
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return (size == 0);
    }

    @Override
    public void enqueue(Object e) throws QueueOverflowException {
        if (size == capacity) throw new QueueOverflowException("Queue is full.");
        // create new node and add it to the tail
        Node n = new Node(e, null);

        if (size == 0) { // initialize head if size is 0
            //TO DO
            head = n;
            tail = head;
        } else { // add the new node to the tail and update tail
            //TO DO
            tail.next = n;
            tail = n;

        }

        // don't forget to update size
        //TO DO
        size++;
    }

    @Override
    public Object dequeue() throws QueueUnderflowException {
        if (size == 0) throw new QueueUnderflowException("Queue is empty.");
        //TO DO
        Object temp = head.val;

        head = head.next;
        size--;

        return temp;
    }

    @Override
    public Object peek() throws QueueUnderflowException {
        if (size == 0) throw new QueueUnderflowException("Queue is empty.");
        //TO DO

        return head.val;
    }

    @Override
    public String toString() {
        //TO DO
        String output = "[";

        for (Node n = head; n != null; n = n.next)
            output += " " + n.val.toString();

        output += " ]\n";

        return output;
    }

    @Override
    public Object[] toArray() {
        //TO DO
        Object[] ar = new Object[size];
        int idx = 0;

        for (Node n = head; n != null; n = n.next)
            ar[idx++] = n.val;

        return ar;
    }

    @Override
    public int search(Object e) {
        //TO DO
        int count = 0;

        for (Node n = head; n != null; n = n.next) {
            if (e.equals(n.val)) {
                return count;
            }

            count++;
        }

        return -1;
    }

    public void linearView() {
        String s = "[ ";
        for (Node n = head; n != null; n = n.next) {
            s = s + n.val + " ";
        }
        s = s + "]";
        System.out.println("view: " + s);
    }


}

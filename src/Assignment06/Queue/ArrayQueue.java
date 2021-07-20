package Assignment06.Queue;

/**
 * @author Mujtahid Akon
 */
public class ArrayQueue implements Queue {
    Object[] data;
    int front;
    int size;

    public ArrayQueue(int capacity) {
        data = new Object[capacity];
        size = 0;
        front = 0;
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
    public void enqueue(Object e) throws QueueOverflowException {
        int nextAvailableSlot = front + size;

        if (size == data.length) {
            throw new QueueOverflowException("Queue is full.");
        } else {
            data[nextAvailableSlot % data.length] = e;
            size++;
        }
    }

    @Override
    public Object dequeue() throws QueueUnderflowException {
        //TO DO
        Object temp;

        if (size == 0) {
            throw new QueueUnderflowException("Queue is empty.");
        } else {
            temp = data[front % data.length];

            front++;
            size--;
        }

        return temp;
    }

    @Override
    public Object peek() throws QueueUnderflowException {
        //TO DO
        if (size == 0) {
            throw new QueueUnderflowException("Queue is empty.");
        } else {
            return data[front % data.length];
        }
    }

    @Override
    public String toString() {
        //TO DO
        String output = "[";

        int offset = front;
        for (int i = 0; i < size; i++) {
            output = " " + data[offset % data.length];
            offset++;
        }

        output += " ]\n";

        return output;
    }

    @Override
    public Object[] toArray() {
        //TO DO
        Object[] ar = new Object[size];
        int idx = 0;

        int offset = front;
        for (int i = 0; i < size; i++) {
            ar[idx++] = data[offset % data.length];
            offset++;
        }

        return ar;
    }

    @Override
    public int search(Object e) {
        //TO DO
        int count = 0;

        int offset = front;
        for (int i = 0; i < size; i++) {
            if (e.equals(data[offset % data.length]))
                return count;

            offset++;
        }

        return count;
    }

    // print linear array view of the internal circular array
    public void linearView() {
        String s = "";
        for (int i = 0; i < data.length; i++) {
            s = s + data[i] + " ";
        }
        s = s;
        System.out.println("view: " + s);
    }


}

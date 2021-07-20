package Assignment04;

/* Dummy Headed Doubly Linked Circular List */
public class DHDLCL {
    private Node head;

    public DHDLCL(Object[] array) {
        Node dummyHead = new Node(null, null, null);
        dummyHead.prev = dummyHead;
        dummyHead.next = dummyHead;

        this.head = dummyHead;

        Node tail = dummyHead;

        for (Object o : array) {
            Node newNode = new Node(o, null, null);
            newNode.prev = tail;
            newNode.next = dummyHead;

            tail.next = newNode;

            dummyHead.prev = newNode;

            tail = newNode;

        }
    }

    public DHDLCL(Node head) {
        this.head = head;
    }

    public void printList() {
        for (Node n = head.next; n != head; n = n.next)
            System.out.print(n.e.toString() + " ");

        System.out.println();
    }

    public void printReverse() {
        for (Node n = head.prev; n != head; n = n.prev)
            System.out.print(n.e.toString() + " ");

        System.out.println();
    }

    public int countNode() {
        int count = 0;

        for (Node n = head.next; n != head; n = n.next)
            count++;

        return count;
    }

    public Node nodeAt(int index) {
        int count = 0;

        for (Node n = head.next; n != head; n = n.next) {
            if (count == index)
                return n;

            count++;
        }

        return null;
    }

    public Object get(int index) {
        return nodeAt(index).e;
    }

    public void set(int idx, Object element) {
        Node target = nodeAt(idx);

        if (target != null)
            target.e = element;
        else
            System.out.println("Invalid index.");
    }

    public boolean search(int idx) {
        return nodeAt(idx) != null;
    }

    // TODO: Don't write from here other than the Node class

    public void insert(int idx, Object elem) {
        Node n = new Node(elem, null, null);

        Node previous;

        if (idx == countNode())
            previous = head.prev;
        else
            previous = nodeAt(idx).prev;

        n.prev = previous;
        n.next = previous.next;

        previous.next.prev = n;
        previous.next = n;
    }

    public void remove(int idx) {
        Node n = nodeAt(idx);

        n.prev.next = n.next;
        n.next.prev = n.prev;
    }

    public DHDLCL reverse() {
        Node dummyHead = new Node(null, null, null);
        dummyHead.next = dummyHead;
        dummyHead.prev = dummyHead;

        Node tail = dummyHead;

        for (Node n = head.prev; n != head; n = n.prev) {
            Node newNode = new Node(n.e, null, null);
            newNode.prev = tail;
            newNode.next = dummyHead;

            tail.next = newNode;

            dummyHead.prev = newNode;

            tail = newNode;
        }

        return new DHDLCL(dummyHead);
    }

    public void rotateLeft() {
        Node n = new Node(head.next.e, null, null);
        n.prev = head.prev;
        n.next = head;

        head.prev.next = n;

        head.prev = n;

        head.next = head.next.next;
        head.next.prev = head;
    }

    public void rotateRight() {
        Node n = new Node(head.prev.e, null, null);
        n.prev = head;
        n.next = head.next;

        head.next.prev = n;

        head.next = n;

        head.prev = head.prev.prev;
        head.prev.next = head;
    }

    private static class Node {
        public Object e;
        public Node prev;
        public Node next;

        public Node(Object element, Node previous, Node next) {
            e = element;
            prev = previous;
            this.next = next;
        }
    }
}

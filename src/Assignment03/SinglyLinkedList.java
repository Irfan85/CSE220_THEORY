package Assignment03;

public class SinglyLinkedList {
    public Node head;

    public SinglyLinkedList(Object[] a) {
        Node head = new Node(a[0], null);
        this.head = head;

        Node node = head;
        for (int i = 1; i < a.length; i++) {
            node.next = new Node(a[i], null);
            node = node.next;
        }
    }

    public SinglyLinkedList(Node head) {
        this.head = head;
    }

    public void printList() {
        for (Node n = this.head; n != null; n = n.next) {
            if (n == this.head)
                System.out.print(n.element);
            else
                System.out.print(", " + n.element);
        }

        System.out.println();
    }

    public int countNode() {
        int count = 0;

        for (Node n = this.head; n != null; n = n.next) {
            count++;
        }

        return count;
    }

    public Object get(int idx) {
        return nodeAt(idx).element;
    }

    public void set(int idx, Object elem) {
        Node n = nodeAt(idx);

        if (n != null) {
            n.element = elem;
        }
    }

    public boolean search(int index) {
        return nodeAt(index) != null;
    }

    public void insert(Object elem, int idx) {
        if (idx >= 0 && idx <= countNode()) {
            Node n = new Node(elem, null);

            if (idx == 0) {
                n.next = this.head;
                this.head = n;
            } else {
                Node prev = nodeAt(idx - 1);
                n.next = prev.next;
                prev.next = n;
            }
        }
    }

    public void remove(int index) {
        if (index >= 0 && index < countNode()) {
            if (index == 0) {
                this.head = this.head.next;
            } else {
                Node prev = nodeAt(index - 1);
                prev.next = prev.next.next;
            }
        }
    }

    public SinglyLinkedList reverseList() {
        Node newHead = new Node(this.head.element, null);

        for (Node n = this.head.next; n != null; n = n.next) {
            Node temp = new Node(n.element, null);
            temp.next = newHead;
            newHead = temp;
        }

        return new SinglyLinkedList(newHead);
    }

    public void rotateLeft() {
        Node temp = new Node(this.head.element, null);
        Node newHead = this.head.next;

        for (Node n = newHead; n != null; n = n.next) {
            if (n.next == null) {
                n.next = temp;

                break;
            }
        }

        this.head = newHead;
    }

    public void rotateRight() {
        for (Node n = this.head; n != null; n = n.next) {
            if (n.next == null) {
                Node newHead = new Node(n.element, this.head);
                n.element = this.head.element;
                this.head = newHead;

                remove(countNode() - 1);
                break;
            }
        }
    }

    public void sort() {
        for (Node n = this.head; n != null; n = n.next) {
            int swapCount = 0;

            Node n1 = this.head;
            for (Node o = this.head.next; o != null; o = o.next) {
                if (((Integer) n1.element).compareTo((Integer) o.element) > 0) {
                    Object temp = n1.element;
                    n1.element = o.element;
                    o.element = temp;

                    swapCount++;
                }

                n1 = n1.next;
            }

            if (swapCount == 0)
                break;
        }
    }

    public Node nodeAt(int idx) {
        if (idx >= 0 && idx < countNode()) {
            int count = 0;

            for (Node n = head; n != null; n = n.next) {
                if (count == idx)
                    return n;

                count++;
            }
        }

        return null;
    }

    //TODO: Don't Write This
    public void RemoveDuplicates() {
        Node current = head;
        while (current != null) {
            Node temp = current;
            while (temp != null && temp.element == current.element) {
                temp = temp.next;
            }
            current.next = temp;
            current = current.next;
        }
    }

    private static class Node {
        public Object element;
        public Node next;

        public Node(Object e, Node n) {
            element = e;
            next = n;
        }

    }

}
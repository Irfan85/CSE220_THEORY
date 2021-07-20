package Assignment05;

public class Test02 {
    public static void main(String[] args) {
        int X = 123 % 37;
//        int a [] = {X+1,X+2,X+3,X+4};
//        int b [] = {X+5,X+6,X+7,X+8};
//        MyList m = new MyList();
//        m.print();
//        m.myMethod(a,b);
//        m.print();

        for(int i = 1; i < 9; i++)
            System.out.println(X+i);
    }
}

class Node {
    int x;
    Node prev;
    Node next;

    public Node(int i, Node p, Node n) {
        x = i;
        prev = p;
        next = n;
    }
}

class MyList {
    public Node head;

    public void myMethod(int[] a, int[] b) {
        head = new Node(a[0] * b[0], null, null);
        Node h = head;
        Node p;
        for (int i = 0; i < a.length; i++) {
            p = new Node(a[i], null, null);
            h.next = p;
            h = h.next;
        }

        h.next = head;
        System.out.println(head.x);
       // h = head;

//        for (int i = 0; i < b.length; i++) {
//            p = new Node(b[i] -
//                    a[i], null, null);
//            h.prev = p;
//            h = h.prev;
//        }
    }


    void print(){
        for(Node n = head.next; n != head; n = n.next){
            System.out.print(n.x + " ");
        }
        System.out.println();
    }
}








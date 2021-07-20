//package Assignment05;
//
//public class Test {
//    public static void main(String[] args) {
//        LinkedList ll = new
//                LinkedList();
//        int X = 1123 % 37;
//        ll.insert(X + 100);
//        ll.insert(X + 70);
//        ll.remove();
//        ll.insert(X + 58);
//        ll.insert(X + 79);
//        ll.remove();
//        ll.insert(X + 21);
//        ll.insert(X + 11);
//
//        ll.print();
//    }
//}
//
//class LinkedList {
//    Node head;
//
//    public LinkedList() {
//        head = null;
//    }
//
//    void insert(int val) {
//        Node node = new
//                Node(val, null);
//        node.next = head;
//        head = node;
//    }
//
//    int remove() {
//        int val = 0;
//        if (head != null) {
//            Node prev = null;
//            Node cur = head;
//            while (cur.next != null) {
//                prev = cur;
//                cur = cur.next;
//            }
//            val = cur.num;
//            if (cur == head)
//                head = null;
//            else
//                prev.next = null;
//        }
//        return val;
//    }
//
//    void print(){
//        for(Node n = head; n != null; n = n.next){
//            System.out.print(n.num + " ");
//        }
//        System.out.println();
//    }
//}

//class Node {
//    int num;
//    Node next;
//    public Node(int n, Node x){
//        num =n;
//        next =x;
//    }
//}

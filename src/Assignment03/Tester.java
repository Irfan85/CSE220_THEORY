package Assignment03;

public class Tester {
    public static void main(String[] args) {
        int X = 1123 % 4 + 123 % 6;
        int Y = 1123 % 5 + 123 % 9;
        String A = (X + 1) + "_Irfan_" + (Y + 10);
        String B = (X + 2) + "_Irfan_" + (Y + 20);
        String C = (X + 3) + "_Irfan_" + (Y + 30);
        String D = (X + 4) + "_Irfan_" + (Y + 40);
        String E = (X + 5) + "_Irfan_" + (Y + 50);
        String F = (X + 6) + "_Irfan_" + (Y + 60);

        String[] strings = {A, B, C, D, E, F};
        SinglyLinkedList sl = new SinglyLinkedList(strings);

        System.out.println("T02");
        sl.printList();

        System.out.println("T03");
        int count = sl.countNode();
        System.out.println(count);

        System.out.println("T04");
        int idx = 123 % 5;
        String ele = (String) sl.get(idx);
        System.out.println(ele);

        System.out.println("T05");
        idx = 123 % 4;
        sl.set(idx, "Vector");
        sl.printList();

        System.out.println("T06");
        idx = 123 % 3;
        System.out.println(idx);
        System.out.println(sl.search(idx));

        System.out.println("T07");
        sl.insert("Elsa", 0);
        sl.insert("Rapunzel", sl.countNode());
        sl.insert("Skynet", 123 % 5);
        sl.printList();

        System.out.println("T08");
        sl.remove(0);
        sl.remove(sl.countNode() - 1);
        sl.remove(123 % 4);
        sl.printList();

        System.out.println("T09");
        SinglyLinkedList rsl = sl.reverseList();
        rsl.printList();

        System.out.println("T10");
        sl.printList();
        sl.rotateLeft();
        System.out.println("*");
        sl.printList();
        sl.rotateRight();
        sl.printList();

        System.out.println("T11a");
        X = 123 % 25 + 123 % 30 + 2;
        Object[] ar = {X + 21 , X + 13, X + 23, X + 21, X + 13 , X + 29};
        SinglyLinkedList sl2 =  new SinglyLinkedList(ar);
        sl2.printList();
        sl2.sort();
        sl2.printList();

        System.out.println("T11b");
        sl2.RemoveDuplicates();
        sl2.printList();
    }
}

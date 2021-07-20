package Assignment04;

public class Tester {
    public static void main(String[] args) {

        String s1 = "Irfan1";
        String s2 = "Irfan2";
        String s3 = "Irfan3";
        String s4 = "Irfan4";
        String s5 = "Irfan5";

        Object[] oz = {s1, s2, s3, s4, s5};

        // Task01
        DHDLCL ll = new DHDLCL(oz);

        // Task02
        System.out.println("*Task02*");

        ll.printList();
//        ll.printReverse();

        // Task03
        System.out.println("*Task03*");

        System.out.println("Count: " + ll.countNode());

        // Task04
        System.out.println("*Task04*");

        int x = 123 % 5;
        System.out.println(ll.get(x).toString());

        // Task05
        System.out.println("*Task05*");

        x = 123 % 4;
        ll.set(x, 777);

        ll.printList();

        // Task06
        System.out.println("*Task06*");

        System.out.println(ll.search(3));

        // TODO: No need to write form here

        // Task07
        System.out.println("*Task07*");

        ll.insert(0, "Diego");
        ll.printList();

        ll.insert(6, "Sid");
        ll.printList();

        x = 123 % 5;
        ll.insert(x, "Manny");
        ll.printList();

//        ll.printReverse();

        // Task08
        System.out.println("*Task08*");

        ll.remove(0);
        ll.printList();

        ll.remove(6);
        ll.printList();

        x = 123 % 4;
        ll.remove(x);
        ll.printList();

        // Task09
        System.out.println("*Task09*");

        DHDLCL reversed = ll.reverse();
        reversed.printList();
//        reversed.printReverse();

        // Task10
        System.out.println("*Task10*");

        ll.rotateRight();

        ll.rotateLeft();
        ll.rotateLeft();

        ll.rotateRight();

        ll.rotateLeft();

        ll.printList();
//        ll.printReverse();

    }
}

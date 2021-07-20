package Assignment02;

public class Tester {
    public static void main(String[] args) {
        task02();
        //task01();
    }

    public static void task01(){
       int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
       int[] cir = new int[arr.length];

       int start = 3;
       int size = 10;

       for(int i = 0, j = start; i < size; i++){
           cir[j % cir.length] = arr[i];
           j++;
       }

       for(int i : cir)
           System.out.print(i + " ");
       System.out.println();

       // Task01 begins here
       int lastIndex = start + size - 1;

       for(int i = 0; i < size; i++){
           System.out.print(cir[lastIndex % cir.length] + " ");
           lastIndex--;

           if(lastIndex == -1)
               lastIndex = cir.length - 1;
       }

        System.out.println();
    }

    public static void task02(){
        int x = 1123 % 34 + 1123 % 33;
        Object[] myArray = {x, x + 10, x - 10, x - 18, x + 50, x + 4, null, null};
        CircularArray circularArray = new CircularArray(myArray, 4, 6);
        circularArray.printFullLinear();
        System.out.println("...");

//        System.out.println("FWD PRINT");
//        circularArray.printForward();
//
//        System.out.println("BWD PRINT");
//        circularArray.printBackward();
//
//        System.out.println("LIN");
//        //circularArray.linearize();
//        circularArray.printFullLinear();
//
//        System.out.println("RESIZE");
//        int newLength = (1123 % 5) + (123 % 3) + 8;
//        circularArray.resizeStartUnchanged(newLength, 0);
//        circularArray.printFullLinear();
//
//        System.out.println("INSERT V1");
        int pos1 = 123 % 6;
//        circularArray.insertByRightShift(89, pos1);
//        circularArray.printFullLinear();
//
//        System.out.println("INSERT V2");
        int pos2 = 123 % 5;
//        circularArray.insertByRightShift(273, pos2);
//        circularArray.printFullLinear();
//
//        System.out.println("REMOVE V1");
//        circularArray.removeByLeftShift(pos1);
//        circularArray.printFullLinear();

        System.out.println("REMOVE V2");
        circularArray.removeByLeftShift(pos2);
        circularArray.printFullLinear();
    }
}

package Assignment01;

public class Tester {
    public static void main(String[] args) {
        LinearArrayManipulator arrayManipulator = new LinearArrayManipulator();
        int x = (1123 % 33) + (1123 % 34);
        System.out.println("X: " + x);
        Object[] myArray = {x - 18, x + 4, x, x + 14, x - 5, x + 4, x - 2, x + 9};
        task01(myArray, arrayManipulator);

        //task02(arrayManipulator);
    }

    public static void task01(Object[] array, LinearArrayManipulator arrayManipulator) {
        System.out.println("**Print**");
        arrayManipulator.printArray(array);

        System.out.println("**Copy**");
        Object[] copiedArray = arrayManipulator.copyArray(array);
        arrayManipulator.printArray(copiedArray);

        System.out.println("**Resize**");
        Object[] resizedArray = arrayManipulator.resize(array, 12);
        arrayManipulator.printArray(resizedArray);

        System.out.println("**Reverse**");
        arrayManipulator.reverseArray(array);
        arrayManipulator.printArray(array);

        arrayManipulator.reverseArray(array);

        System.out.println("**Left Shift**");
        Object[] leftShifted = arrayManipulator.shiftLeft(array, 2, 3);
        arrayManipulator.printArray(leftShifted);

        System.out.println("**Right Shift**");
        Object[] rightShifted = arrayManipulator.shiftRight(array, 2, 1);
        arrayManipulator.printArray(rightShifted);

        System.out.println("**Rotate Left**");
        Object[] rotatedLeft = arrayManipulator.rotateLeft(array, 2);
        arrayManipulator.printArray(rotatedLeft);

        System.out.println("**Rotate Right**");
        Object[] rotatedRight = arrayManipulator.rotateRight(array, 2);
        arrayManipulator.printArray(rotatedRight);

        System.out.println("**Insert**");
        Object[] ar2 = arrayManipulator.resize(array, 12);
        Object[] inserted = arrayManipulator.insert(ar2, 8, 90, 2);
        arrayManipulator.printArray(inserted);

        System.out.println("**Remove**");
        Object[] removed = arrayManipulator.remove(array,8, 2);
        arrayManipulator.printArray(removed);
    }

    public static void task02(LinearArrayManipulator arrayManipulator){
        Object x = 1123 % 33 + 1123 % 34;
        Object y = 123 % 33 + 123 % 34;
        Object a = ((int)x + 1) + "_CMI_" + ((int)y + 10);
        Object b = ((int)x + 2) + "_CMI_" + ((int)y + 20);
        Object c = ((int)x + 3) + "_CMI_" + ((int)y + 30);
        Object d = ((int)x + 4) + "_CMI_" + ((int)y + 40);
        Object e = ((int)x + 5) + "_CMI_" + ((int)y + 50);
        Object f = ((int)x + 6) + "_CMI_" + ((int)y + 60);

        Object[] myArray = {x, a, b, c, d, e, f};

        System.out.println("PRINT");
        arrayManipulator.printArray(myArray);

        System.out.println("RESIZE");
        int newLength = (1123 % 5) + (123 % 3) + 8;
        Object[] resized = arrayManipulator.resize(myArray, newLength);
        arrayManipulator.printArray(resized);

        System.out.println("REVERSE");
        Object[] reversed = arrayManipulator.reverseArray(myArray);
        arrayManipulator.printArray(reversed);

        System.out.println("LEFT SHIFT");
        Object[] leftShifted = arrayManipulator.shiftLeft(myArray, 0, 1);
        arrayManipulator.printArray(leftShifted);

        System.out.println("RIGHT SHIFT");
        Object[] rightShifted = arrayManipulator.shiftRight(myArray, 0, 1);
        arrayManipulator.printArray(rightShifted);

        System.out.println("INSERT");
        int position = 123 % 7;
        System.out.println("Pos: " + position);
        Object[] inserted = arrayManipulator.insert(resized, 7, 7, position);
        arrayManipulator.printArray(inserted);

        System.out.println("REMOVE");
        position = 123 % 5;
        System.out.println("Pos: " + position);
        Object[] removed = arrayManipulator.remove(myArray, 7, position);
        arrayManipulator.printArray(removed);

        System.out.println("ROTATE LEFT");
        System.out.println("Pos: " + position);
        Object[] rotateLeft = arrayManipulator.rotateLeft(myArray, position);
        arrayManipulator.printArray(rotateLeft);

        System.out.println("ROTATE RIGHT");
        System.out.println("Pos: " + position);
        Object[] rotatedRight = arrayManipulator.rotateRight(myArray, position);
        arrayManipulator.printArray(rotatedRight);

        System.out.println("INSERT V2");
        position = 123 % 10;
        System.out.println("Pos: " + position);
        inserted = arrayManipulator.insert(resized, 7, 8, position);
        arrayManipulator.printArray(inserted);

        System.out.println("REMOVE V2");
        position = 123 % 9;
        System.out.println("Pos: " + position);
        removed = arrayManipulator.remove(myArray, 7, position);
        arrayManipulator.printArray(removed);
    }
}

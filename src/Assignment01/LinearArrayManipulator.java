package Assignment01;

public class LinearArrayManipulator {

    public void printArray(Object[] source) {
        System.out.print("{ ");
        for (int i = 0; i < source.length; i++) {
            System.out.print(source[i]);

            if (i < source.length - 1)
                System.out.print(", ");
        }
        System.out.println(" }");
    }

    public Object[] copyArray(Object[] source) {
        Object[] copy = new Object[source.length];

        for (int i = 0; i < source.length; i++) {
            copy[i] = source[i];
        }

        return copy;
    }

    public Object[] resize(Object[] array, int newLength){
        Object[] resizedArray = new Object[newLength];

        for (int i = 0; i < array.length; i++){
            if(i < resizedArray.length)
                resizedArray[i] = array[i];
        }

        return resizedArray;
    }

    public Object[] reverseArray(Object[] source) {
        Object[] copy = copyArray(source);

        int mid = copy.length / 2;
        for (int i = 0; i < mid; i++) {
            Object temp = copy[copy.length - 1 - i];
            copy[copy.length - 1 - i] = copy[i];
            copy[i] = temp;
        }

        return copy;
    }

    public Object[] shiftLeft(Object[] source, int start, int k) {
        Object[] copy = copyArray(source);

        int from = start + k;
        int to = start;

        for (int i = 0; i < copy.length - k - start; i++) {
            copy[to] = copy[from];
            to++;
            from++;
        }

        for(int j = 0; j < k; j++){
            copy[copy.length - 1 - j] = null;
        }

        return copy;
    }

    public Object[] shiftRight(Object[] source, int start, int k) {
        Object[] copy = copyArray(source);

        int from = copy.length - 1 - k;
        int to = copy.length - 1;

        for(int i = 0; i < copy.length - k - start; i++){
            copy[to] = copy[from];
            to--;
            from--;
        }

        for(int j = start; j < start + k; j++){
            copy[j] = 0;
        }

        return copy;
    }

    public Object[] insert(Object[] arr, int size, Object elem, int index) {
        if(size != arr.length){
            Object[] rightShifted = shiftRight(arr, index, 1);
            rightShifted[index] = elem;

            return rightShifted;
        }else {
            System.out.println("No space left.");
        }

        return null;
    }

    public Object[] remove(Object[] arr, int size, int index) {
        if(index >= 0 && index < size){
            Object[] leftShifted = shiftLeft(arr, index, 1);

            return leftShifted;
        }else{
            System.out.println("Invalid index.");
        }

        return null;
    }

    public Object[] rotateLeft(Object[] source, int k) {
        Object[] leftShifted = shiftLeft(source, 0, k);

        for(int i = 0; i < k; i++){
            leftShifted[leftShifted.length - 1 - (k - 1) + i] = source[i];
        }

        return leftShifted;
    }

    public Object[] rotateRight(Object[] source, int k) {
        Object[] rightShifted = shiftRight(source, 0, k);

        for(int i = 0; i < k; i++){
            rightShifted[i] = source[source.length - 1 - (k - 1) + i];
        }

        return rightShifted;
    }

}
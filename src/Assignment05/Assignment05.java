package Assignment05;

import java.util.Arrays;

public class Assignment05 {
    public static void main(String[] args) {
        // Task 01
        int x = 1123 % 40;
        int[] array1 = {x, x+10, x+100, x+20};

        //System.out.println(Arrays.toString(array1));
        int[] array2 = {x+20, x+30, x+60, x+40};

        //System.out.println(Arrays.toString(array2));
        int[] c = appendArrays(array1, array2);
        System.out.println(Arrays.toString(c));

        // Task 02
        x = 1123 % 35;
        int[] cir = {x+7, x+8, 0, 0, 0, x+1, x+2, x+3, x+4, x+5, x+6};

        System.out.println(Arrays.toString(cir));
        print(cir, 5, 8);
    }

    public static int[] appendArrays(int[] a, int[] b){
        int[] c = new int[a.length + b.length];
        int idx = 0;

        for (int value : a) {
            c[idx++] = value;
        }

        for (int value : b) {
            c[idx++] = value;
        }

        return c;
    }

    public static void print(int[] cir, int start, int size){
        int offset = start + size - 1;

        for(int i = 0; i < size; i++){
            if(cir[offset % cir.length] != 0 && cir[offset % cir.length] % 2 == 0)
                System.out.print(cir[offset % cir.length] + " ");

            offset--;
            if (offset == -1)
                offset = cir.length - 1;
        }

        System.out.println();
    }
}

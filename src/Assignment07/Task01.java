package Assignment07;

public class Task01 {
    public static void main(String[] args) {
        int[] ar = {2, 3, 6, 9, 12};
        int res = binSearchIterative(6, ar);
        System.out.println(res);
        res = binSearchRecursive(9, 0, ar.length, ar);
        System.out.println(res);
    }

    public static int binSearchIterative(int num, int[] array) {
        int left = 0;
        int right = array.length - 1;

        while (right >= left) {
            int mid = (right + left) / 2;

            if (array[mid] == num) {
                return mid;
            } else if (array[mid] < num) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public static int binSearchRecursive(int num, int left, int right, int[] array) {
        if (right >= left) {
            int mid = (right + left) / 2;

            if (array[mid] == num) {
                return mid;
            } else if (array[mid] < num) {
                return binSearchRecursive(num, mid + 1, right, array);
            } else {
                return binSearchRecursive(num, left, mid - 1, array);
            }
        } else {
            return -1;
        }
    }
}

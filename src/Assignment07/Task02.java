package Assignment07;

public class Task02 {
    public static void main(String[] args) {
        int res = sum(10);
        System.out.println(res);
    }

    public static int sum(int n){
        
        if (n == 0)
            return n;

        return (n - 1) + sum(n - 1);
    }
}

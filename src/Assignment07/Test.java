package Assignment07;

public class Test {
    public static void main(String[] args) {
        mystery4("abcd");
        //System.out.println("ab".substring(0, 1));
    }

    public static void mystery4(String s) { if (s.length() > 0) {
        System.out.print(s.charAt(0)); if (s.length() % 2 == 0){
            mystery4(s.substring(0, s.length() -1)); }
        else{
            System.out.println("**");
            System.out.println("#"+ s.length()+ s.length()+"*");
            mystery4(s.substring(1, s.length()));
            System.out.print(s.charAt(s.length() - 1));
        }
    }
    }
}

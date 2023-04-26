package lab3;

public class hw1_5 {
    public static void main(String[] args) {
        System.out.println("fact = " + fact(5));
    }
    public static int fact(int n) {
        System.out.println(n);
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fact(n - 2)+fact(n - 1);
        }
    }
}
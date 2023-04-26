package lab3;

import java.util.Scanner;

public class hw2 {
    public static Scanner in = new Scanner(System.in);
    public static void dw(int x) {
        if (x > 0) {
            dw(x / 2);
            System.out.print(x % 2);
        }
    }

    public static void main(String[] args) {
        System.out.println("Type any number: ");
        int f = in.nextInt();
        hw2.dw(f);
    }
}

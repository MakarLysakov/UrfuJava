package lab1;

import java.util.Scanner;

public class hw8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Type first number ");
        int a = in.nextInt();
        System.out.println("Type second number ");
        int b = in.nextInt();

        System.out.printf("Sum of a two number is equal %d", a + b);
    }
}

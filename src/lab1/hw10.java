package lab1;

import java.util.Scanner;

public class hw10 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Type are first number ");
        int a = in.nextInt();
        System.out.println("Type are first number ");
        int b = in.nextInt();

        System.out.printf("Sum of two numbers %d\n Difference of two numbers %d", a + b, a - b);
        in.close();
    }
}

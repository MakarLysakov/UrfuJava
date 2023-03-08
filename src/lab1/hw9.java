package lab1;

import java.util.Scanner;

public class hw9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("type any number");
        int number = in.nextInt();

        System.out.printf("%d number - 1\n%d number\n%d number + 1\n%d number in power 2", number - 1, number,
                number + 1, number * number);
        in.close();
    }
}

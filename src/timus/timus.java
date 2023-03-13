package timus;

import java.util.Scanner;

public class timus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Type N");
        int N = in.nextInt();
        System.out.println("Type A");
        int A = in.nextInt();
        System.out.println("Type B");
        int B = in.nextInt();

        System.out.printf("You need a %d nanogramms of ...", N*A*B*2);
    }
}

package lab1;

import java.util.Scanner;

public class hw2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Type your name: ");
        String name = in.nextLine();

        System.out.println("Type your age ");
        int age = in.nextInt();

        System.out.printf("Takomu lbu y}i{e %d. Pora u dela delat', %s", age, name);
        in.close();
    }
}

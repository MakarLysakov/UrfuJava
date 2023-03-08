package lab1;

import java.util.Scanner;
public class hw1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Type your name: ");
        String name= in.nextLine();


        System.out.println("Type your surname: ");
        String surname = in.nextLine();


        System.out.println("Type your fathername: ");
        String fathername = in.nextLine();

        System.out.printf("Hello %s %s %s", surname, name, fathername);
        in.close();
    }
}
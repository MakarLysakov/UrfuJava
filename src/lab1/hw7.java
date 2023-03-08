package lab1;

import java.util.Date;
import java.util.Scanner;

public class hw7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Date date = new Date();

        System.out.println("Type your age ");
        int age = in.nextInt();
        System.out.printf("Your birthyear is a %d", date.getYear() + 1900 - age);
        in.close();
    }
}

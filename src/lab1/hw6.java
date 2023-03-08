package lab1;

import java.util.Date;
import java.util.Scanner;

public class hw6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Date date = new Date();

        System.out.println("Type your name");
        String name = in.nextLine();
        System.out.println("Type your birthday year");
        int byear = in.nextInt();

        System.out.printf("Your name is %s and your age is %d", name, date.getYear() + 1900 - byear);
        in.close();
    }
}

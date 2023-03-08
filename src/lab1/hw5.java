package lab1;

import java.util.Scanner;
import java.util.Date;

public class hw5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Date date = new Date();
        int year = date.getYear() + 1900;
        System.out.println("Type your birthday year ");
        int number = in.nextInt();

        System.out.printf("I guess your age is %d", year - number);
        in.close();
    }
}

package lab1;

import java.util.Scanner;

public class hw4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Type name of a month ");
        String nameofamonth = in.nextLine();

        System.out.println("Type number of days ");
        int number = in.nextInt();

        System.out.printf("In %s, %d days.", nameofamonth, number);
        in.close();
    }
}

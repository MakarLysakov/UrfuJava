package lab1;

import java.util.Scanner;
public class hw3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Type name of a day ");
        String nameofaday = in.nextLine();

        System.out.println("Type name of a month ");
        String nameofamonth = in.nextLine();

        System.out.println("Type number of a day ");
        int number = in.nextInt();

        System.out.printf("Today is a  %s, my dudes. %d %s.", nameofaday, number, nameofamonth);
        in.close();
    }
}

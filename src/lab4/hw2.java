package lab4;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.System.exit;

public class hw2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        ArrayList<Integer> mas = new ArrayList<>();
        int cnt = 0;
        float avg = 0;

        System.out.println("Type number of elements: ");
        int colvo = in.nextInt();

        for (int i = 0; i < colvo; i++){
            try {
                System.out.println("Type the number: ");
                int number = in.nextInt();
                mas.add(number);
                if (number > 0) {
                    cnt++;
                    avg += number;
                }
            } catch (InputMismatchException f) {
                System.out.println("Not a int");
                System.exit(0);
            }
        }

        try {
            if (cnt == 0) {
                throw new RuntimeException();
            } else {
                System.out.println(avg/cnt);
            }
        } catch (RuntimeException e) {
            System.out.println("Mas has not positive elements");

    }
}
}

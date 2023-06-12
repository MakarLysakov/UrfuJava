package timus;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class timus1001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Long> numbers = new ArrayList<>();

        while (scanner.hasNextLong()) {
            Long number = scanner.nextLong();
            numbers.add(number);
        }

        Collections.reverse(numbers);
        numbers.forEach(n -> System.out.printf("%.4f\n", Math.sqrt(n)));
    }
}

package lab4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class hw4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Type length of mas: ");
        int lenght = in.nextInt();
        int summ = 0;

        byte[] mas = new byte[lenght];

        for(int i = 0; i < lenght; i++){
            try{
                System.out.println("Type a number");
                byte num = in.nextByte();
                summ = summ + num;
                try {
                    if ((num < -128 || num > 127) || (summ < -128 || summ > 127)){
                        throw new RuntimeException();
                    }
                } catch (RuntimeException e) {
                    System.out.println("Not in byte range");
                    System.exit(0);
                }

            } catch (InputMismatchException f) {
                System.out.println("Not a byte");
                System.exit(0);
            }

        }

        System.out.printf("The sum is %d",summ);
    }
}

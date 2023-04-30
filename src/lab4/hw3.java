package lab4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class hw3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Type number of rows in matrix: ");
        int num_of_rows = in.nextInt();
        System.out.println("Type number of colomns in matrix: ");
        int num_of_col = in.nextInt();

        int[][] mas = new int[num_of_rows][num_of_col];
        for (int i = 0; i < num_of_rows*num_of_col; i++){
            mas[i/num_of_col][i%num_of_col] = i;
        }

        try{
            System.out.println("Type number of rows in matrix: ");
            int intr_col = in.nextInt();
            try {
                for (int i = 0; i < num_of_rows; i++){
                    System.out.println(mas[i][intr_col]);
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Mas isn't big");
                System.exit(0);
            }
        } catch (InputMismatchException f) {
            System.out.println("Not a int");
            System.exit(0);
        }


    }
}

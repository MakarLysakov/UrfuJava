package lab2;

import java.util.Scanner;

public class hw2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Type number of rows: ");
        int num_of_rows = in.nextInt();
        System.out.println("Type number of columns: ");
        int num_of_col = in.nextInt();

        int[][] mas = new int[num_of_rows][num_of_col];
        int col_i = 0;
        int ch = 0;

        for (int row_i = 0; row_i < num_of_rows; row_i++) {
            if (col_i == 0) {
                for (col_i = 0; col_i < num_of_col; col_i++) {
                    mas[row_i][col_i] = ch;
                    ch++;
                }
            } else {
                for (col_i = num_of_col - 1; col_i > -1; col_i--) {
                    mas[row_i][col_i] = ch;
                    ch++;
                }
            }
        }
        for (int i = 0; i < num_of_rows; i++){
            for (int j = 0; j < num_of_col; j++){
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }
    }
}

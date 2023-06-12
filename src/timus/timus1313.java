package timus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class timus1313 {
    public static void main(String[] args) {

        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            int size = Integer.parseInt(bufferedReader.readLine());

            int[][] ints = new int[size][size];

            String readLine = "";

            for (int i = 0; ((readLine = bufferedReader.readLine()) != null); i++){
                String[] strings = readLine.split(" ");
                for (int j = 0; j < size; j++) {
                    ints[i][j] = Integer.parseInt(strings[j]);
                }
            }
            for (int i = 0; i < size; i++){
                for (int j = i; j>=0; j--){
                    System.out.print(ints[j][i-j] + " ");
                }
            }

            for (int i = 1; i < size; i++){
                for (int j = size - 1; j >= i; j--){
                    System.out.print(ints[j][size - j + i - 1] + " ");
                }
            }

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
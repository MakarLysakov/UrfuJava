package timus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

public class timus1910 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int size = Integer.parseInt(bufferedReader.readLine());
        String[] strings = bufferedReader.readLine().split(" ");
        int[] intsAfter = new int[size - 2];

        for (int i = 0; i < intsAfter.length; i++){
            intsAfter[i] = Integer.parseInt(strings[i]) +
                    Integer.parseInt(strings[i + 1]) +
                    Integer.parseInt(strings[i + 2]);
        }

        int[] ints = Arrays.copyOf(intsAfter, intsAfter.length);
        Arrays.sort(intsAfter);

        int firstValue = intsAfter[intsAfter.length-1];

        for(int i = 0; i < intsAfter.length; i++){
            if(ints[i] == firstValue){
                out.println(firstValue + " " + (i + 2));
                break;
            }
        }
        out.flush();
    }
}

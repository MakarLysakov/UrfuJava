package lab3;

import java.util.ArrayList;
import java.util.Scanner;

public class hw3 {
    public static ArrayList<Integer> mas = new ArrayList();
    public static Scanner in = new Scanner(System.in);
    public static int cnt = 0;
    public static void put(int x) {

        if (x > cnt){
            cnt = cnt + 1;
            put(x);
            System.out.println("Type any number: ");
            int r = in.nextInt();
            mas.add(r);
        }

    }

    public static void output(int cnt) {
        if (cnt > 0){
            cnt = cnt - 1;
            output(cnt);
            System.out.println(mas.get(cnt));
        }
    }

    public static void main(String[] args) {
        System.out.println("Type number of elements: ");
        int f = in.nextInt();
        hw3.put(f);
        hw3.output(f);
    }
}

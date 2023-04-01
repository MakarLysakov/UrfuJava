package lab2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class hw1 {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner in = new Scanner(System.in);

        System.out.println("Type number of elements in mas: ");
        int r = in.nextInt();

        System.out.println("Type max possible value in mas: ");
        int mv = in.nextInt();

        int minvalue = mv + 2;

        ArrayList<Integer> mas = new ArrayList();
        ArrayList<Integer> mas_index = new ArrayList();

        for (int i = 0; i < r; i ++){
            mas.add(random.nextInt(mv + 1));
            System.out.println(mas.get(i));

            if (mas.get(i) < minvalue){
                minvalue = mas.get(i);
                mas_index.clear();
                mas_index.add(i);
            } else if (mas.get(i) == minvalue) {
                mas_index.add(i);
            }
        }
        System.out.printf("The minimal value in list is %d", minvalue);
        System.out.println();
        System.out.println("Indexs of minimal value is " + mas_index);


    }
}

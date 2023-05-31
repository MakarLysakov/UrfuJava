package lab6;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class hw10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = in.nextInt();

        int[] arr = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++){
            arr[i] = random.nextInt(200);
        }

        System.out.println("Введите границу");
        int threshold = in.nextInt();

        System.out.println("Исходный массив");
        System.out.println(Arrays.toString(arr));

        System.out.println("Измененный массив");
        int[] arrWithBigNumbers = numbersFilter(arr, threshold);
        System.out.println(Arrays.toString(arrWithBigNumbers));

    }

    private static  int[] numbersFilter(int[] arr, int threshold) {
        return Arrays.stream(arr).filter(x -> x < threshold).toArray();
    }
}

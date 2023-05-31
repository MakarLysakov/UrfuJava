package lab6;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class hw6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = in.nextInt();

        System.out.println("Введите число для фильтрации");
        int number = in.nextInt();

        int[] arr = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++){
            arr[i] = random.nextInt();
        }

        System.out.println("Массив arr : ");
        System.out.println(Arrays.toString(arr));

        int[] arrResult = filterNumbersByInputNumber(arr, number);

        System.out.println("Массив arrResult :");
        System.out.println(Arrays.toString(arrResult));
    }

    public static int[] filterNumbersByInputNumber(int[] arr, int number){
        return Arrays.stream(arr).filter(x -> x % number == 0).toArray();
    }
}

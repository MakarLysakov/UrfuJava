package lab3;

import java.util.*;

public class hw9_ArLs {
    public static void main(String[] args) {
        int multiplier = 1000;

        Random random = new Random(3);
        long start;
        long i;

        ArrayList<Integer> arrayList = new ArrayList<>();

        //заполняем 14млн (1млн * номер варианта)
        for (i = 0; i < 14_000_000; i++) {
            int value = random.nextInt(14_000_000);
            arrayList.add(value);
        }
// ------------------------------------------------------------------------------------------------------
        //запускаем таймер
        start = System.currentTimeMillis();
        for (i = 0; i < multiplier; i++) {
            arrayList.add(0, 0);
        }
        //останавливаем, находя разность между нынешним моментом и стартом
        System.out.printf("Добавление в начало = %d ms\n", System.currentTimeMillis() - start);

        start = System.currentTimeMillis();
        for (i = 0; i < multiplier; i++) {
            arrayList.add(7_000_000, 0);
        }
        System.out.printf("Добавление в середину = %d ms\n", System.currentTimeMillis() - start);

        start = System.currentTimeMillis();
        for (i = 0; i < multiplier; i++) {
            arrayList.add(0);
        }
        System.out.printf("Добавление в конец = %d ms\n", System.currentTimeMillis() - start);
// ------------------------------------------------------------------------------------------------------
        start = System.currentTimeMillis();
        for (i = 0; i < multiplier; i++) {
            arrayList.remove(0);
        }
        System.out.printf("Удаление в начале = %d ms\n", System.currentTimeMillis() - start);

        start = System.currentTimeMillis();
        for (i = 0; i < multiplier; i++) {
            arrayList.remove(7_000_000);
        }
        System.out.printf("Удаление из середины = %d ms\n", System.currentTimeMillis() - start);

        start = System.currentTimeMillis();
        for (i = 0; i < multiplier; i++) {
            arrayList.remove(13_999_999);
        }
        System.out.printf("Удаление в конце = %d ms\n", System.currentTimeMillis() - start);
// ------------------------------------------------------------------------------------------------------


        start = System.currentTimeMillis();
        for (i = 0; i < multiplier; i++) {
            arrayList.get(random.nextInt(1_400_000));
        }
        System.out.printf("Получение по индексу = %d ms\n", System.currentTimeMillis() - start);

        System.out.println();
    }

}

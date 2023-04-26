package lab3;

import java.util.LinkedHashSet;
import java.util.Random;

public class hw9_LHS {

    public static void main(String[] args) {
        int multiplier = 1000;

        Random random = new Random(3);
        long start;
        int i;

        LinkedHashSet<Integer> LHM = new LinkedHashSet<>();

        //заполняем 14млн (1млн * номер варианта)
        for (i = 0; i < 14_000_000; i++) {
            LHM.add(i);
        }
// ------------------------------------------------------------------------------------------------------
        //запускаем таймер
        start = System.currentTimeMillis();
        for (i = 0; i < multiplier; i++) {
            LHM.add(i);
        }
        //останавливаем, находя разность между нынешним моментом и стартом
        System.out.printf("Добавление в начало = %d ms\n", System.currentTimeMillis() - start);

        start = System.currentTimeMillis();
        for (i = 0; i < multiplier; i++) {
            LHM.add(7_000_000);
        }
        System.out.printf("Добавление в середину = %d ms\n", System.currentTimeMillis() - start);

        start = System.currentTimeMillis();
        for (i = 0; i < multiplier; i++) {
            LHM.add(13_999_999+(2*multiplier)+i);
        }
        System.out.printf("Добавление в конец = %d ms\n", System.currentTimeMillis() - start);
// ------------------------------------------------------------------------------------------------------
        start = System.currentTimeMillis();
        for (i = 0; i < multiplier; i++) {
            LHM.remove(i);
        }
        System.out.printf("Удаление в начале = %d ms\n", System.currentTimeMillis() - start);

        start = System.currentTimeMillis();
        for (i = 0; i < multiplier; i++) {
            LHM.remove(7_000_000+i);
        }
        System.out.printf("Удаление из середины = %d ms\n", System.currentTimeMillis() - start);

        start = System.currentTimeMillis();
        for (i = 0; i < multiplier; i++) {
            LHM.remove(13_999_999-(2*multiplier)-i);
        }
        System.out.printf("Удаление в конце = %d ms\n", System.currentTimeMillis() - start);
// ------------------------------------------------------------------------------------------------------


        start = System.currentTimeMillis();
        for (i = 0; i < multiplier; i++) {
            // LHM.get(random.nextInt(1_400_000));
        }
        System.out.printf("Получение по индексу = %d ms\n", System.currentTimeMillis() - start);

        System.out.println();
    }

}


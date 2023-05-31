package lab6;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class hw7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите длину подстроки");
        int size = in.nextInt();

        List<String> list_with_strings = Arrays.asList("htnggr", "kllnggr", "bdnggr", "asmdl");
        List<String> StringsWithSubstrings = lenghtOfSubstring(list_with_strings, size);
        System.out.println(StringsWithSubstrings);


    }

    private static  List<String> lenghtOfSubstring(List<String> strings, int size) {
        return strings.stream().filter(s -> s.length() > size).collect(Collectors.toList());
    }
}

package lab6;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class hw9 {
    public static void main(String[] args) {
        List<String> list_with_strings = Arrays.asList("htnggr", "kllnggr", "bdnggr", "asmdl9");
        List<String> onlyLetters = listWithoutNumbers(list_with_strings);
        System.out.println(onlyLetters);


    }

    private static  List<String> listWithoutNumbers(List<String> strings) {
        return strings.stream().filter(s -> s.chars().allMatch(Character::isLetter)).collect(Collectors.toList());
    }
}

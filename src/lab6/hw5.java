package lab6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class hw5 {
    public static void main(String[] args) {
        List<String> list_with_strings = Arrays.asList("htnggr", "kllnggr", "bdnggr", "asmdl");
        String substring = "nggr";
        List<String> StringsWithSubstrings = SubstringFilter(list_with_strings, substring);
        System.out.println(StringsWithSubstrings);
    }

    private static List<String> SubstringFilter(List<String> strings, String substring) {
        return strings.stream().filter(s -> s.contains(substring)).collect(Collectors.toList());
    }
}

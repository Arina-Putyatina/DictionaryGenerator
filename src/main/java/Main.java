import java.util.Arrays;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        final String text = "исходный текст для генерации словаря аборигенов";

        Function<String, String[]> splitWords = x -> x.split(" ");
        SortWords(text, splitWords);
    }

    public static void SortWords(String text, Function<String, String[]> splitWords) {
        Arrays.stream((splitWords.apply(text)))
                .sorted()
                .forEach(System.out::println);
    }
}

package  com.telran;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static List<String> badWords = Arrays.asList("badwords1","badwords", "badwords1", "bad", "badwords3");

    public static void main(String[] args) {

        String text = "badwords - bad words";
        System.out.println(badWords(text));
    }

    public static List<String> badWords(String text) {
        return Arrays.asList(text.split(" "))
                .stream()
                .map(String::toLowerCase)
                .distinct()
                .sorted()
                .filter(badWords -> badWords.contains(badWords))
                .collect(Collectors.toList());
    }
}
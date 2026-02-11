package maratonajava.javacore.ZZEstreams.test;

import java.util.List;
import java.util.stream.Stream;

public class StreamTest05 {
    public static void main(String[] args) {
        List<String> words = List.of("Gomu", "Gomu", "No", "Mi");

        List<String> letters = words.stream()
                .flatMap(word -> Stream.of(word.split("")))
                .toList();

        System.out.println(letters);
    }
}

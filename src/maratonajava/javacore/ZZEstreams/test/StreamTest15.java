package maratonajava.javacore.ZZEstreams.test;

import maratonajava.javacore.ZZEstreams.dominio.Category;
import maratonajava.javacore.ZZEstreams.dominio.LightNovel;
import maratonajava.javacore.ZZEstreams.dominio.Promotion;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;
import static maratonajava.javacore.ZZEstreams.dominio.Promotion.NORMAL_PRICE;
import static maratonajava.javacore.ZZEstreams.dominio.Promotion.UNDER_PROMOTION;

public class StreamTest15 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99, Category.FANTASY),
            new LightNovel("Overlord", 10.99, Category.FANTASY),
            new LightNovel("Violet Evergarden", 5.99, Category.DRAMA),
            new LightNovel("No Game no life", 2.99, Category.FANTASY),
            new LightNovel("Fullmatal alchemist", 5.99, Category.FANTASY),
            new LightNovel("Kumo desuga", 1.99, Category.FANTASY),
            new LightNovel("Kumo desuga", 1.99, Category.FANTASY),
            new LightNovel("Monogatari", 4.00, Category.ROMANCE)
    ));

    public static void main(String[] args) {
        Map<Category, DoubleSummaryStatistics> collect = lightNovels.stream()
                .collect(groupingBy(LightNovel::getCategory, Collectors.summarizingDouble(LightNovel::getPrice)));
        System.out.println(collect);

        Map<Category, List<Promotion>> collect1 = lightNovels.stream()
                .collect(groupingBy(LightNovel::getCategory, mapping(StreamTest15::getPromotion, Collectors.toList())));
        System.out.println(collect1);

        Map<Category, Set<Promotion>> collect2 = lightNovels.stream()
                .collect(groupingBy(LightNovel::getCategory, mapping(StreamTest15::getPromotion, Collectors.toSet())));
        System.out.println(collect2);

        Map<Category, Collection<Promotion>> collect3 = lightNovels.stream()
                .collect(groupingBy(LightNovel::getCategory, mapping(StreamTest15::getPromotion,
                        toCollection(LinkedHashSet::new))));
        System.out.println(collect3);
    }

    private static Promotion getPromotion(LightNovel ln) {
        return ln.getPrice() < 6 ? UNDER_PROMOTION : NORMAL_PRICE;
    }
}

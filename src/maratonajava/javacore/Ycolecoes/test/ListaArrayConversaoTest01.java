package maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaArrayConversaoTest01 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        // De um ArrayList para um Array
        Integer[] listToArray = numeros.toArray(new Integer[0]);
        System.out.println(Arrays.toString(listToArray));

        System.out.println("------------");

        Integer[] numerosArray = new Integer[3];
        numerosArray[0] = 1;
        numerosArray[1] = 2;
        numerosArray[2] = 3;

        // De um Array para uma List (cria um link entre o Array e a List)
        List<Integer> arrayToList = Arrays.asList(numerosArray);
        arrayToList.set(0, 12);
        System.out.println(Arrays.toString(numerosArray));
        System.out.println(arrayToList);

        // De um Array para um List sem vínculo entre eles
        System.out.println("------------");
        List<Integer> numerosList = new ArrayList<>(Arrays.asList(numerosArray));
        numerosList.add(15);
        System.out.println(numerosList);

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        List<String> list1 = Arrays.asList("1", "2", "3", "4", "5");

        List<Integer> integers = List.of(9, 8, 7, 6);
        List<String> strings = List.of("9", "8", "7", "6");
    }
}

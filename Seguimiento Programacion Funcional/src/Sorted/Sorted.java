package Sorted;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sorted {

    public static void main(String[] args) {

        List<String> lista = Arrays.asList("J", "U", "L", "I", "A", "N", "A", "1", "0");

        List<String> sortedList = lista.stream().sorted().collect(Collectors.toList());

        sortedList.forEach(System.out::println);

    }
}
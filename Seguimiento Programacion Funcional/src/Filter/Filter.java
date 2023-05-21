package Filter;

import java.util.stream.Stream;

class Filter {
    public static void main(String[] args)
    {

        Stream<String> stream = Stream.of(
                "Juan", "Auto", "Sandra", "Juliana", "Perro");

        stream.filter(str -> str.endsWith("a"))
                .forEach(System.out::println);
    }
}
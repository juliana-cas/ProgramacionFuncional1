package Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Predicate {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(10, 9, 28, 50, 192, 39, 226);

        java.util.function.Predicate<Integer> esMayorA30 = num -> num > 30;

        List<Integer> numerosFiltrados = filtrarNumeros(numeros, esMayorA30);

        System.out.println("Números mayores a 30: " + numerosFiltrados);
    }

    public static List<Integer> filtrarNumeros(List<Integer> numeros, java.util.function.Predicate<Integer> predicado) {
        List<Integer> resultado = new ArrayList<>();
        for (Integer num : numeros) {
            if (predicado.test(num)) {
                resultado.add(num);
            }
        }
        return resultado;
    }
}

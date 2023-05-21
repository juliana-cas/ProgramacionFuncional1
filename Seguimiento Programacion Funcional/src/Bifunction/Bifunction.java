package Bifunction;

import java.util.function.BiFunction;

public class Bifunction {
    public static void main(String[] args) {
        int numero1 = 15;
        int numero2 = 31328;

        BiFunction<Integer, Integer, Integer> sumar = (n, n2) -> n + n2;

        int resultado = sumar.apply(numero1, numero2);

        System.out.println(numero1 + " + " + numero2 + " = " + resultado);
    }
}
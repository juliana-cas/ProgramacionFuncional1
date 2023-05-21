package Biconsumer;

import java.util.function.BiConsumer;

public class Biconsumer {
    public static void main(String[] args) {
        String nombre = "Juliana";
        int edad = 18;

        BiConsumer<String, Integer> NombreYEdad = (n, e) ->
                System.out.println(n + " tiene " + e + " años.");

        NombreYEdad.accept(nombre, edad);
    }
}

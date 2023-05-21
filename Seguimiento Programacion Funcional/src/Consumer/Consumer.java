package Consumer;

import java.util.ArrayList;
import java.util.List;

class Consumer {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();
        nombres.add("Juliana");
        nombres.add("Leidy");
        nombres.add("Juan");

        java.util.function.Consumer<String> imprimirEnMayusculas = nombre -> System.out.println(nombre.toUpperCase());

        nombres.forEach(imprimirEnMayusculas);
    }
}
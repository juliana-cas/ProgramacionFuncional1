package Function;

public class Function {
    public static void main(String[] args) {
        String texto = "Programación funcional";
        System.out.println(texto);

        java.util.function.Function<String, Integer> obtenerLongitud = str -> str.length();

        int longitud = obtenerLongitud.apply(texto);

        System.out.println("Longitud del texto: " + longitud);
    }
}

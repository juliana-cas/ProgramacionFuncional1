package Supplier;

public class Supplier {
    public static void main(String[] args) {
        java.util.function.Supplier<Double> numeroSupplier = () -> Math.random();
        double numeroAleatorio = numeroSupplier.get();
        System.out.println("Número aleatorio: " + numeroAleatorio);

        java.util.function.Supplier<String> saludoSupplier = () -> {
            String[] Nombres = {"Juliana", "Aldo", "Juan", "Natalia"};
            int aleatorio = (int) (Math.random() * Nombres.length);
            return Nombres[aleatorio];
        };

        String saludo = saludoSupplier.get();
        System.out.println("Buenos días " + saludo);
    }
}
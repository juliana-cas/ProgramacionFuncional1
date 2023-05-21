package Map;
import java.util.HashMap;
public class Map {

    public static void main(String[] args) {
        java.util.Map<String, Integer> vehiculos = new HashMap<>();


        vehiculos.put("Tesla", 5);
        vehiculos.put("Mazda", 10);
        vehiculos.put("Maserati", 2);
        vehiculos.put("Lamborghini", 4);

        System.out.println("Total De Vehiculos: " + vehiculos.size());

        for (String key : vehiculos.keySet())
            System.out.println(key + " - " + vehiculos.get(key));
        System.out.println();

        String searchKey = "Maserati";
        if (vehiculos.containsKey(searchKey))
            System.out.println("Total de " + vehiculos.get(searchKey) + " " + searchKey + "!\n");

        vehiculos.clear();

        System.out.println("Después de analizarlo bien, el tamaño es: " + vehiculos.size());
    }
}
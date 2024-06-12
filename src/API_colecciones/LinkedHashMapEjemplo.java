
package API_colecciones;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapEjemplo {

    public static void main(String[] args) {
        LinkedHashMap<String, Integer> mapaEnlazado = new LinkedHashMap<>();
        
        mapaEnlazado.put("Abrigo", 2);
        mapaEnlazado.put("Botas", 6);
        mapaEnlazado.put("Camisa", 4);
        
        // Mostrar todos los elementos del mapa en el orden de inserción
        System.out.println("Elementos en el mapa en orden de inserción: " + mapaEnlazado);

        // Obtener y mostrar el valor asociado con una clave
        System.out.println("Cantidad de abrigos: " + mapaEnlazado.get("Abrigo"));

        // Comprobar si una clave esta en el mapa
        System.out.println("¿El mapa contiene la clave 'Botas'? " + mapaEnlazado.containsKey("Botas"));
        
        // Eliminar un mapeo en el mapa
        mapaEnlazado.remove("Camisa");
        System.out.println("Elemento 'Camisa' eliminado");
        
        // Iterar mapa
        for (Map.Entry<String, Integer> entry : mapaEnlazado.entrySet()) {
            System.out.println("Clave: " + entry.getKey() + ", Valor: " + entry.getValue());
        }
        
        // Mostrar el tamaño del mapa
        System.out.println("Tamaño del mapa: " + mapaEnlazado.size());
    }
}

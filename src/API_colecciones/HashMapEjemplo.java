
package API_colecciones;

import java.util.HashMap;


public class HashMapEjemplo {

    
    public static void main(String[] args) {
        
        HashMap<String, Integer> mapa = new HashMap<>();
        
        // Agregar pares clave-valor al mapa
        mapa.put("Abrigo", 2);
        mapa.put("Botas", 6);
        mapa.put("Camisa", 4);
        
        // Obtener y mostrar el valor asociado con una clave
        System.out.println("Cantidad de abrigos: " + mapa.get("Abrigo"));

        // Comprobar si una clave esta en el mapa
        System.out.println("¿El mapa contiene la clave 'Botas'? " + mapa.containsKey("Botas"));
        
        // Eliminar un mapeo en el mapa
        mapa.remove("Camisa");
        
        // Iterar mapa
        for (HashMap.Entry<String, Integer> entry : mapa.entrySet()) {
            System.out.println("Clave: " + entry.getKey() + ", Valor: " + entry.getValue());
        }
        
        // Mostrar el tamaño del mapa
        System.out.println("Tamaño del mapa: " + mapa.size());
    }
}

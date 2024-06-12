
package API_colecciones;

import java.util.TreeMap;


public class TreeMapEjemplo {

    
    public static void main(String[] args) {
        
        TreeMap<String, Integer> mapaOrdenado = new TreeMap<>();
        
        mapaOrdenado.put("Abrigo", 2);
        mapaOrdenado.put("Botas", 4);
        mapaOrdenado.put("Camisa", 6);
        
        // Mostrar elementos del mapa ordenado por clave
        System.out.println("Elementos en el mapa ordenado:" + mapaOrdenado);
        
        // Obtener la primera clave
        System.out.println("Primera clave: " + mapaOrdenado.firstKey());
        
        // Obtener la ultima clave
        System.out.println("Última clave: " + mapaOrdenado.lastKey());
    }
}


package API_colecciones;

import java.util.HashSet;


public class HashSetEjemplo {

    
    public static void main(String[] args) {
        
        HashSet<String> conjunto = new HashSet<>();
        
        //Agregar elementos al conjunto
        conjunto.add("Abrigo");
        conjunto.add("Botas");
        conjunto.add("Camisa");
        
        conjunto.add("Abrigo"); //Este elemento ya existe, no se va a agregar
        
        //Mostrar conjunto
        System.out.println(conjunto);
        
        // Eliminar un elemento del conjunto
        conjunto.remove("Botas");
        
        System.out.println("Conjunto actualizado "
                + "al eliminar el elemento 'Botas': " + conjunto);
        
        System.out.println("Cantidad de elementos: " + conjunto.size());
        
        System.out.println("¿El conjunto esta vacio? " + conjunto.isEmpty());
        
        // Verificar si el conjunto contiene "Camisa"
        System.out.println("¿El conjunto contiene 'Camisa'? " + conjunto.contains("Camisa"));
    }
}

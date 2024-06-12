
package API_colecciones;

import java.util.LinkedList;

public class LinkedListEjemplo {

    
    public static void main(String[] args) {
        
        LinkedList<String> lista = new LinkedList<>();
        
        //Agregar elementos a la lista
        lista.add("Abrigo");
        lista.add("Botas");
        lista.add("Camisa");
        
        //Agregar un elemento al inicio
        lista.addFirst("Gorra");
        
        //Agregar un elemento a una posicion de la lista
        lista.add(1, "Pantalon");
        
        //Mostrar lista
        System.out.println(lista);
        
        //Tomar un elemento de la lista y mostarlo
        System.out.println("Elemento en la posicion "
                + "numero 2 de la lista: " + lista.get(2));
        
        //Eliminar un elemento en una posicion de la lista
        lista.remove(1);
        
        System.out.println("Lista actualizada "
                + "al eliminar el elemento en la posicion 1: " + lista);
        
        System.out.println("Tamaño de la lista: " + lista.size());
    }
}

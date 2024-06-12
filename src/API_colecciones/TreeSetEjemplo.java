
package API_colecciones;


import java.util.TreeSet;


public class TreeSetEjemplo {

    
    public static void main(String[] args) {
        
        TreeSet<Integer> conjuntoOrdenado = new TreeSet<>();
        
        conjuntoOrdenado.add(1);
        conjuntoOrdenado.add(3);
        conjuntoOrdenado.add(4);
        conjuntoOrdenado.add(2);
        
        // Mostrar conjunto ordenado
        System.out.println("Elementos del conjunto ordenado:" + conjuntoOrdenado);
        
        // Obtener el primer elemento
        System.out.println("Primer elemento en el conjunto: " + conjuntoOrdenado.first());
        
        // Obtener el último elemento
        System.out.println("Último elemento en el conjunto: " + conjuntoOrdenado.last());
        
        //Obtener los elementos antes de
        System.out.println("Elementos antes del numero 3: " + conjuntoOrdenado.headSet(3));
    }
}

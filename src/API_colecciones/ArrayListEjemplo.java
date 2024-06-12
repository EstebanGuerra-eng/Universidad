/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package API_colecciones;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class ArrayListEjemplo {
    
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> nombres = new ArrayList<>();

        nombres.add("Juan");
        nombres.add("Maria");
        nombres.add("Pedro");

        String primerNombre = nombres.get(0);
        System.out.println("El primer nombre en la lista es: " + primerNombre);

        nombres.remove(1); 
        System.out.println("Lista despues de eliminar a Maria: " + nombres);
    }
}

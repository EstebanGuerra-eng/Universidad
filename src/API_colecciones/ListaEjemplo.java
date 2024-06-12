/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package API_colecciones;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class ListaEjemplo {

    public static void main(String[] args) {
        // TODO code application logic here

        List<Integer> numeros = new ArrayList<>();

        numeros.add(89);
        numeros.add(32);
        numeros.add(9);

        System.out.println("El segundo elemento de la lista es: " + numeros.get(2));
    }
}

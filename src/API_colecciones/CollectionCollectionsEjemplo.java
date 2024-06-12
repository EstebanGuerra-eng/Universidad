/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package API_colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author User
 */
public class CollectionCollectionsEjemplo {

    public static void main(String[] args) {
        // TODO code application logic here

        List<String> tareas = new ArrayList<>();
        tareas.add("Tarea 3");
        tareas.add("Tarea 1");
        tareas.add("Tarea 2");

        Collections.sort(tareas);

        for (String tarea : tareas) {
            System.out.println(tarea);
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package API_colecciones;

import java.util.Dictionary;
import java.util.Hashtable;

/**
 *
 * @author User
 */
public class DictionaryEjemplo {

    public static void main(String[] args) {

        Dictionary<String, String> agenda = new Hashtable<>();

        agenda.put("Andres Lopez", "3007869034");
        agenda.put("Maria Florez", "3988906523");
        agenda.put("Juan Hurtado", "3238906341");
        agenda.put("Carlos Torres", "3007583289");

        System.out.println(agenda);

        System.out.println(agenda.get("Juan Hurtado"));

        System.out.println(agenda.get("Maria Florez"));
    }
}

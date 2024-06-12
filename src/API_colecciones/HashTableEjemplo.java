/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package API_colecciones;

import java.util.Hashtable;

/**
 *
 * @author User
 */
public class HashTableEjemplo {

    public static void main(String[] args) {
        // TODO code application logic here
        Hashtable<String, String> nombres = new Hashtable<>();

        nombres.put("11", "Esteban");
        nombres.put("12", "Jose");
        nombres.put("13", "Juan");
        nombres.put("14", "Sebastian");
        nombres.put("15", "Pedro");

        System.out.println("Valor para clave '15': " + nombres.get("15"));
        System.out.println("Valor para clave '11': " + nombres.get("11"));

        System.out.println("\nValores en la Hashtable:");
        for (String valor : nombres.values()) {
            System.out.println(valor);
        }

        System.out.println("\nClaves en la Hashtable:");
        for (String clave : nombres.keySet()) {
            System.out.println(clave);
        }
    }
}

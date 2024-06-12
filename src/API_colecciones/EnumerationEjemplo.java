/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package API_colecciones;

/**
 *
 * @author User
 */
public class EnumerationEjemplo {
    
    public enum DiaSemana {
        LUNES, MARTES, MIÉRCOLES, JUEVES, VIERNES, SÁBADO, DOMINGO
    }

    public static void main(String[] args) {
        DiaSemana dia = DiaSemana.MIÉRCOLES;

        System.out.println("Dia seleccionado: " + dia);

        if (dia == DiaSemana.MIÉRCOLES) {
            System.out.println("Es miercoles!");
        }

        System.out.println("\nDias de la semana:");
        for (DiaSemana d : DiaSemana.values()) {
            System.out.println(d);
        }
    }
}

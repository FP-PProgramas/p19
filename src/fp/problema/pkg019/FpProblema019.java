/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fp.problema.pkg019;

import java.util.*;
public class FpProblema019 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double angulo;
        Scanner entradaDatos = new Scanner(System.in);
        try {
            System.out.print("Introduce un ángulo: ");
            angulo = entradaDatos.nextDouble();
            Operaciones(angulo);
        } catch (Exception e) {
            System.out.println("Salir.");
        }
    }
    static void Operaciones(double angulo){
        //Primer punto, pasa "a" a radianes.
        double b = Math.toRadians(angulo);
        System.out.println("El Seno de es: " + Math.sin(b) );
        System.out.println("El Coseno de es: " + Math.cos(b) );
        System.out.println("El Tangente de es: " + Math.tan(b) );
    }
    
}

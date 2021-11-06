/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller4;
import java.util.Scanner;

/**
 *
 * @author diegojp
 */
public class Taller4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Programa para determinar 
        Scanner leer = new Scanner (System.in);
        System.out.println("Programa para calcular el area del poligono compuesto, \n");
        
        //Declarar las variables
        double lc, at, ar, A, B, C;
        double ats, area;
        
        lc=0; at=0; ar=0; A=0; B=0; C=0;
        ats=0; area=0;
        
        //Datos ingresar
        System.out.println("Ingrese el lado del cuadrado");
        lc = leer.nextDouble();
        System.out.println("Ingrese la altura de triangulo");
        at = leer.nextDouble();
        System.out.println("Ingresar la altura del rectangulo");
        ar = leer.nextDouble();
        
        //Proceso
        A = Math.pow(lc, 2);
        B = (lc * at)/2;
        ats = (B * 3);
        C = lc * ar;
        area = A + ats + B;
        
        //salida
        System.out.println("El area total del poligono es: " +area+ " con un cuadrado" +" de area " +A +" con tres triangulos rectangulos de area " +ats +" y un rectangulo de area " +C +"\n" );
        
        
                
    }
    
}

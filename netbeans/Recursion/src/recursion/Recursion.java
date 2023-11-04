/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursion;

/**
 *
 * @author USER
 */
public class Recursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Method myMethods = new Method();
        int suma = myMethods.sumaRecursiva(10);
        int v[] = new int[100];
        System.out.printf("La suma de 1 hasta %d es: %d", 10, suma);
        int n;
        System.out.println("Ingrese n");

        try {
            n = myMethods.leerDim();
            myMethods.leerVectorR(v, n, 0);
            myMethods.impVectorR(v, n, 0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Debe ingresar un número entero >0");
        }

        
        
        
        

    }

}

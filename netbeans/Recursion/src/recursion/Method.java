/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursion;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Method {

    /**
     * Suma de forma recursiva desde n hasta 1
     * @param n: hasta dónde se suma
     * @return suma de 1 hasta n
     */
    public int sumaRecursiva(int n) {
        if (n == 1) {// caso base bajo instancias previas
            return 1;
        } else {
            return sumaRecursiva(n - 1) + n;
        }
    }

    /**
     * 
     * @return 
     */
    public Scanner input() {
        return new Scanner(System.in);
    }

    public int leerDim() {
        int n = 0;
        try {
            Scanner input = input();
            do {
                System.out.println("Ingrese n");
                n = input.nextInt();
            } while (n<=0);
        } catch (Exception e) {
            System.out.println("Ingrese una dimension valida");
            return leerDim();
        }
        return  n;
    }

    public void leerVectorR(int v[], int dim, int i) {
        if (i < dim) {
            try (Scanner input = input()) {
                System.out.printf("Digite v[%d]", i);
                v[i] = input.nextInt();
                
                leerVectorR(v, dim, i + 1);
            }
        }
    }

    public void impVectorR(int v[], int dim, int i) {
        if (i < dim) {
            System.out.print(v[i] + "|");
            impVectorR(v, dim, i + 1);
        }
    }
}

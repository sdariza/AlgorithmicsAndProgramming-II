/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quicksort;

/**
 *
 * @author USER
 */
public class QuickSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Method myMethods = new Method();
        int v[] = {-9999, 9, 8, 7, 61, 5, 4, 3, 21, 10, 11};
        int n = v.length - 1;
        System.out.println("Vector a ordenar");
        myMethods.printVector(v, n);
        myMethods.quickSort(v, 1, n);
        System.out.println("Vector ordenado");
        myMethods.printVector(v, n);

    }

}

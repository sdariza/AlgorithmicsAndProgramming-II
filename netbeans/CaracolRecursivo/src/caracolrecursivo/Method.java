/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caracolrecursivo;

/**
 *
 * @author USER
 */
public class Method {

    public void printMatrixR(int M[][], int n, int i, int j) {
        if (i <= n) {
            if (j <= n) {
                System.out.print(M[i][j] + "|");
                printMatrixR(M, n, i, j + 1);
            } else {
                System.out.println("");
                printMatrixR(M, n, i + 1, 1);
            }
        }
    }

    public void generarNCaracoles(int n, int i) {
        if (i <= n) {
            int M[][] = new int[i+1][i+1];
            generarCaracolR(M, i, 1, i, 1);
            printMatrixR(M, i, 1, 1);
            System.out.println("**********");
            generarNCaracoles(n, i+1);
        }
    }

    public void generarCaracolR(int M[][], int n, int i, int j, int k) {
        M[i][j] = k;
        if (i == 1 + n / 2 && j == 1 + n / 2) {//caso base
            M[i][j] = k;
        } else if (i <= n / 2 && j == i) {//singularidad azul oscuro
            generarCaracolR(M, n, i + 1, j, k + 1);
        } else if (i >= 1 + n / 2 && j == n - i + 1) {//singularidad verde
            generarCaracolR(M, n, i, j + 1, k + 1);
        } else if (j > 1 + n / 2 && j == i) {//singularidad azul claro
            generarCaracolR(M, n, i - 1, j, k + 1);
        } else if (j > 1 + n / 2 && i == n - j + 2) {//singularidad naranja
            generarCaracolR(M, n, i, j - 1, k + 1);
        } else {//llamados recursivos más pequeños
            if (i <= n / 2 && j > i && j <= n - i + 1) {//hacia la izquierda
                generarCaracolR(M, n, i, j - 1, k + 1);
            } else if (j <= n / 2 && i <= n - j + 1) {//hacia abajo
                generarCaracolR(M, n, i + 1, j, k + 1);
            } else if (i > 1 + n / 2 && j <= i) {//hacia la derecha
                generarCaracolR(M, n, i, j + 1, k + 1);
            } else {//hacia arriba
                generarCaracolR(M, n, i - 1, j, k + 1);
            }
        }
    }
}

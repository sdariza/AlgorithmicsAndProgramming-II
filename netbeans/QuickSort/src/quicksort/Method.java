/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quicksort;

/**
 *
 * @author USER
 */
public class Method {

    public void printVector(int v[], int n) {
        for (int i = 1; i <= n; i++)
            System.out.print(v[i] + "|");

        System.out.println("");
    }

    public int rightMove(int v[], int i, int p) {
        if (v[i] < p)
            return rightMove(v, i + 1, p);

        return i;
    }

    public int leftMove(int v[], int j, int p) {
        if (v[j] > p)
            return leftMove(v, j - 1, p);

        return j;
    }

    public void swapping(int v[], int i, int j) {
        int t = v[i];
        v[i] = v[j];
        v[j] = t;
    }

    public void quickSort(int v[], int first, int last) {
        if (first < last) {
            int i = first, j = last, p = v[(first + last) / 2];
            i = rightMove(v, i, p);
            j = leftMove(v, j, p);
            if (i < j) {
                swapping(v, i, j);
                i++;
                j--;
            } else if (i == j) {
                i++;
                j--;
            }

            if (first < j) {
                quickSort(v, first, j);
            }
            if (i < last) {
                quickSort(v, i, last);
            }

        }

    }

}


import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class Method {

    /**
     *
     * @param string
     * @param tam
     * @return
     */
    public int dotCount(String string, int tam) {
        int cont = 0, i = 0;
        while (i < tam && cont <= 1) {
            String h = string.substring(i, i + 1);
            if (h.equals(".")) {
                cont++;
            }
            i++;
        }
        return cont;
    }

    /**
     *
     * @param string
     * @return
     */
    public boolean integerValidator(String string) {
        int tam = string.length(), i = 0;
        boolean sw = true;
        while (i < tam && sw) {
            String h = string.substring(i, i + 1);
            if (h.equals("0") || h.equals("1") || h.equals("2") || h.equals("3")
                    || h.equals("4") || h.equals("5") || h.equals("6") || h.equals("7")
                    || h.equals("8") || h.equals("9")) {
                i++;
            } else {
                sw = false;
            }
        }
        return sw;
    }

    public boolean floatValidator(String string, int tam) {
        if (tam < 3 || tam >= 5) {
            return false;
        }
        int dotCount = dotCount(string, tam);
        if (dotCount > 1 || dotCount == 0) {
            return false;
        }
        String izq = string.substring(0, 1);
        String der;
        if (tam == 3) {
            der = string.substring(2, 3);
        } else {
            der = string.substring(2, 4);
        }
        if (integerValidator(izq) && integerValidator(der)) {
            if (Integer.parseInt(izq) > 5 || (Integer.parseInt(izq) == 5 && Integer.parseInt(der) != 0)) {
                return false;
            } else {
                return true;
            }
        }

        return false;
    }

    public boolean idValidator(String string, int tam) {
        if (tam != 8) {
            return false;
        }
        return integerValidator(string);
    }

    /**
     * Calcule min length between 2 Strings
     *
     * @param cad1: string
     * @param cad2: String
     * @return min lenght between cad1 and cad2
     */
    public int minLength(String cad1, String cad2) {
        if (cad1.length() > cad2.length()) {
            return cad2.length();
        } else if (cad2.length() > cad1.length()) {
            return cad1.length();
        }
        return cad1.length();
    }

    public int compareTo(String cad1, String cad2) {
        int minLength = minLength(cad1, cad2);
        cad1 = cad1.toLowerCase();
        cad2 = cad2.toLowerCase();
        boolean sw = false;
        int i = 0, diff = 0;
        while (!sw && i < minLength) {
            if (cad1.charAt(i) != cad2.charAt(i)) {
                sw = true;
                diff = (int) cad1.charAt(i) - (int) cad2.charAt(i);
            } else {
                i++;
            }
        }
        if (!sw) {
            diff = cad1.length() - cad2.length();
        }

        return diff;
    }

    public void swapping(String vec[], int pos) {
        String temp = vec[pos];
        vec[pos] = vec[pos + 1];
        vec[pos + 1] = temp;
    }

    public void sort(String M[][], int n, int m) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (compareTo(M[j][1], M[j + 1][1]) > 0) {
                    for (int j2 = 0; j2 < m; j2++) {
                        String temp = M[j][j2];
                        M[j][j2] = M[j + 1][j2];
                        M[j + 1][j2] = temp;
                    }
                }
            }
        }
    }

    public void showLabel(JTextField textField, JLabel label) {
        if (textField.getText().length() == 0) {
            label.setText("Ingrese el código del estudiante");
            label.setVisible(true);
        } else {
            label.setVisible(false);
            textField.setForeground(Color.black);
        }
    }

}

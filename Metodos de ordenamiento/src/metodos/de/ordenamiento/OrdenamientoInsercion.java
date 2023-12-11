/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodos.de.ordenamiento;

/**
 *
 * @author aron_
 */
public class OrdenamientoInsercion {
    public static void ordenar(int[] arreglo) {
        int n = arreglo.length;
        for (int i = 1; i < n; i++) {
            int key = arreglo[i];
            int j = i - 1;
            while (j >= 0 && arreglo[j] > key) {
                arreglo[j + 1] = arreglo[j];
                j = j - 1;
            }
            arreglo[j + 1] = key;

            // Mostrar los valores a comparar (A y B) en esta iteración
            System.out.print("Iteración " + i + ": ");
            for (int k = 0; k <= i; k++) {
                if (k == i) {
                    System.out.print("[" + arreglo[k] + "] ");
                } else {
                    System.out.print(arreglo[k] + " ");
                }
            }
            System.out.println();
        }
    }
}

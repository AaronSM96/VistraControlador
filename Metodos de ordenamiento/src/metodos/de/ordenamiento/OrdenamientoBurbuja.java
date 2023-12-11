/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodos.de.ordenamiento;

/**
 *
 * @author aron_
 */
public class OrdenamientoBurbuja {
    public static void ordenar(int[] arreglo) {
        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }

            // Mostrar los valores a comparar (A y B) en esta iteración
            System.out.print("Iteración " + (i + 1) + ": ");
            for (int elemento : arreglo) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }
}


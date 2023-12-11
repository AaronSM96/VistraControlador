/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodos.de.ordenamiento;

/**
 *
 * @author aron_
 */
public class OrdenamientoSeleccion {
    public static void ordenar(int[] arreglo) {
        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arreglo[j] < arreglo[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arreglo[minIndex];
            arreglo[minIndex] = arreglo[i];
            arreglo[i] = temp;

            // Mostrar los valores y las posiciones en esta iteración
            System.out.print("Iteración " + (i + 1) + ": ");
            for (int elemento : arreglo) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }
}


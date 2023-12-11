/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.garciars_sarangola;

import ec.edu.ups.garciars_sarangola.clases.BusquedaBinaria;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author HP I5 8TH GEN
 */
public class GarciaRS_SarangoLA {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        // Entrada de datos proporcionados
        int[] arreglo = new int[9];
        for (int i = 0; i < 9; i++) {
            System.out.print("Ingrese los valores: ");
            arreglo[i] = scanner.nextInt();
        }

        System.out.print("Valor a buscar: ");
        int elementoABuscar = scanner.nextInt();

        // Ordenar el arreglo que digitamos
        Arrays.sort(arreglo);

        // Llamada al metodo de búsqueda binaria
        boolean encontrado = BusquedaBinaria.busquedaBinaria(arreglo, elementoABuscar);

        // Imprimir resultados
        if (encontrado) {
            System.out.println("Elemento encontrado.");
        } else {
            System.out.println("Elemento no encontrado.");
        }
    }
}


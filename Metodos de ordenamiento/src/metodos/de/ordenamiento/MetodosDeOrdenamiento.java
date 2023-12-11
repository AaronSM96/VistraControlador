/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metodos.de.ordenamiento;

/**
 *
 * @author aron_
 */
import java.util.Scanner;

public class MetodosDeOrdenamiento{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = scanner.nextInt();
        
        int[] arreglo = new int[n];
        System.out.println("Ingrese los elementos del arreglo:");
        for (int i = 0; i < n; i++) {
            arreglo[i] = scanner.nextInt();
        }

        System.out.println("Escoja el método de ordenamiento:");
        System.out.println("1. Selección");
        System.out.println("2. Inserción");
        System.out.println("3. Burbuja con ajuste");
        int metodo = scanner.nextInt();

        switch (metodo) {
            case 1:
                // Llama a la función de ordenamiento por selección
                OrdenamientoSeleccion.ordenar(arreglo);
                break;
            case 2:
                // Llama a la función de ordenamiento por inserción
                OrdenamientoInsercion.ordenar(arreglo);
                break;
            case 3:
                // Llama a la función de ordenamiento de burbuja con ajuste
                OrdenamientoBurbuja.ordenar(arreglo);
                break;
            default:
                System.out.println("Opción no válida.");
        }

        System.out.println("Arreglo ordenado:");
        for (int elemento : arreglo) {
            System.out.print(elemento + " ");
        }
    }
}


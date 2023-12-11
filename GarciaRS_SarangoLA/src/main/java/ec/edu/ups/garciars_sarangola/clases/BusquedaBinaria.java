/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.garciars_sarangola.clases;

import java.util.Arrays;

/**
 *
 * @author HP I5 8TH GEN
 */
public class BusquedaBinaria {
    public static boolean busquedaBinaria(int[] arreglo, int elemento) {
        int bajo = 0;
        int alto = arreglo.length - 1;

        while (bajo <= alto) {
            int centro = (bajo + alto) / 2;
            int valorCentro = arreglo[centro];

            System.out.print(Arrays.toString(arreglo));
            System.out.printf(" bajo=%d alto=%d centro=%d valorCentro=%d --> ", bajo, alto, centro, valorCentro);

            if (valorCentro == elemento) {
                System.out.println("ENCONTRADO");
                return true;
            } else if (valorCentro < elemento) {
                System.out.println("DERECHA");
                bajo = centro + 1;
            } else {
                System.out.println("IZQUIERDA");
                alto = centro - 1;
            }
        }

        System.out.println("NO ENCONTRADO");
        return false;
    }
}


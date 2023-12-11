/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sarangoa_ordamientos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author aron_
 */
public class IngresoDatos 
{
    
    Scanner leerNumeros = new Scanner(System.in);
    
    public ArrayList ingresaDato(ArrayList lista)
    {
        lista.clear();       
        System.out.println ("Ingrese tamaño: ");
        int n = leerNumeros.nextInt();
        
        for (int i=0; i<n; i++) 
        {
            System.out.println("Ingrese dato " + (i +1) + ": ");
            lista.add(leerNumeros.nextInt());
        }
        imprimir(lista , "");    
        return lista;
    }
    
    public void imprimir(ArrayList lista, String  complemento){
        String texto = "";
        for (int i = 0  ; i < lista.size()-1 ; i++ ){
            texto = texto + lista.get(i)+"|";
        }
        texto += lista.get(lista.size()-1);
        System.out.println(texto+"  Lista Ingresada");
    }
    
}

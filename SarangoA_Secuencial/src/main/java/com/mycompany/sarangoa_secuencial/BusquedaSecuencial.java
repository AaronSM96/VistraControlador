/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sarangoa_secuencial;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author AaronS
 */
public class BusquedaSecuencial 
{
    Scanner s=new Scanner(System.in);
    ArrayList<Integer> lista=new ArrayList ();       
    
    public void registraValores()
    {
        System.out.print("ingrese el tamaño:");
        int tam= s.nextInt();
        
        for(int i=0; i<tam; i++)
        {
            System.out.print("ingrese el dato "+(i+1)+" :");
            int num=s .nextInt(); 
            lista.add(num);
        }
        System.out.print("ingrese el dato a buscar; ");
        int datoB= s.nextInt();
        
        System.out.print("Existe datos duplicados ");
        String resp=s.next();
        
        buscarDatos(resp,datoB);
    }
    
    public void buscarDatos(String resp,int datoB)
    {   
        int cont=0;
        if(resp.equalsIgnoreCase("si"))
        {
            //System.out.println ("duplicado");
            for(int i=0; i<lista.size();i++)
            {
                System.out.println(lista.get(i)+" - "+datoB);
                if (lista.get(i)==datoB)
                {
                    cont++;
                }
            }
            System.out.println("Existen "+cont+"coincidencia con el numero"+ datoB);
        }
        else if (resp.equalsIgnoreCase("no"))
        {
              for(int i=0; i<lista.size();i++)
            {
                System.out.println(lista.get(i)+" - "+datoB);
                if (lista.get(i)==datoB)
                {
                    cont=1;
                   // i=lista.size();
                   break;
                }
        }
    }
    }
}
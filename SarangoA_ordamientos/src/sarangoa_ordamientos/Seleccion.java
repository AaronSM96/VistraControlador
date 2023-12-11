/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sarangoa_ordamientos;

import java.util.ArrayList;

/**
 *
 * @author aron_
 */
public class Seleccion {
    public ArrayList ordenarSeleccion(ArrayList<Integer> lista){
        int bajo;
        String texto ;
        for(int i = 0 ; i < lista.size()-1; i++ ){
            bajo = i;
            texto = "Pasada "+(i+1)+"\n";
            for(int j = i+1 ; j < lista.size(); j++){
                if(j!=i+1){
                    texto += "valor Menor: "+bajo+" Valor Mayor: "+ j +"\n";
                } else if(j==i+1){
                    texto += textoLista(lista)+"   valor Menor: "+bajo+" Valor Mayor: "+ j +"\n";
                }
                if(lista.get(bajo) > lista.get(j)){
                    bajo = j;
                }
            }
            int valor = lista.set(i,lista.get(bajo));
            lista.set(bajo,valor);
            System.out.println(texto);
        }
        System.out.println("Lista ordenada = " + textoLista(lista));
        return lista;
    }
    public String textoLista(ArrayList lista){
        String texto="";
        for (int i = 0  ; i < lista.size()-1 ; i++ ){
            texto = texto + lista.get(i)+"|";
        }
        texto += lista.get(lista.size()-1);
        return texto;
    }
}


package sarangoa_ordamientos;

import java.util.ArrayList;

/**
 *
 * @author aron_
 */
public class Insercion {
    public ArrayList ordenarInsercion(ArrayList<Integer> lista){
        int a ;
        int b ;
        for(int i  = 0 ; i < lista.size()-1; i++){
              a = i;
              b = i+1;
              String texto = textoLista(lista)+" Valor A = "+lista.get(a)+"  Valor B = "+lista.get(b)+"\n";
              while(lista.get(a)>lista.get(b)){
                  int valor = lista.set(b, lista.get(a));
                  lista.set(a, valor);
                  a= a-1;
                  b = b-1;
                  if(a<0){
                  break;
                  } else if(a ==0){
                      texto+=lista.get(a) + "|"+lista.get(b)+" Valor A = "+lista.get(a)+"  Valor B = "+lista.get(b)+"\n";
                  }else if (a > 0 ){
                      texto+=lista.get(a) + "|"+lista.get(b)+"|"+lista.get(b+1)+" Valor A = "+lista.get(a)+"  Valor B = "+lista.get(b)+"\n";
                  }
                 
              }
                
            System.out.println(texto);
        }
        System.out.println(textoLista(lista)+ "   Lista Ordenada");
        
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
 
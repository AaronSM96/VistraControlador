
package sarangoa_ordamientos;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author aron_
 */
public class Inicio 
{
 
    public static void main (String args[])
    {
        IngresoDatos b=new IngresoDatos();
        Seleccion s = new Seleccion();
        Insercion i = new Insercion();
        ArrayList lista = new ArrayList();
        Scanner leer = new Scanner(System.in);
        lista = b.ingresaDato(lista);
            System.out.println("1. Ordenar por seleccion \n 2. Ordenar por insercion \n otro. Salir");
            int opcion = leer.nextInt();
            switch(opcion)
        {
                case 1 ->{ lista = s.ordenarSeleccion(lista);}
                case 2 ->{ lista = i.ordenarInsercion(lista);}
                default -> {break;}
            
        }
    }
    
}


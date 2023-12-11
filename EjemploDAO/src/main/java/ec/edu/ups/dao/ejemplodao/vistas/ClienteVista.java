/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.dao.ejemplodao.vistas;

import ec.edu.ups.dao.ejemplodao.modelo.Cliente;
import java.util.Scanner;

/**
 *
 * @author PhD. Gabriel A. León Paredes
 */
public class ClienteVista {
    
    private Scanner entrada;

    public ClienteVista() {
        entrada = new Scanner(System.in);
    }
    
    public Cliente ingresarDatosCliente(){
        System.out.println("------Ingreso de Nuevo Cliente------");
        System.out.println("Ingresa el id del cliente");
        int id = entrada.nextInt();
        System.out.println("Ingresa el nombre del cliente");
        String nombre = entrada.next();
        System.out.println("Ingresa el apellido del cliente");
        String apellido = entrada.next();
        
        return new Cliente(id, nombre, apellido);
    }
    
    public Cliente actualizarDatosCliente(){
        System.out.println("------Actualizar Cliente------");
        System.out.println("Ingresa el id del cliente a actualizar");
        int id = entrada.nextInt();
        System.out.println("Ingresa el nombre del cliente");
        String nombre = entrada.next();
        System.out.println("Ingresa el apellido del cliente");
        String apellido = entrada.next();
        
        return new Cliente(id, nombre, apellido);
    }
    
    public int eliminarDatosCliente(){
        System.out.println("------Eliminar Cliente------");
        System.out.println("Ingresa el id del cliente a eliminar");
        int id = entrada.nextInt();
        return id;
    }
    
    public int buscarDatosCliente(){
        System.out.println("------Buscar Cliente------");
        System.out.println("Ingresa el id del cliente a buscar");
        int id = entrada.nextInt();
        return id;
    }
    
    
    
    public void mostrarInformacionCliente(int id, String nombre, String apellido){
        System.out.println("Datos del Cliente: \n" + id + " - " + nombre + " - " + apellido);
    }
    
    public void mostrarAlertas(String mensaje){
        System.out.println(mensaje);
    }
    
}

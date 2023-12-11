/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.dao.ejemplodao.controladores;

import ec.edu.ups.dao.ejemplodao.dao.ClienteDAO;
import ec.edu.ups.dao.ejemplodao.idao.IClienteDAO;
import ec.edu.ups.dao.ejemplodao.modelo.Cliente;
import ec.edu.ups.dao.ejemplodao.vistas.ClienteVista;
import java.util.List;

/**
 *
 * @author PhD. Gabriel A. León Paredes
 */
public class ClienteControlador {
    
    private IClienteDAO clienteDAO;
    private ClienteVista clienteVista;
    private Cliente cliente;

    public ClienteControlador(IClienteDAO clienteDAO, ClienteVista clienteVista) {
        this.clienteDAO = clienteDAO;
        this.clienteVista = clienteVista;        
    }
    
    public void crearCliente(){
        cliente = clienteVista.ingresarDatosCliente();
        clienteDAO.crearCliente(cliente);
    }
    
    public void actualizarCliente(){
        cliente = clienteVista.actualizarDatosCliente();
        if(clienteDAO.actualizarCliente(cliente.getId(), cliente) == true){
            clienteVista.mostrarAlertas("Cliente actualizado correctamente!");                    
        }else{
            clienteVista.mostrarAlertas("Ha ocurrido un error!");                    
        }            
    }
    
    public void eliminarCliente(){
        int id = clienteVista.eliminarDatosCliente();
        if(clienteDAO.eliminarCliente(id) == true){
            clienteVista.mostrarAlertas("Cliente eliminado correctamente!");                    
        }else{
            clienteVista.mostrarAlertas("Ha ocurrido un error!");
        }
    }
    
    public void buscarClientePorId(){
        int id = clienteVista.buscarDatosCliente();
        cliente = clienteDAO.obtenerCliente(id);
        if(cliente == null){
            clienteVista.mostrarAlertas("Cliente no encontrado");
        }else{
            clienteVista.mostrarInformacionCliente(cliente.getId(), cliente.getNombre(), cliente.getApellido());
        }
    }
    
    public void listarClientes(){
        List<Cliente> listaClientes = clienteDAO.obtenerClientes();
        for (Cliente cliente : listaClientes) {
            clienteVista.mostrarInformacionCliente(cliente.getId(), cliente.getNombre(), cliente.getApellido());
        }
    }
    
}

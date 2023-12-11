/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.ups.dao.ejemplodao.idao;

import ec.edu.ups.dao.ejemplodao.modelo.Cliente;
import java.util.List;

/**
 *
 * @author PhD. Gabriel A. León Paredes
 */
public interface IClienteDAO {
    
    
    List<Cliente> obtenerClientes();
    Cliente obtenerCliente(int id);
    void crearCliente(Cliente cliente);
    boolean actualizarCliente(int id, Cliente cliente);
    boolean eliminarCliente(int id);
    
}

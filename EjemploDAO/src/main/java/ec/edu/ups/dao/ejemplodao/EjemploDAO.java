/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.dao.ejemplodao;

import ec.edu.ups.dao.ejemplodao.controladores.ClienteControlador;
import ec.edu.ups.dao.ejemplodao.dao.ClienteDAO;
import ec.edu.ups.dao.ejemplodao.idao.IClienteDAO;
import ec.edu.ups.dao.ejemplodao.vistas.ClienteVista;

/**
 *
 * @author PhD. Gabriel A. León Paredes
 */
public class EjemploDAO {

    public static void main(String[] args) {
        IClienteDAO clienteDAO = new ClienteDAO();
        ClienteVista clienteVista = new ClienteVista();
        
        ClienteControlador controlador = new ClienteControlador(clienteDAO, clienteVista);
        
        controlador.crearCliente();        
        controlador.crearCliente();
        controlador.listarClientes();
        controlador.actualizarCliente();
        controlador.listarClientes();
        controlador.eliminarCliente();
        controlador.listarClientes();
        controlador.buscarClientePorId();
    }
}

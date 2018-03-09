package managedbean;

import java.util.ArrayList;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import entidade.Cliente;

@ManagedBean(eager=true)
@ApplicationScoped
public class ClienteMB {
	
	private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	private Cliente cliente = new Cliente();
	
	public void salvar()
	{
		clientes.add(cliente);
		cliente = new Cliente();
	}
	
	public ArrayList<Cliente> getClientes() {
		return clientes;
	}
	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public void remover(Cliente cliente) {
		clientes.remove(cliente);
	}
}
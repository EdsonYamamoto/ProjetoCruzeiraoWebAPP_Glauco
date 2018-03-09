package managedbean;

import java.util.ArrayList;
import managedbean.ItemMB;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import entidade.Item;
import entidade.Pedido;
import entidade.Produto;

@ManagedBean
@SessionScoped
public class PedidoMB {
	private ArrayList<Pedido> pedidos = new ArrayList<Pedido>();
	private Pedido pedido = new Pedido();
	
	public ArrayList<Pedido> getPedidos() {
		return pedidos;
	}
	public void setPedidos(ArrayList<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	public void salvar(ItemMB itens)
	{
		ArrayList<Item> itensAux = new ArrayList<Item>();
		
		for(Item item : itens.getItens())
			itensAux.add(item);
		pedido.setItem(itensAux);
		pedido.getCliente().setItem(itensAux);
		
		itens.setItens(new ArrayList<Item>());
		
		//itens.remover(Item);
		pedidos.add(pedido);
		pedido = new Pedido();
	}
	public void remover(Pedido pedido)
	{
		pedidos.remove(pedido);
	}
	public double total()
	{
		return pedido.calculaTotal();
	}
	public double imposto()
	{
		return pedido.calculaImposto();
	}
}

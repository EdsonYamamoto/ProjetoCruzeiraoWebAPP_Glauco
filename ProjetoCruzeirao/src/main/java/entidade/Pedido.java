package entidade;

import java.util.ArrayList;

public class Pedido {
	private int id;
	private String data;
	private ArrayList<Item> item;
	private Cliente cliente;
	private double custoTotal;
	private double imposto;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
	public ArrayList<Item> getItem() {
		return item;
	}
	public void setItem(ArrayList<Item> item) {
		this.item = item;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public double calculaTotal()
	{
		custoTotal=0;
		for(Item p : item)
			custoTotal +=p.getProduto().getPreco()*p.getQuantidade();
		
		return custoTotal;
	}
	
	public double calculaImposto()
	{
		imposto=0;
		for(Item p : item)
			imposto +=p.getProduto().getImposto()*p.getQuantidade();
		
		return imposto;
	}
	
	@Override
	public String toString()
	{
		return "Pedido[ID="+id+"Data="+data+"Cliente="+cliente.getNome()+"]"+"\nLista de compras\n"+item;
	}
}
/*
 * Guarda-se igualmente a informação dos pedidos feitos pelos clientes. 
 * Cada pedido possui um número e guarda-se a data de elaboração do pedido. 
 * Cada pedido pode envolver de um a vários produtos, e para cada produto, indica-se a quantidade deste pedida.
 */
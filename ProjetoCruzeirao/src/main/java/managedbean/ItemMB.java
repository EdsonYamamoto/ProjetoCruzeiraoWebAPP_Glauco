package managedbean;

import java.util.ArrayList;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import entidade.Item;

@ManagedBean(eager=true)
@ApplicationScoped
public class ItemMB {
	private ArrayList<Item> itens = new ArrayList<Item>();
	private Item item = new Item();
	
	public ArrayList<Item> getItens() {
		return itens;
	}
	public void setItens(ArrayList<Item> itens) {
		this.itens = itens;
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	
	public void salvar()
	{
		itens.add(item);
		item = new Item();
	}
	public void remover(Item item)
	{
		itens.remove(item);
	}
	
}


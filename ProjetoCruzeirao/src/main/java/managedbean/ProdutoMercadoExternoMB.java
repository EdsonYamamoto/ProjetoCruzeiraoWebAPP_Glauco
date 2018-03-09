
package managedbean;

import java.util.ArrayList;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import entidade.ProdutoMercadoExterno;

@ManagedBean(eager=true)
@ApplicationScoped
public class ProdutoMercadoExternoMB {

	private ArrayList<ProdutoMercadoExterno> produtos = new ArrayList<ProdutoMercadoExterno>();
	private ProdutoMercadoExterno produto = new ProdutoMercadoExterno();
	
	public void salvar()
	{
		produtos.add(produto);
		produto = new ProdutoMercadoExterno();
	}

	public void remover(ProdutoMercadoExterno produto)
	{
		produtos.remove(produto);
	}

	public ArrayList<ProdutoMercadoExterno> getProdutos() {
		return produtos;
	}

	public void setProdutos(ArrayList<ProdutoMercadoExterno> produtos) {
		this.produtos = produtos;
	}

	public ProdutoMercadoExterno getProduto() {
		return produto;
	}

	public void setProduto(ProdutoMercadoExterno produto) {
		this.produto = produto;
	}
	
}

package managedbean;

import java.util.ArrayList;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import entidade.ProdutoMercadoInterno;

@ManagedBean(eager=true)
@ApplicationScoped
public class ProdutoMercadoInternoMB {

	private ArrayList<ProdutoMercadoInterno> produtos = new ArrayList<ProdutoMercadoInterno>();
	private ProdutoMercadoInterno produto = new ProdutoMercadoInterno();
	public void salvar()
	{
		produtos.add(produto);
		produto = new ProdutoMercadoInterno();
	}

	public void remover(ProdutoMercadoInterno produto)
	{
		produtos.remove(produto);
	}

	public ArrayList<ProdutoMercadoInterno> getProdutos() {
		return produtos;
	}

	public void setProdutos(ArrayList<ProdutoMercadoInterno> produtos) {
		this.produtos = produtos;
	}

	public ProdutoMercadoInterno getProduto() {
		return produto;
	}

	public void setProduto(ProdutoMercadoInterno produto) {
		this.produto = produto;
	}
	
}

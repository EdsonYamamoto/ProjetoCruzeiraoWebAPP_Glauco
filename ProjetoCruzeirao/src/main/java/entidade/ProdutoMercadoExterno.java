package entidade;

public class ProdutoMercadoExterno extends Produto {
	protected String destino;

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}
	
	@Override
	public String toString() {
		return "ID=" + codigo + "\nnome=" + nome + "\ncategoria=" + categoria +"\npreco=" + preco +"\nimposto=" + imposto + "\ndestino:"+this.destino;
	}
}

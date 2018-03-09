package entidade;

public class ProdutoMercadoInterno extends Produto{
	protected double incentivo;

	public double getIncentivo() {
		return incentivo;
	}

	public void setIncentivo(double incentivo) {
		this.incentivo = incentivo;
	}
	@Override
	public String toString() {
		return "ID=" + codigo + "\nnome=" + nome + "\ncategoria=" + categoria +"\npreco=" + preco +"\nimposto=" + imposto + "\ndestino:"+this.incentivo;
	}
	
}

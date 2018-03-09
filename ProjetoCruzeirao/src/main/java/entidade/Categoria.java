package entidade;

public class Categoria {
	private String descricao;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	@Override
	public String toString()
	{
		return this.descricao;
	}
}

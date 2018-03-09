package modelo;

import java.util.List;

public class PartidaFutebol {
	private List<Gol> golsMandantes;
	private List<Gol> golsVisitantes;
	private List<Gol> golsPenaltesMandantes;
	private List<Gol> golsPenaltesVisitantes;
	private List<Cartao> cartoesMandante;
	private List<Cartao> cartoesVisitante;
	public List<Gol> getGolsMandantes() {
		return golsMandantes;
	}
	public void setGolsMandantes(List<Gol> golsMandantes) {
		this.golsMandantes = golsMandantes;
	}
	public List<Gol> getGolsVisitantes() {
		return golsVisitantes;
	}
	public void setGolsVisitantes(List<Gol> golsVisitantes) {
		this.golsVisitantes = golsVisitantes;
	}
	public List<Gol> getGolsPenaltesMandantes() {
		return golsPenaltesMandantes;
	}
	public void setGolsPenaltesMandantes(List<Gol> golsPenaltesMandantes) {
		this.golsPenaltesMandantes = golsPenaltesMandantes;
	}
	public List<Gol> getGolsPenaltesVisitantes() {
		return golsPenaltesVisitantes;
	}
	public void setGolsPenaltesVisitantes(List<Gol> golsPenaltesVisitantes) {
		this.golsPenaltesVisitantes = golsPenaltesVisitantes;
	}
	public List<Cartao> getCartoesMandante() {
		return cartoesMandante;
	}
	public void setCartoesMandante(List<Cartao> cartoesMandante) {
		this.cartoesMandante = cartoesMandante;
	}
	public List<Cartao> getCartoesVisitante() {
		return cartoesVisitante;
	}
	public void setCartoesVisitante(List<Cartao> cartoesVisitante) {
		this.cartoesVisitante = cartoesVisitante;
	}
	
	
}

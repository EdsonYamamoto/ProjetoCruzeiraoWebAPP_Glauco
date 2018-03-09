package modelo;

import java.util.Enumeration;

public class Cartao {
	private Inscrito inscrito;
	private Enumeration tipo;
	private int tempo;
	
	
	public Inscrito getInscrito() {
		return inscrito;
	}
	public void setInscrito(Inscrito inscrito) {
		this.inscrito = inscrito;
	}
	public int getTempo() {
		return tempo;
	}
	public void setTempo(int tempo) {
		this.tempo = tempo;
	}
	 
}

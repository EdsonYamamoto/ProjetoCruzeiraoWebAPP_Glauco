package modelo;

import java.util.Date;
import java.util.List;

public class Partida {
	private int numero;
	private Inscricao equipeMandante;
	private Inscricao equipeVisitante;
	private Date data;
	private Local local;
	private Partida proxPartida;
	private List<Juiz> juizes;
	private Grupo grupo;
	private String relatoJuiz;
}

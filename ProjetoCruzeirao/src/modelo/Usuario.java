package modelo;

import java.util.Date;
import java.util.Enumeration;
import java.util.List;

public class Usuario {
	private String email;
	private String nome;
	private Date dataNascimento;
	private List<Equipe> equipes;
	private List<Inscrito> inscricoes;
	private List<Campeonato> campeonatos;
	private Enumeration tipo;
	private String telefoneFixo;
	private String telefoneMovel;
	private String endereco;
	private String rg;
	private String cpf;
	private String cref;
	private Enumeration sexo;
	private String foto;
}

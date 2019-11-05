package AtividadePratica;

import java.time.LocalDateTime;

public class Evento {
	
	//ATRIBUTOS
	private CidadeEnum 		locais;
	private LocalDateTime	dataHora;
	private String			nome;
	
	//CONSTRUTOR
	public Evento(CidadeEnum locais, LocalDateTime dataHora, String nome) {
		super();
		this.locais = locais;
		this.dataHora = dataHora;
		this.nome = nome;
	}

	//GETS AND SETS
	public CidadeEnum getLocais() {
		return locais;
	}

	public void setLocais(CidadeEnum locais) {
		this.locais = locais;
	}

	public LocalDateTime getDataHora() {
		return dataHora;
	}

	public void setDataHora(LocalDateTime dataHora) {
		this.dataHora = dataHora;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	



}

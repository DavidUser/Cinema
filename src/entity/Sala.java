package entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.JoinColumn;
import java.util.Collection;

@Entity
public class Sala {
	@Id
	private int numero;
	private int capacidade;
	@OneToMany
	@JoinColumn
	private Collection<Poutrona> poutrona;
	@OneToMany(mappedBy = "sala")
	private Collection<Sessao> sessao;


	public int getNumero() {
		return numero;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public Collection<Poutrona> getPoutronas() {
		return poutrona;
	}

	public Collection<Sessao> getSessoes() {
		return sessao;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
}

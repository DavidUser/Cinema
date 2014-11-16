package entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.OneToOne;
import javax.persistence.JoinColumn;

@Entity
public class Ingresso {
	@Id
	@GeneratedValue
	private long id;
	//TODO verificar onde fica a escolha entre inteira ou meia
	private float valorInteira;
	private float valorMeia;
	@OneToOne
	@JoinColumn
	private Sessao sessao;
	@OneToOne
	@JoinColumn
	private Poutrona poutrona;


	public long getId() {
		return id;
	}

	public float getValorInteira() {
		return valorInteira;
	}

	public float getValorMeia() {
		return valorMeia;
	}

	public Sessao getSessao() {
		return sessao;
	}

	public Poutrona getPoutrona() {
		return poutrona;
	}


	public void setValorInteira(float valor) {
		this.valorInteira = valor;
	}

	public void setValorMeia(float valor) {
		this.valorMeia = valor;
	}

	public void setSessao(Sessao sessao) {
		this.sessao = sessao;
	}

	public void setPoutrona(Poutrona poutrona) {
		this.poutrona = poutrona;
	}
}


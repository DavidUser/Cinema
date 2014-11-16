package entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import java.util.Date;

@Entity
public class Sessao {
	@Id
	@GeneratedValue
	private long id;
	private Date momento; 
	@ManyToOne
	@JoinColumn
	private Sala sala;
	@ManyToOne
	@JoinColumn
	private Filme filme;


	public long getId() {
		return id;
	}

	public Date getHorario() {
		return momento;
	}

	public Sala getSala() {
		return sala;
	}

	public Filme getFilme() {
		return filme;
	}

	public Date getData() {
		return momento;
	}


	public void setHorario(Date momento) {
		this.momento = momento;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}

	public void setFilme(Filme filme) {
		this.filme = filme;
	}
	
	public void setData(Date momento) {
		this.momento = momento;
	}
}

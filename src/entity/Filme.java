package entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import java.util.Collection;

@Entity
public class Filme {
	@Id
	@GeneratedValue
	private long id;
	@ManyToOne
	@JoinColumn
	private Genero genero;
	private int classificacao;
	@ManyToMany
	@JoinColumn
	private Collection<Ator> elenco;
	private String sinopse;
	private String trailerLink;
	private String titulo;
	private String direcao;
	@OneToMany(mappedBy = "filme")
	private Collection<Sessao> sessao;

	public long getId() {
		return id;
	}

	public Genero getGenero() {
		return genero;
	}

	public int getClassificacao() {
		return classificacao;
	}

	public Collection<Ator> getElenco() {
		return elenco;
	}

	public String getSinopse() {
		return sinopse;
	}

	public String getTrailerLink() {
		return trailerLink;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getDirecao() {
		return direcao;
	}

	public Collection<Sessao> getSessoes() {
		return sessao;
	}


	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public void setClassificacao(int classificacao) {
		this.classificacao = classificacao;	
	}

	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}

	public void setTrailerLink(String trailerLink) {
		this.trailerLink = trailerLink;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String setDirecao() {
		return direcao;
	}
}


package entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;

@Entity
public class Genero {
	@Id
	private String descricao;
	@OneToMany(mappedBy="genero")
	private Collection<Filme> filme;

	
	public String getDescricao() {
		return descricao;
	}

	public Collection<Filme> getFilmes() {
		return filme;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}

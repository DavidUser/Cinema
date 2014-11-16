package entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Collection;

@Entity
public class Ator { 
	@Id
	private String nome; 
	private String biografia; 
	@ManyToMany(mappedBy = "elenco")
	private Collection<Filme> filme; 

	public String getNome() {
		return nome;
	}
	
	public String getBiografia() {
		return biografia;
	}
	
	public Collection<Filme>getFilmes(){
		return filme;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setBiografia(String biografia) {
		this.biografia = biografia;
	}
}

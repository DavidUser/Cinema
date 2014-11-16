package entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.Collection;

@Entity
public class Caixa { 
	@Id
	@GeneratedValue
	private long id; 
	private float saldo; 
	@OneToMany
	@JoinColumn
	private Collection<Venda> venda; 

	public boolean entrada(float valor) {
		//TODO implement 
		return false;
	} 
	public boolean saida(float valor) {
		//TODO implement 
		return false;
	}


	public long getId() {
		return id;
	}

	public float getSaldo() {
		return saldo;
	}

	public Collection<Venda> getVendas() {
		return venda;
	}
}

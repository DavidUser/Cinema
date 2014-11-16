package entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.OneToMany;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Collection;

@Entity
public class Venda {
	@Id
	@GeneratedValue
	private long id;
	@OneToMany
	@JoinColumn
	private Collection<Ingresso> ingresso;
	@ManyToOne
	@JoinColumn
	private Usuario usuario;
	private int qtInteira; //TODO verificar se todas as inteiras tem o mesmo preco
	private int qtMeia; //TODO verificar se todas as meias tem o mesmo preco
	private float valorTotal;


	public long getId() {
		return id;
	}

	public Collection<Ingresso> getIngressos() {
		return ingresso;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public int getQuantidadeDeInteiras() {
		return qtInteira;
	}

	public int getQuantidadeDeMeias() {
		return qtMeia;
	}

	public float getValorTotal() {
		return valorTotal;
	}


	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public void setQuatidadeDeInteiras(int quantidade) {
		this.qtInteira = quantidade;
	}

	public void setQuantidadeDeMeias(int quantidade) {
		this.qtMeia = quantidade;
	}

	public void setValorTotal(float valor) {
		this.valorTotal = valor;
	}
}

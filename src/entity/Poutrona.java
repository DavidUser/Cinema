package entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;

enum Status { VAGA, OCUPADA }

@Entity
public class Poutrona {
	@Id
	@GeneratedValue
	private long id;
	private int numero;
	private char fila;
	private Status status;


	public long getId() {
		return id;
	}

	public int getNumero() {
		return numero;
	}

	public char getFila() {
		return fila;
	}

	public Status getStatus() {
		return status;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setFila(char fila) {
		this.fila = fila;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
}

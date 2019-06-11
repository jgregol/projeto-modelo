package br.com.apex.modelo.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "DEPARTAMENTOS")
public class Departamento extends AbstractEntity<Long> {

	@Column(name = "nome", nullable = false, unique = true, length = 60)
	private String nome;

	@OneToMany(mappedBy = "departamento")
	private List<Cargo> cargo;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Cargo> getCargo() {
		return cargo;
	}

	public void setCargo(List<Cargo> cargo) {
		this.cargo = cargo;
	}
}

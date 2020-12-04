package io.github.dearrudam.estudospringboot.pessoas;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pessoa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	private LocalDate dataNascimento;
	private Integer ra;
	private BigDecimal salario;

	@Deprecated
	public Pessoa() {
		super();
	}

	public Pessoa(String nome, LocalDate dataNascimento, Integer ra, BigDecimal salario) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.ra = ra;
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + ", dataNascimento=" + dataNascimento + ", ra=" + ra
				+ ", salario=" + salario + "]";
	}

	public String getNome() {
		return this.nome;
	}

	public Long getId() {
		return this.id;
	}

	public Integer getRa() {
		return this.ra;
	}

	public LocalDate getDataNascimento() {
		return this.dataNascimento;
	}

	public BigDecimal getSalario() {
		return this.salario;
	}
	

}

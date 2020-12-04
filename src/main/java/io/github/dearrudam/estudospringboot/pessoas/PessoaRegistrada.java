package io.github.dearrudam.estudospringboot.pessoas;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

public class PessoaRegistrada {

	private String nome;
	private Long id;
	private Integer ra;
	private LocalDate dataNascimento;
	private BigDecimal salario;

	public PessoaRegistrada(Pessoa pessoa) {
		this.id = pessoa.getId();
		this.nome = pessoa.getNome(); 
		this.ra = pessoa.getRa();
		this.dataNascimento = pessoa.getDataNascimento();
		this.salario = pessoa.getSalario();
	}

	public String getNome() {
		return nome;
	}

	public Long getId() {
		return id;
	}

	public Integer getRa() {
		return ra;
	}
	@JsonFormat(pattern = "dd/MM/yyyy")
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	
}

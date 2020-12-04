package io.github.dearrudam.estudospringboot.pessoas;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Transactional
public class PessoasController {
	
	private PessoasRepository repository;

	public PessoasController(PessoasRepository repository) {
		super();
		this.repository = repository;
	}

	@PostMapping("/pessoas")
	public PessoaRegistrada adicionarPessoa(@RequestBody NovaPessoaRequest request) {
		
		Pessoa novaPessoa = new Pessoa(
				request.getNome(), 
				request.getDataNascimento(), 
				request.getRa(),
				request.getSalario());
		
		this.repository.save(novaPessoa);

		System.out.println(novaPessoa);

		return new PessoaRegistrada(novaPessoa);
		
	}

}

package com.example.algamoney.api.service;

//import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.algamoney.api.model.Categoria;
import com.example.algamoney.api.model.Lancamento;
import com.example.algamoney.api.model.Pessoa;
import com.example.algamoney.api.repository.CategoriaRepository;
import com.example.algamoney.api.repository.LancamentoRepository;
import com.example.algamoney.api.repository.PessoaRepository;
import com.example.algamoney.api.service.exception.PessoaInexistenteOuInativaException;

@Service
public class LancamentoService {

	@Autowired
	private LancamentoRepository lancamentoRepository;
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	
	public Lancamento salvar(Lancamento lancamento) {
		//Optional categoria = this.categoriaRepository.findById(codigo);
		//return categoria.isPresent() ? ResponseEntity.ok(categoria.get()) : ResponseEntity.notFound().build();
		//Optional optPessoa = pessoaRepository.findById(lancamento.getPessoa().getCodigo()); 
		Pessoa pessoa = pessoaRepository.findById(lancamento.getPessoa().getCodigo()).get();
		//Pessoa pessoa = optPessoa.isPresent() ? optPessoa.get() : null;
				
		if (pessoa == null || pessoa.isInativo()) {
			throw new PessoaInexistenteOuInativaException();
		}
		
		Categoria categoria = categoriaRepository.findById(lancamento.getCategoria().getCodigo()).get();
		
		if (categoria == null ) {
//			throw new CategoriaInexistenteException();
		}
		return lancamentoRepository.save(lancamento);
		
	}
	
	
}

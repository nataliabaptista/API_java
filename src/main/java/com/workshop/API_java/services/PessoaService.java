package com.workshop.API_java.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.workshop.API_java.DTO.PessoaDTO;
import com.workshop.API_java.domain.Pessoa;
import com.workshop.API_java.repository.PessoaRepository;
import com.workshop.API_java.services.exception.ObjectNotFoundException;

@Service
public class PessoaService {

	@Autowired
	private PessoaRepository repo;

	public List<Pessoa> findAll() {
		return repo.findAll();
	}

	public Pessoa findById(String id) {
		Optional<Pessoa> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
	
	public Pessoa insert(Pessoa obj) {
		return repo.insert(obj);
	}
	
	public void delete(String id) {
		findById(id);
		repo.deleteById(id);
	}
	
	public Pessoa fromDTO(PessoaDTO objDto) {
		return new Pessoa(objDto.getId(), objDto.getNome(), objDto.getIdade(), objDto.getPeso());
	}
}
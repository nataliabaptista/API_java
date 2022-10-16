package com.workshop.API_java.services;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.workshop.API_java.domain.Pessoa;
import com.workshop.API_java.repository.PessoaRepository;

@Service
public class PessoaService {
	
	@Autowired
	private PessoaRepository repo;
	
	public List<Pessoa> findAll(){
		return repo.findAll();
	}
}

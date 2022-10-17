package com.workshop.API_java.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.workshop.API_java.domain.Pessoa;
import com.workshop.API_java.repository.PessoaRepository;

@Configuration
public class Instantiation implements CommandLineRunner {

	@Autowired
	private PessoaRepository pessoaRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		pessoaRepository.deleteAll();
		
		Pessoa camila = new Pessoa(null, "Camila Brown", 21, 50.07d);
		Pessoa miguel = new Pessoa(null, "Miguel Green", 40, 98.0d);
		Pessoa heitor = new Pessoa(null, "Heitor Grey", 25, 70.93d);
		
		pessoaRepository.saveAll(Arrays.asList(camila, miguel, heitor));
	}

}

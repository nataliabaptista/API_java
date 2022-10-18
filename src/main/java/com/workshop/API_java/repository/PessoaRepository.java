package com.workshop.API_java.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.workshop.API_java.domain.Pessoa;

@Repository
public interface PessoaRepository extends MongoRepository<Pessoa, String>{

	
}

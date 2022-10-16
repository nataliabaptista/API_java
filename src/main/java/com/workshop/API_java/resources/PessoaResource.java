package com.workshop.API_java.resources;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.workshop.API_java.domain.Pessoa;

@RestController
@RequestMapping(value="/pessoas")
public class PessoaResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<Pessoa>> findAll() {
		Pessoa maria = new Pessoa(1, "Maria Silva", 20, 60.03f);
		Pessoa joao = new Pessoa(2, "João Silva", 60, 90.39f);
		List<Pessoa> list = new ArrayList<>();
		list.addAll(Arrays.asList(maria,joao));
		return ResponseEntity.ok().body(list);
	}
}

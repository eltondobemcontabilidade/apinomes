package com.demo.api;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class NomeController {
	
	
	@GetMapping(value= "nomes")
	public List<String> getNomes() {
		var lista =  new ArrayList<String>();
		lista.add("Creuza Goncalves");
		lista.add("Edkeyze Goncalves");
		lista.add("Elton Goncalves");
		lista.add("Alessandra Goncalves");
		lista.add("Beatriz Goncalves");			
		return lista;
	}

}

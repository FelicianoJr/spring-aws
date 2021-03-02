package br.com.specification;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.specification.service.ContabilService;

@SpringBootApplication
public class ProjetospecificationApplication implements CommandLineRunner{

	@Autowired
	private ContabilService contabilService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProjetospecificationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		contabilService.vali(0L, null);
	}

}

package br.com.VendaCarros;

import br.com.VendaCarros.Entidades.Carros;
import br.com.VendaCarros.Repositorios.CarrosRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static java.util.Arrays.asList;

@SpringBootApplication
public class VendaCarrosApplication implements CommandLineRunner {
	@Autowired
	private CarrosRepositorio carrosRepositorio;
	public  static void main(String[] args){
		SpringApplication.run(VendaCarrosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}


}

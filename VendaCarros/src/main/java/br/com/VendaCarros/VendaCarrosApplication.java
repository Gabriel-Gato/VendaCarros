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
		Carros carro1 = new Carros();

		carro1.setAros("Prata");
		carro1.setCombustivel("Gasolina");
		carro1.setCores("Verde");
		carro1.setDetalhes("Teto removivel");
		carro1.setDirecao("Semi automatico");
		carro1.setEstado("Semi novo");
		carro1.setMarca("Ferrari");
		carro1.setModelo("2015");
		carro1.setPreco(100000.50);

		carrosRepositorio.saveAll(asList(carro1));
	}





}

package br.com.VendaCarros.Servicos;

import br.com.VendaCarros.Entidades.Carros;
import br.com.VendaCarros.Entidades.Login;
import br.com.VendaCarros.Repositorios.CarrosRepositorio;
import br.com.VendaCarros.Repositorios.LoginRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import static java.util.Arrays.asList;

@Service
public class BDServico {
    @Autowired
    private CarrosRepositorio carrosRepositorio;

    @Autowired
    private LoginRepositorio loginRepositorio;
    @Bean
    public void instaciarBD() {
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

        Login login1 = new Login();
        login1.setNome("Marcos");
        login1.setCep("04102596");
        login1.setSenha("123");
        login1.setEmail("marcosmonteiros@gmail.com");

        loginRepositorio.saveAll(asList(login1));

    }
}

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

        carro1.setNome("Ferrari F8 Tributo");
        carro1.setDescricao("Carro esportivo de alta performance");
        carro1.setPreco(3200000.0);
        carro1.setImagem("ferrari_f8.jpg");
        carro1.setModelo("F8 Tributo");
        carro1.setMotor("V8 3.9L");
        carro1.setPower(720);
        carro1.setTorque(770);
        carro1.setConsumo(8.2);
        carro1.setAceleração("2.9 segundos de 0 a 100 km/h");
        carro1.setImage1("ferrari_f8_front.jpg");
        carro1.setImage2("ferrari_f8_back.jpg");


        carrosRepositorio.saveAll(asList(carro1));

        Login login1 = new Login();
        login1.setNome("Marcos");
        login1.setCep("04102596");
        login1.setSenha("123");
        login1.setCpf("12313123");
        login1.setEmail("marcosmonteiros@gmail.com");

        loginRepositorio.saveAll(asList(login1));

    }
}

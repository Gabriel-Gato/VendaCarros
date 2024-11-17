package br.com.VendaCarros.Config;

import br.com.VendaCarros.Servicos.BDServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.text.ParseException;

@Configuration
@Profile("teste")
public class TesteConfiguracao {
    @Autowired
    BDServico bdServico;

    private boolean instaciar() throws ParseException {
        this.bdServico.instaciarBD();
        return true;
    }
}

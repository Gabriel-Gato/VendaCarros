package br.com.VendaCarros.Servicos;

import br.com.VendaCarros.Entidades.Login;
import br.com.VendaCarros.Repositorios.CarrosRepositorio;
import br.com.VendaCarros.Repositorios.LoginRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@Service
public class LoginServicos {
    @Autowired
    LoginRepositorio loginRepositorio;

    public Login findyById(Integer id) {
        Optional<Login> login = loginRepositorio.findById(id);
        return login.orElse(null);
    }

    public List<Login> findAll() {
        return loginRepositorio.findAll();
    }

    @RestController
    @RequestMapping(value = "Login")
    public class loginRecurso {
        @Autowired
        private LoginServicos loginServicos;

        @GetMapping(value = "{id}")
        public ResponseEntity<Login> findById(@PathVariable Integer id){
            Login login = loginServicos.findyById(id);
            return ResponseEntity.ok().body(login);
        }

        @GetMapping
        public ResponseEntity<List<Login>> findAll() {
            List<Login> login = loginServicos.findAll();
            return ResponseEntity.ok().body(login);
        }

    }


    public Login gravarLogin(Login login){
        return loginRepositorio.save(login);
    }

    public void deletar(Integer id){
        loginRepositorio.deleteById(id);
    }

    public Login update(Integer id, Login login){
        Login alterado = findyById(id);
        if(alterado!=null){
            alterado.setNome(login.getNome());
            alterado.setEmail(login.getEmail());
            alterado.setCep(login.getCep());
            alterado.setSenha(login.getSenha());
            alterado.setCpf(login.getCpf());

            return loginRepositorio.save(alterado);
        }
        return null;
    }
}

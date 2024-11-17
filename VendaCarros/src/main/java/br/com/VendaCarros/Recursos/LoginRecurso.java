package br.com.VendaCarros.Recursos;

import br.com.VendaCarros.Entidades.Login;
import br.com.VendaCarros.Entidades.Login;
import br.com.VendaCarros.Servicos.CarrosServicos;
import br.com.VendaCarros.Servicos.LoginServicos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping(value = "/login")
public class LoginRecurso {

    @Autowired
    private LoginServicos loginServicos;

    @GetMapping(value = "/{id}")
    public ResponseEntity<Login> findById(@PathVariable Integer id) {
        Login login = loginServicos.findyById(id);
        return ResponseEntity.ok().body(login);
    }

    @PostMapping
    public ResponseEntity<Login> gravarLogin(@RequestBody Login login) {
        login = loginServicos.gravarLogin(login);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(login.getId()).toUri();
        return ResponseEntity.created(uri).body(login);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Integer id){
        loginServicos.deletar(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Login> update(@PathVariable Integer id, @RequestBody Login login){
        Login alterado = loginServicos.update(id, login);
        return ResponseEntity.ok().body(alterado);
    }

}
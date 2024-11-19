package br.com.VendaCarros.Recursos;

import br.com.VendaCarros.Entidades.Carros;
import br.com.VendaCarros.Servicos.CarrosServicos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/carros")
public class CarrosRecurso {

    @Autowired
    private CarrosServicos carrosServicos;

    @GetMapping(value = "/{id}")
    public ResponseEntity<Carros> findById(@PathVariable Integer id) {
        Carros carros = carrosServicos.findyById(id);
        return ResponseEntity.ok().body(carros);
    }

    @GetMapping(value = "/nome/{nome}")
    public ResponseEntity<List<Carros>> findByNome(@PathVariable String nome) {
        List<Carros> carros = carrosServicos.findByNome(nome);
        return ResponseEntity.ok().body(carros);
    }

    @PostMapping
    public ResponseEntity<Carros> gravarCarros(@RequestBody Carros carros) {
        carros = carrosServicos.gravarCarros(carros);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(carros.getId()).toUri();
        return ResponseEntity.created(uri).body(carros);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Integer id){
        carrosServicos.deletar(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Carros> update(@PathVariable Integer id, @RequestBody Carros carros){
        Carros alterado = carrosServicos.update(id, carros); 
        return ResponseEntity.ok().body(alterado);
    }

}

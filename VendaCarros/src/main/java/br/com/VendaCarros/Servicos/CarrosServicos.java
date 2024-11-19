package br.com.VendaCarros.Servicos;

import br.com.VendaCarros.Entidades.Carros;
import br.com.VendaCarros.Repositorios.CarrosRepositorio;
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
public class CarrosServicos {
    @Autowired
    CarrosRepositorio carrosRepositorio;

    public Carros findyById(Integer id) {
        Optional<Carros> carros = carrosRepositorio.findById(id);
        return carros.orElse(null);
    }

    public List<Carros> findAll() {
        return carrosRepositorio.findAll();
    }

    public List<Carros> findByNome(String nome) {
        return carrosRepositorio.findByNomeContainingIgnoreCase(nome);

    }

    @RestController
    @RequestMapping(value = "Carros")
    public class vendaCarrosRecurso {
        @Autowired
        private CarrosServicos carrosServicos;

        @GetMapping(value = "{id}")
        public ResponseEntity<Carros> findById(@PathVariable Integer id){
            Carros carros = carrosServicos.findyById(id);
            return ResponseEntity.ok().body(carros);
        }

        @GetMapping
        public ResponseEntity<List<Carros>> findAll() {
            List<Carros> carros = carrosServicos.findAll();
            return ResponseEntity.ok().body(carros);
        }

        @GetMapping(value = "/nome/{nome}")
        public ResponseEntity<List<Carros>> findByNome(@PathVariable String nome) {
            List<Carros> carros = carrosServicos.findByNome(nome);
            return ResponseEntity.ok().body(carros);
        }

    }


    public Carros gravarCarros(Carros carros){
        return carrosRepositorio.save(carros);
    }

    public void deletar(Integer id){
        carrosRepositorio.deleteById(id);
    }

    public Carros update(Integer id, Carros carros){
        Carros alterado = findyById(id);
        if(alterado!=null){
            alterado.setPreco(carros.getPreco());
            alterado.setModelo(carros.getModelo());
            alterado.setAceleração(carros.getAceleração());
            alterado.setConsumo(carros.getConsumo());
            alterado.setNome(carros.getNome());
            alterado.setDescricao(carros.getDescricao());
            alterado.setTorque(carros.getTorque());
            alterado.setPower(carros.getPower());
            alterado.setMotor(carros.getMotor());
            alterado.setImagem(carros.getImagem());
            alterado.setImage1(carros.getImage1());
            alterado.setImage2(carros.getImage2());

            return carrosRepositorio.save(alterado);
        }
        return null;
    }
}

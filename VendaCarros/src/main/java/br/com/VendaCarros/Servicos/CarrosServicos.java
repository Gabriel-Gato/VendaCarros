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

    @RestController
    @RequestMapping(value = "VendaCarros")
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
            alterado.setMarca(carros.getMarca());
            alterado.setEstado(carros.getEstado());
            alterado.setDirecao(carros.getDirecao());
            alterado.setDetalhes(carros.getDetalhes());
            alterado.setCores(carros.getCores());
            alterado.setAros(carros.getAros());
            alterado.setCombustivel(carros.getCombustivel());

            return carrosRepositorio.save(alterado);
        }
        return null;
    }
}

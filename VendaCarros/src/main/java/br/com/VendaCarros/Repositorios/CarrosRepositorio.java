package br.com.VendaCarros.Repositorios;
import br.com.VendaCarros.Entidades.Carros;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarrosRepositorio extends JpaRepository<Carros, Integer> {




}

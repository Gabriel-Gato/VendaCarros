package br.com.VendaCarros.Repositorios;
import br.com.VendaCarros.Entidades.Carros;
import br.com.VendaCarros.Entidades.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepositorio extends JpaRepository<Login, Integer> {
}
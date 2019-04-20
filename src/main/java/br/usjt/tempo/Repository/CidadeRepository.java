package br.usjt.tempo.Repository;

import br.usjt.tempo.Model.Bean.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CidadeRepository extends JpaRepository<Cidade, Long> {

    public Cidade findByLatitudeAndLongitude(String latitude, String longitude);

    public Cidade findByNome(String nome);

    public List<Cidade> findByNomeIgnoreCase(String nome);
}

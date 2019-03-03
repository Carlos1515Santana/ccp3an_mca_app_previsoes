package br.usjt.tempo.Repository;

import br.usjt.tempo.Model.Previsao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PrevisaoRepository2 extends JpaRepository<Previsao, Long>{

}


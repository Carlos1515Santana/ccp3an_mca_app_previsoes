package br.usjt.tempo.Service;

import br.usjt.tempo.Model.Bean.Previsao;
import br.usjt.tempo.Repository.PrevisaoRepository2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrevisaoService {

    @Autowired
    private PrevisaoRepository2 previsaoRepository2;

    @Autowired
    public List<Previsao> findAll() {
        return previsaoRepository2.findAll();
    }
}

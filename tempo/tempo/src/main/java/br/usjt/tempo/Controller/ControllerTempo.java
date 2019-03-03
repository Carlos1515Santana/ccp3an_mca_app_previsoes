package br.usjt.tempo.Controller;


import br.usjt.tempo.Model.Previsao;
import br.usjt.tempo.Repository.PrevisaoRepository2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.util.List;

@Controller
public class ControllerTempo {


    @Autowired
    private PrevisaoRepository2 repository;

    @GetMapping("/periodos")
    private ModelAndView listarPeriodos() throws IOException {
        ModelAndView modelAndView = new ModelAndView("lista_previsao");
        modelAndView.addObject(new Previsao());
        List<Previsao> periodos = repository.findAll();
        modelAndView.addObject("periodos", periodos);
        return modelAndView;
    }
    @PostMapping
    public String salvar (Previsao aluno) {
        repository.save(aluno);
        return "redirect:/periodos";
    }

}

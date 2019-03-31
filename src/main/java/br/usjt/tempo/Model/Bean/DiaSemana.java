package br.usjt.tempo.Model.Bean;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "DiaDaSemana")
public class DiaSemana  implements Serializable {

    @Id
    @Column(name = "id_dia")
    private String Dia_Da_Semana;
    @OneToOne(mappedBy = "diaSemana")
    private Previsao previsao;



    public String getDia_Da_Semana() {
        return Dia_Da_Semana;
    }

    public void setDia_Da_Semana(String dia_Da_Semana) {
        Dia_Da_Semana = dia_Da_Semana;
    }
}

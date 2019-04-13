package br.usjt.tempo.Model.Bean;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name= "Previsao")
public class Previsao implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    @Column(name = "Id")
    private Long id;

    private String diaNaSemana;
    private Double temperaturaMin;
    private Double temperaturaMax;
    private Double humidadeAr;
    private String descricao;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_dia")
    private DiaSemana diaSemana;

    @Column(nullable = true)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataHora;

    @Column(nullable = true)
    private String latitude;

    @Column(nullable = true)
    private String longitude;

    @OneToMany
    private Cidade cidade;

    public DiaSemana getDiaSemana() {
        return diaSemana;
    }

    public Date getDataHora() {
        return dataHora;
    }

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public void setDiaSemana(DiaSemana diaSemana) {
        this.diaSemana = diaSemana;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDiaNaSemana() {
        return diaNaSemana;
    }

    public void setDiaNaSemana(String diaNaSemana) {
        this.diaNaSemana = diaNaSemana;
    }

    public Double getTemperaturaMin() {
        return temperaturaMin;
    }

    public void setTemperaturaMin(Double temperaturaMin) {
        this.temperaturaMin = temperaturaMin;
    }

    public Double getTemperaturaMax() {
        return temperaturaMax;
    }

    public void setTemperaturaMax(Double temperaturaMax) {
        this.temperaturaMax = temperaturaMax;
    }

    public Double getHumidadeAr() {
        return humidadeAr;
    }

    public void setHumidadeAr(Double humidade) {
        this.humidadeAr = humidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}

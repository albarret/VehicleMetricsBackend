package com.mobi7.VehicleMetrics.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Posicao {
    @Id
    private Long id;

    @Column(name = "placa_veiculo")
    private String placaVeiculo;

    @Column(name = "velocidade")
    private Float velocidade;

    @Column(name = "data_posicao")
    private Date dataPosicao;

    @Column(name = "latitude")
    private Double latitude;

    @Column(name = "longitude")
    private Double longitude;

    @Column(name = "ignicao")
    private Boolean ignicao;

    public Posicao(String placa) {
        this.dataPosicao = null;
        this.id = null;
        this.ignicao = null;
        this.latitude = null;
        this.longitude = null;
        this.velocidade = null;
        this.placaVeiculo = placa;
    }
}

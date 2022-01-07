package com.mobi7.VehicleMetrics.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.Instant;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TempoPermanencia {

    @Id
    private Long posicao_id;

    @Column
    private String placa_veiculo;

    @Column
    private Instant tempo_permanencia;

    @Column
    private String nome;

    @Column
    private Date dia;
}

package com.mobi7.VehicleMetrics.repository;

import com.mobi7.VehicleMetrics.model.Posicao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.lang.NonNull;

import java.util.Date;
import java.util.List;

public interface PosicaoRepository extends JpaRepository<Posicao, Long> {
    @Query("SELECT p FROM  Posicao p WHERE p.dataPosicao = DATE(:data)")
    public List<Posicao> findByDate(@Param("data") Date date);

    @Query("SELECT p FROM  Posicao p WHERE p.placaVeiculo = :placa")
    public List<Posicao> findByVehicle(@Param("placa") String placa);

    @Query("SELECT DISTINCT new Posicao(p.placaVeiculo) FROM Posicao p")
    public List<Posicao> findToSelect();
}

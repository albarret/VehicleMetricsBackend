package com.mobi7.VehicleMetrics.repository;

import com.mobi7.VehicleMetrics.model.TempoPermanencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface TempoPermanenciaRepository extends JpaRepository<TempoPermanencia, Long> {

    @Query(value = "SELECT tp " +
            "FROM TempoPermanencia tp " +
            "WHERE (:data IS NULL OR tp.dia = date(:data)) AND (:placaVeiculo IS NULL OR tp.placa_veiculo = :placaVeiculo)")
    public List<TempoPermanencia> findByFilter(@Param("data") Date data, @Param("placaVeiculo") String placaVeiculo);
}

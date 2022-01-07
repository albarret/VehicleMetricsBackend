package com.mobi7.VehicleMetrics.service;

import com.mobi7.VehicleMetrics.model.TempoPermanencia;

import java.util.Date;
import java.util.List;

public interface TempoPermanenciaService {
    List<TempoPermanencia> findAll();
    List<TempoPermanencia> findByFilter(Date data, String placaVeiculo);
}

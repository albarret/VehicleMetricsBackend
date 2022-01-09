package com.mobi7.VehicleMetrics.service;

import com.mobi7.VehicleMetrics.model.Posicao;
import com.mobi7.VehicleMetrics.model.dto.DaysDTO;

import java.util.Date;
import java.util.List;

public interface PosicaoService {

    List<Posicao> findAllPosicao();
    List<Posicao> findByDate(Date date);
    List<Posicao> findByVehicle(String vehicle);
    List<Posicao> findToSelect();
    DaysDTO findAvailableDays();
}

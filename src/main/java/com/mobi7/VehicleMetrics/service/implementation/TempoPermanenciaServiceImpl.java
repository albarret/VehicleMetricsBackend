package com.mobi7.VehicleMetrics.service.implementation;

import com.mobi7.VehicleMetrics.model.TempoPermanencia;
import com.mobi7.VehicleMetrics.repository.TempoPermanenciaRepository;
import com.mobi7.VehicleMetrics.service.TempoPermanenciaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class TempoPermanenciaServiceImpl implements TempoPermanenciaService {
    private final TempoPermanenciaRepository tempoPermanenciaRepository;

    @Override
    public List<TempoPermanencia> findAll() {
        return tempoPermanenciaRepository.findAll();
    }

    @Override
    public List<TempoPermanencia> findByFilter(Date data, String placaVeiculo) {
        return tempoPermanenciaRepository.findByFilter(data, placaVeiculo);
    }
}

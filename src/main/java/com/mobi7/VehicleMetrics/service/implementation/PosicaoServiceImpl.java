package com.mobi7.VehicleMetrics.service.implementation;

import com.mobi7.VehicleMetrics.model.Posicao;
import com.mobi7.VehicleMetrics.model.dto.DaysDTO;
import com.mobi7.VehicleMetrics.repository.PosicaoRepository;
import com.mobi7.VehicleMetrics.service.PosicaoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class PosicaoServiceImpl implements PosicaoService {

    private final PosicaoRepository posicaoRepository;

    @Override
    public List<Posicao> findAllPosicao() {
        return posicaoRepository.findAll();
    }

    @Override
    public List<Posicao> findByDate(Date date) {
        return posicaoRepository.findByDate(date);
    }

    @Override
    public List<Posicao> findByVehicle(String vehicle) {
        return posicaoRepository.findByVehicle(vehicle);
    }

    @Override
    public List<Posicao> findToSelect() {
        return posicaoRepository.findToSelect();
    }

    @Override
    public DaysDTO findAvailableDays() {
        return posicaoRepository.findAvailableDays();
    }
}

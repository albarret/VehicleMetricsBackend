package com.mobi7.VehicleMetrics.service.implementation;

import com.mobi7.VehicleMetrics.model.PointOfInterest;
import com.mobi7.VehicleMetrics.repository.PointOfInterestRepository;
import com.mobi7.VehicleMetrics.service.PointOfInterestService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class PointOfInterestServiceImpl implements PointOfInterestService {

    private final PointOfInterestRepository pointOfInterestRepository;

    @Override
    public List<PointOfInterest> findAll() {
        return pointOfInterestRepository.findAll();
    }
}

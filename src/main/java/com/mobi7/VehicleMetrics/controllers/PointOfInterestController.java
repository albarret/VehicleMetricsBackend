package com.mobi7.VehicleMetrics.controllers;

import com.mobi7.VehicleMetrics.model.PointOfInterest;
import com.mobi7.VehicleMetrics.service.PointOfInterestService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pointOfInterest")
@RequiredArgsConstructor
public class PointOfInterestController {

    private final PointOfInterestService pointOfInterestService;

    @GetMapping("/findAll")
    public ResponseEntity<List<PointOfInterest>> findAll() {
        List<PointOfInterest> result = pointOfInterestService.findAll();
        return ResponseEntity.ok(result);
    }
}

package com.mobi7.VehicleMetrics.repository;

import com.mobi7.VehicleMetrics.model.PointOfInterest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PointOfInterestRepository extends JpaRepository<PointOfInterest, Long> {
}

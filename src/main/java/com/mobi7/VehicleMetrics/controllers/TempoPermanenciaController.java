package com.mobi7.VehicleMetrics.controllers;

import com.mobi7.VehicleMetrics.model.TempoPermanencia;
import com.mobi7.VehicleMetrics.model.filters.TPFilter;
import com.mobi7.VehicleMetrics.service.TempoPermanenciaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/tempoPermanencia")
@RequiredArgsConstructor
public class TempoPermanenciaController {
    private final TempoPermanenciaService tempoPermanenciaService;

    @GetMapping("/findAll")
    public ResponseEntity<List<TempoPermanencia>> findAll() {
        List<TempoPermanencia> result = tempoPermanenciaService.findAll();
        return ResponseEntity.ok(result);
    }

    @PostMapping("/findByFilter")
    public ResponseEntity<List<TempoPermanencia>> findByFilter(@RequestBody TPFilter filter) {
        List<TempoPermanencia> result = tempoPermanenciaService.findByFilter(filter.getData(), filter.getPlaca());
        return ResponseEntity.ok(result);
    }
}


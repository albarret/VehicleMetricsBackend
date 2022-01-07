package com.mobi7.VehicleMetrics.controllers;

import com.mobi7.VehicleMetrics.model.Posicao;
import com.mobi7.VehicleMetrics.service.PosicaoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/posicao")
@RequiredArgsConstructor
public class PosicaoController {

    private final PosicaoService posicaoService;

    @GetMapping("/findToSelect")
    public ResponseEntity<List<Posicao>> findToSelect() {
        List<Posicao> result = posicaoService.findToSelect();
        return ResponseEntity.ok(result);
    }

    @PostMapping("/findByDate")
    public ResponseEntity<List<Posicao>> findByDate(@RequestBody @Valid Date date) {
        List<Posicao> result = posicaoService.findByDate(date);
        return ResponseEntity.ok(result);
    }

    @PostMapping("/findByVehicle")
    public ResponseEntity<List<Posicao>> findByVehicle(@RequestBody @Valid String placaVeiculo) {
        List<Posicao> result = posicaoService.findByVehicle(placaVeiculo);
        return ResponseEntity.ok(result);
    }
}

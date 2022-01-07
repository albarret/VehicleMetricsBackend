package com.mobi7.VehicleMetrics.model.filters;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
public class TPFilter {
    private String placa;
    private Date data;

    public Date getData() {
        return data;
    }

    public String getPlaca() {
        return placa;
    }

    public TPFilter(Date data) {
        this.data = data;
        this.placa = null;
    }

    public TPFilter(String placa) {
        this.data = null;
        this.placa = placa;
    }
}

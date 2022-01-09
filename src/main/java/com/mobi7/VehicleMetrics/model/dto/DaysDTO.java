package com.mobi7.VehicleMetrics.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DaysDTO {
    private Date firstDayAvailable;
    private Date lastDayAvailable;
}

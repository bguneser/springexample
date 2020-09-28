package com.bguneser.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;

@Data
public class VehicleDto {

    private String type;
    private String modelCode;
    private String brandName;
}

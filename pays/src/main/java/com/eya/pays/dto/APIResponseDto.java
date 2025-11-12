package com.eya.pays.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class APIResponseDto {
    private PaysDto paysDto;
    private ClassificationDto classificationDto;
}


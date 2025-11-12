package com.eya.pays.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClassificationDto {

    private Long id;
    private String ClassName;
    private String ClassCode;
}

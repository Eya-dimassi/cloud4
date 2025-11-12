package com.eya.pays.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaysDto {
    private Long id;

    private String nomPays;
    private String continent;
    private String classCode;
    private String className;
}

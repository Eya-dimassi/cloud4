package com.eya.classification.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClassificationDto {

    private Long id;
    private String className;
    private String classCode;
}

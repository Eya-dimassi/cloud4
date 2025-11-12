package com.eya.classification.service;

import com.eya.classification.dto.ClassificationDto;

public interface ClassificationService {
    ClassificationDto getClassificationByCode(String code);
}

package com.eya.classification.service;
import com.eya.classification.dto.ClassificationDto;
import com.eya.classification.entities.Classification;
import com.eya.classification.repos.ClassificationRepository;
import lombok.AllArgsConstructor;

import org.springframework.stereotype.Service;
@Service
@AllArgsConstructor
public class ClassificationServiceImpl implements ClassificationService {

    private ClassificationRepository classificationRepository;

    @Override
    public ClassificationDto getClassificationByCode(String code) {

        Classification classification = classificationRepository.findByclassCode(code);



        ClassificationDto classificationDto = new ClassificationDto(
                classification.getId(),
                classification.getClassName(),
                classification.getClassCode()
        );

        return classificationDto;
    }
}

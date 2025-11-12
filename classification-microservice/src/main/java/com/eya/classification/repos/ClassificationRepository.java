package com.eya.classification.repos;

import com.eya.classification.entities.Classification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassificationRepository extends JpaRepository<Classification, Long> {
    Classification findByclassCode(String code);
}

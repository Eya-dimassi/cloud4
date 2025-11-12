package com.eya.pays.service;

import com.eya.pays.dto.ClassificationDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(url = "http://localhost:8086", value = "CLASSIFICATION-MICROSERVICE")
@FeignClient(name ="CLASSIFICATION-MICROSERVICE")
public interface APIClient {
    @GetMapping("/api/classifications/{classCode}")
    ClassificationDto getClassificationByCode(@PathVariable("classCode") String classCode);
}

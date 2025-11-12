package com.eya.classification.restControllers;
import com.eya.classification.config.Configuration;
import com.eya.classification.dto.ClassificationDto;
import com.eya.classification.service.ClassificationService;
import lombok.AllArgsConstructor;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/classifications")

public class ClassificationController {
    @Autowired
    Configuration configuration;
    private ClassificationService classificationService;
    public ClassificationController(ClassificationService classificationService) {
        this.classificationService = classificationService;
    }
    @GetMapping("/author")
    public ResponseEntity<String> retrieveAuthorInfo() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(configuration.getName()+" "+configuration.getEmail() );
    }
    @Value("${build.version}")
    private String buildVersion;
    @GetMapping("/version")
    public ResponseEntity<String> version()
    {
        return ResponseEntity.status(HttpStatus.OK).body(buildVersion);
    }
    @GetMapping("{code}")
    public ResponseEntity<ClassificationDto> getClassificationByCode(
            @PathVariable("code") String code) {

        return new ResponseEntity<>(
                classificationService.getClassificationByCode(code),
                HttpStatus.OK
        );
    }
}

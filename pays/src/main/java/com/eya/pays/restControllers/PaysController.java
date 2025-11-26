package com.eya.pays.restControllers;
import com.eya.pays.config.Configuration;
import com.eya.pays.dto.APIResponseDto;
import com.eya.pays.dto.PaysDto;
import com.eya.pays.service.PaysService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/pays")
@AllArgsConstructor
public class PaysController {

    private final PaysService paysService;
    @Autowired
    Configuration configuration;
    @GetMapping("{id}")
    public ResponseEntity<APIResponseDto> getPays(@PathVariable("id") Long id) {

        return new ResponseEntity<APIResponseDto>(
                paysService.getPaysById(id),
                HttpStatus.OK
        );
    }
    @GetMapping("/author")
    public ResponseEntity<String> retrieveAuthorInfo() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(configuration.getName()+" "+configuration.getEmail() );
    }
}

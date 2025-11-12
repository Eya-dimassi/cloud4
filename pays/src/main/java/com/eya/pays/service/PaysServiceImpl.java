package com.eya.pays.service;
import com.eya.pays.dto.APIResponseDto;
import com.eya.pays.dto.ClassificationDto;
import com.eya.pays.dto.PaysDto;
import com.eya.pays.entities.Pays;
import com.eya.pays.repos.PaysRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@AllArgsConstructor
@Service
public class PaysServiceImpl implements PaysService {
    @Autowired
    private PaysRepository paysRepository;
    private WebClient webClient;
    private APIClient apiClient;
    @Override
    public APIResponseDto getPaysById(Long id) {

        Pays pays = paysRepository.findById(id).get();
        ClassificationDto classificationDto = apiClient.getClassificationByCode(pays.getClassCode());
        /*ClassificationDto classificationDto = webClient.get()
                .uri("http://localhost:8086/api/classifications/" + pays.getClassCode())
                .retrieve()
                .bodyToMono(ClassificationDto.class)
                .block();*/

        PaysDto paysDto = new PaysDto(
                pays.getId(),
                pays.getNomPays(),
                pays.getContinent(),
                pays.getClassCode(),
                classificationDto.getClassName()
        );
        APIResponseDto apiResponseDto = new APIResponseDto();
        apiResponseDto.setPaysDto(paysDto);
        apiResponseDto.setClassificationDto(classificationDto);

        return apiResponseDto;
    }
}

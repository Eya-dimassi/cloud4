package com.eya.pays.service;

import com.eya.pays.dto.APIResponseDto;
import com.eya.pays.dto.PaysDto;

public interface PaysService {
    APIResponseDto getPaysById(Long id);

}

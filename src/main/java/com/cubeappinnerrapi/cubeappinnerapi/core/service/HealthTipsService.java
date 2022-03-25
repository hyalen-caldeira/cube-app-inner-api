package com.cubeappinnerrapi.cubeappinnerapi.core.service;

import com.cubeappinnerrapi.cubeappinnerapi.core.dto.HealthTipsDto;

import java.util.List;

public interface HealthTipsService {
    List<HealthTipsDto> getAllFirstTenTips();
}

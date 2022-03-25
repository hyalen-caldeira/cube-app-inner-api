package com.cubeappinnerrapi.cubeappinnerapi.core.service;

import com.cubeappinnerrapi.cubeappinnerapi.core.dto.HealthTipsDto;

import java.util.List;

public class HealthTipsServiceImpl implements HealthTipsService {
    @Override
    public List<HealthTipsDto> getAllFirstTenTips() {
        List<HealthTipsDto> tips = List.of(
                new HealthTipsDto(1, ""),
                new HealthTipsDto(2, ""),
                new HealthTipsDto(3, ""),
                new HealthTipsDto(4, ""),
                new HealthTipsDto(5, ""),
                new HealthTipsDto(6, ""),
                new HealthTipsDto(7, ""),
                new HealthTipsDto(8, ""),
                new HealthTipsDto(9, ""),
                new HealthTipsDto(10, "")
        );

        return tips;
    }
}

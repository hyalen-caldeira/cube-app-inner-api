package com.cubeappinnerrapi.cubeappinnerapi.core.service;

import com.cubeappinnerrapi.cubeappinnerapi.CubeAppInnerApiApplication;
import com.cubeappinnerrapi.cubeappinnerapi.core.dto.HealthTipsDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HealthTipsServiceImpl implements HealthTipsService {
    private static final Logger log = LoggerFactory.getLogger(CubeAppInnerApiApplication.class);

    @Override
    public List<HealthTipsDto> getAllFirstTenTips() {
        List<HealthTipsDto> tips = List.of(
                new HealthTipsDto(1, "Tip One"),
                new HealthTipsDto(2, "Tip Two"),
                new HealthTipsDto(3, "Tip Three"),
                new HealthTipsDto(4, "Tip Four"),
                new HealthTipsDto(5, "Tip Five"),
                new HealthTipsDto(6, "Tip Six"),
                new HealthTipsDto(7, "Tip Seven"),
                new HealthTipsDto(8, "Tip Eight"),
                new HealthTipsDto(9, "Tip Nine"),
                new HealthTipsDto(10, "Tip Ten")
        );

        return tips;
    }
}

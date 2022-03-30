package com.cubeappinnerrapi.cubeappinnerapi.config.domain;

import com.cubeappinnerrapi.cubeappinnerapi.core.dao.HealthTipsDao;
import com.cubeappinnerrapi.cubeappinnerapi.core.service.HealthTipsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class HealthTipsConfig {
    @Autowired
    @Qualifier("healthTipsDao_v1")
    private HealthTipsDao healthTipsDao_v1;

    @PostConstruct
    void injectDependencies() {
        HealthTipsServiceImpl.setDao(healthTipsDao_v1);
    }
}

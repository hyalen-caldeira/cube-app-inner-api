package com.cubeappinnerrapi.cubeappinnerapi.core.service;

import com.cubeappinnerrapi.cubeappinnerapi.core.model.HealthTipsModel;

import java.util.List;

public interface HealthTipsService {
    List<HealthTipsModel> getAllHealthTips();
    List<HealthTipsModel> findByUserId(long id);
}

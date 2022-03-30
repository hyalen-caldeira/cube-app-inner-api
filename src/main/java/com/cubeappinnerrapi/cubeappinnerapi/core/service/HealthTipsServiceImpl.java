package com.cubeappinnerrapi.cubeappinnerapi.core.service;

import com.cubeappinnerrapi.cubeappinnerapi.CubeAppInnerApiApplication;
import com.cubeappinnerrapi.cubeappinnerapi.core.dao.HealthTipsDao;
import com.cubeappinnerrapi.cubeappinnerapi.core.model.HealthTipsModel;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HealthTipsServiceImpl implements HealthTipsService {
    @Setter
    private static HealthTipsDao dao;

    private static final Logger log = LoggerFactory.getLogger(CubeAppInnerApiApplication.class);

    @Override
    public List<HealthTipsModel> getAllHealthTips() {
//        dao.create(new HealthTipsModel(1, "First Health Tip ...", 8));
//        dao.create(new HealthTipsModel(2, "Second Health Tip ...", 8));
//        dao.create(new HealthTipsModel(3, "Third Health Tip ...", 8));
//        dao.create(new HealthTipsModel(4, "Fourth Health Tip ...", 8));
//        dao.create(new HealthTipsModel(5, "Fifth Health Tip ...", 8));
//        dao.create(new HealthTipsModel(6, "Sixth Health Tip ...", 13));
//        dao.create(new HealthTipsModel(7, "Seventh Health Tip ...", 13));
//        dao.create(new HealthTipsModel(8, "Eighth Health Tip ...", 13));
//        dao.create(new HealthTipsModel(9, "Ninth Health Tip ...", 33 ));
//        dao.create(new HealthTipsModel(10 , "Tenth Health Tip ...", 33 ));

        List<HealthTipsModel> tips = dao.findAll();

        return tips;
    }

    @Override
    public List<HealthTipsModel> findByUserId(long id) {
        var model = dao.findByUserId(id);

        return model;
    };
}

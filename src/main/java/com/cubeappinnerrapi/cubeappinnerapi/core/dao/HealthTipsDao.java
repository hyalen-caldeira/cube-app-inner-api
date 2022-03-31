package com.cubeappinnerrapi.cubeappinnerapi.core.dao;

import com.cubeappinnerrapi.cubeappinnerapi.core.model.HealthTipsModel;
import com.cubeappinnerrapi.cubeappinnerapi.core.repository.HealthTipsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Component("healthTipsDao_v1")
@Transactional
public class HealthTipsDao {
    @Autowired
    HealthTipsRepository repository;

    public List<HealthTipsModel> findAll() {
        return repository.findAll();
    }

    public List<HealthTipsModel> findByUserId(long id) {
        List<HealthTipsModel> model = repository.findByUserId(id);
        return model;
    }

//    public HealthTipsModel create(HealthTipsModel model) {
//        model = repository.save(model);
//        return model;
//    }
}

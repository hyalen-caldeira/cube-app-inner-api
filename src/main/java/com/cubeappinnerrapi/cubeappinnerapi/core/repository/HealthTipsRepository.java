package com.cubeappinnerrapi.cubeappinnerapi.core.repository;

import com.cubeappinnerrapi.cubeappinnerapi.core.model.HealthTipsModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface HealthTipsRepository  extends MongoRepository<HealthTipsModel, Long> {
    List<HealthTipsModel> findByUserId(long id);
}

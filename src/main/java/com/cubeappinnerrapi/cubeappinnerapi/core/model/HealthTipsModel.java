package com.cubeappinnerrapi.cubeappinnerapi.core.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import java.io.Serializable;

@AllArgsConstructor
@Getter
@Setter
@Document(collection = "healthTipsModel")
public class HealthTipsModel implements Serializable {
    @Id
    long id;
    @NotBlank
    @Size(max = 128)
    String tip;
    @NotBlank
    long userId;
}

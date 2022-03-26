package com.cubeappinnerrapi.cubeappinnerapi.core.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@AllArgsConstructor
@Getter
@Setter
public class HealthTipsDto implements Serializable {
    long id;
    String tips;
}

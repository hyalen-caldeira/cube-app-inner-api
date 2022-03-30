package com.cubeappinnerrapi.cubeappinnerapi.core.service

import com.cubeappinnerrapi.cubeappinnerapi.CubeAppInnerApiApplication
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.web.WebAppConfiguration
import spock.lang.Specification

import static org.junit.jupiter.api.Assertions.assertNotNull

@ContextConfiguration(classes = CubeAppInnerApiApplication.class)
@WebAppConfiguration
@SpringBootTest
class HealthTipsServiceImplTest extends Specification {
    private HealthTipsService service;

    void setup() {
        service = new HealthTipsServiceImpl();
    }

    // GET ALL users
    def "when get all users is performed, then the response has status 200 and all users will be returned"() {
        var healthTipsDto = null;

        when: "A list of health tips is required"
        healthTipsDto = service.getAllHealthTips();

        then: "A list of health tips will be returned"
        assertNotNull(healthTipsDto)
    }
}

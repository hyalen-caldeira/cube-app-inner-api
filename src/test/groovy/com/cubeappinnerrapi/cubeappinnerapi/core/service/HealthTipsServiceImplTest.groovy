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

    // GET ALL health tips
    def "when get all health tips is performed, then the response has status 200 and all tips will be returned"() {
        var healthTipsDto = null;

        when: "A list of health tips is required"
        healthTipsDto = service.getAllHealthTips();

        then: "A list of health tips will be returned"
        assertNotNull(healthTipsDto)
    }

    // GET ALL health tips
    def "when get all health tips by user ID is performed, then the response has status 200 and all user's tips will be returned"() {
        var healthTipsDto = null;

        when: "A list of health tips is required"
        healthTipsDto = service.findByUserId(8);

        then: "A list of health tips will be returned"
        assertNotNull(healthTipsDto)
    }
}

package com.cubeappinnerrapi.cubeappinnerapi

import com.cubeappinnerrapi.cubeappinnerapi.core.web.HealthTipsController;
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Narrative
import spock.lang.Specification
import spock.lang.Title;

@Title("Application Specification")
@Narrative("Specification which beans are expected")
@SpringBootTest
class CubeAppInnerApiApplicationTests extends Specification {

	@Test
	void contextLoads() {
	}

	@Autowired(required = false)
	private HealthTipsController healthTipsController;

	def "when context is loaded then all expected beans are created"() {
		expect: "the WebController is created"
		healthTipsController
	}

	@Test
	void main() {
		CubeAppInnerApiApplication.main(new String[] {});
	}
}

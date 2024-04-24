package com.subhjeet.spring.jenkins.api;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootJenkinsDemoApplicationTests {

	public static Logger logger = LoggerFactory.getLogger(SpringBootJenkinsDemoApplication.class);

	@Test
	contextLoads() {
		logger.info("Test Case Executing.....");
		logger.info("Test Case Executing second log statement.....");
		assertEquals(true, true);
	}

}

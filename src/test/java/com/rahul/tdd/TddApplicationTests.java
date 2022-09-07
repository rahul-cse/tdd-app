package com.rahul.tdd;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TddApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void testMain(){
		TddApplication.main(new String[]{});
	}

}

package com.digitalthinking.ada_qartz;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AdaQartzApplicationTests {

	@Test
	void contextLoads() {
            String message = "Passing test";
            assertNotNull(message); 
	}

}

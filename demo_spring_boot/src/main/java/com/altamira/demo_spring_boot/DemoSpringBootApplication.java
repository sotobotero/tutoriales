package com.altamira.demo_spring_boot;

import java.util.concurrent.ExecutionException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoSpringBootApplication {

	public static void main(String[] args) {
            try{
		SpringApplication.run(DemoSpringBootApplication.class, args);
            }catch(Exception e){
                e.printStackTrace();
            }
	}

}

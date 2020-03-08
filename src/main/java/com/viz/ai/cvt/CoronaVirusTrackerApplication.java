package com.viz.ai.cvt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@CrossOrigin("http://localhost:4200")
@EnableScheduling
public class CoronaVirusTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoronaVirusTrackerApplication.class, args);
	}

}

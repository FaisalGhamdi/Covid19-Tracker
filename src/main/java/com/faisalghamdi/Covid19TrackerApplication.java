package com.faisalghamdi;

import com.faisalghamdi.covid19tracker.services.CoronaVirusDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class Covid19TrackerApplication {

	@Autowired
	private static CoronaVirusDataService coronaVirusDataService;

	public static void main(String[] args) {
		SpringApplication.run(Covid19TrackerApplication.class, args);
		System	.out.println("" + coronaVirusDataService.getAllStats());
	}

}

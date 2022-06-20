package com.pandora.enabiz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@EnableMongoRepositories

public class ENabizApplication {

	public static void main(String[] args) {
		SpringApplication.run(ENabizApplication.class, args);
	}

}

package com.pandora.enabiz;

import com.pandora.enabiz.model.*;
import com.pandora.enabiz.service.abstracts.HospitalService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Configuration
@Import({
		Clinic.class,
		Patient.class,
		Doctor.class,
		City.class,
		Hospital.class,
})
public class ENabizApplication {

	public static void main(String[] args) {
		SpringApplication.run(ENabizApplication.class, args);
	}

}

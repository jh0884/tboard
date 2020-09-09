package com.tboard.example.tboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class TtboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(TtboardApplication.class, args);
	}

}

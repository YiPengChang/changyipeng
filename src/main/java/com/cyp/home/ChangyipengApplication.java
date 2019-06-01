package com.cyp.home;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.cyp.home.mapper")
@SpringBootApplication
public class ChangyipengApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChangyipengApplication.class, args);
	}

}

/*
 * Entry Point Spring Boot del progetto. 
 * @Gruppo: GLI ALDI MORO
 * Lavoro di gruppo per il corso di LBP 
 */

package com.bruna;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class Lbptest1Application {

	public static void main(String[] args) {
		SpringApplication.run(Lbptest1Application.class, args);
	}

}

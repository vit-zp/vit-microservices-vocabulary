package org.vit.activevoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SpringBootWebSecurityConfiguration;


//here was excluded the security configuration
@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class ActiveVocAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ActiveVocAppApplication.class, args);
	}
}

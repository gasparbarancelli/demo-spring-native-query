package io.github.gasparbarancelli.demospringnativequery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"io.github"})
public class DemoSpringNativeQueryApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringNativeQueryApplication.class, args);
	}

}

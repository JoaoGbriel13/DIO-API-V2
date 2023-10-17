package br.com.jg.DioApiV2;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(servers = {@Server(url = "/", description = "Default server url")})
public class DioApiV2Application {

	public static void main(String[] args) {
		SpringApplication.run(DioApiV2Application.class, args);
	}

}

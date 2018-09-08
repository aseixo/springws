package sample.ws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = { "sample.ws.repository", "sample.ws", "sample.ws.bussines" })
@EnableJpaRepositories
@EntityScan(basePackages = "sample.ws.model")
public class JaxwsSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(JaxwsSpringBootApplication.class, args);
	}
}

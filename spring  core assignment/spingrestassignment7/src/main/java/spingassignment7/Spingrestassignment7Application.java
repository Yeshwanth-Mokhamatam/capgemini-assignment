package spingassignment7;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
@EnableMongoRepositories(basePackageClasses = OrderRepository.class)
@SpringBootApplication
public class Spingrestassignment7Application {

	public static void main(String[] args) {
		SpringApplication.run(Spingrestassignment7Application.class, args);
	}

}
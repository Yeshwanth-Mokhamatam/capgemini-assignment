package Assignment9;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages ="Assignment9")
@EnableAutoConfiguration
@SpringBootApplication

public class BootWebApplication2{
	
	
	public static void main(String[] args) {
		SpringApplication.run(BootWebApplication2.class,args);
	}

}
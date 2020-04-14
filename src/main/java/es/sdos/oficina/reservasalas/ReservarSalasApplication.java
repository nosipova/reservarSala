package es.sdos.oficina.reservasalas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@SpringBootApplication
public class ReservarSalasApplication extends SpringBootServletInitializer{


	public static void main(String[] args) {
		SpringApplication.run(ReservarSalasApplication.class, args);
	}

}

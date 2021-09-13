package com.IBMMicroservicios.monster;

import com.IBMMicroservicios.monster.Beans.Carro;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MicroservicioEjemploApplication {

	private static final Logger logger = LoggerFactory.getLogger( MicroservicioEjemploApplication.class );

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(MicroservicioEjemploApplication.class, args);
		Carro carrito = context.getBean(Carro.class);
		carrito.setColor("Arcoiris");
		logger.info("El color del carro uno es: {}", carrito.getColor());
		Carro carrote = context.getBean(Carro.class);
		logger.info("El color del segundo carro es: {}", carrote.getColor());
	}

}

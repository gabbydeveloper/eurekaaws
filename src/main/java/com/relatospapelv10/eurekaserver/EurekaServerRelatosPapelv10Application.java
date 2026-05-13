//DECLARACION DE PAQUETES:
package com.relatospapelv10.eurekaserver;

//IMPORTACION DE LIBRERIAS:
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

//DECLARACION DE LA CLASE PRINCIPAL:
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerRelatosPapelv10Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerRelatosPapelv10Application.class, args);
	}
}

package restExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

import restExample.Bean.Passenger;
import restExample.Dao.PassengerDaoImpl;
import restExample.Services.PassengerOperationImple;

@SpringBootApplication
@ComponentScan({"restExample.Bean.Passenger.class","restExample.Dao.PassengerDaoImpl.class","restExample.Services.PassengerOperationImple.class"})
@PropertySource("classpath:application.properties")
public class SpringRestDataApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SpringRestDataApplication.class);
	}	

	public static void main(String[] args) throws Exception {
		SpringApplication.run(SpringRestDataApplication.class, args);
	}

}
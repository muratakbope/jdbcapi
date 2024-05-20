package kz.singularity.jdbcapi;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("kz.singularity.jdbcapi")
@EntityScan

public class JdbcapiApplication implements CommandLineRunner {

	@Autowired
	CustomerRepository customerRepository;

	public JdbcapiApplication(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}


    public static void main(String[] args) {
		SpringApplication.run(JdbcapiApplication.class, args);


	}
	@Override
	public void run(String... args) throws Exception {
		for (Customer i: customerRepository.findAll()) {
			System.out.println(i.toString());
		}
	}
}

package demo;

import org.apache.log4j.Logger;
import org.cloudfoundry.community.servicebroker.config.ServiceBrokerAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration(exclude = { ServiceBrokerAutoConfiguration.class })
public class DemoApplication {
	private static Logger log = Logger.getLogger(DemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}

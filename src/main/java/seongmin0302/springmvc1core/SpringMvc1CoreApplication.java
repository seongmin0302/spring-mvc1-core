package seongmin0302.springmvc1core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.server.servlet.context.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class SpringMvc1CoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMvc1CoreApplication.class, args);
	}

}

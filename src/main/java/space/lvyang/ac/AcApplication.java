package space.lvyang.ac;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ServletComponentScan
@ImportResource(locations = { "classpath:druid-been.xml" })
public class AcApplication {
	public static void main(String[] args) {
		SpringApplication.run(AcApplication.class, args);
	}

}

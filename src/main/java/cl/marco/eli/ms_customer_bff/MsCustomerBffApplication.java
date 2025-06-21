package cl.marco.eli.ms_customer_bff;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@EnableFeignClients
@CrossOrigin(origins = "*")
public class MsCustomerBffApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsCustomerBffApplication.class, args);
	}

}

package cl.duoc.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MsCustomerBffApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsCustomerBffApplication.class, args);
	}

	@GetMapping("/hola")
	public String saludito() {
		return "Servidor levantado exitosamente, si se pudo";
	}

}

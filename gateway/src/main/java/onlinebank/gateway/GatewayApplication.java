package onlinebank.gateway;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class GatewayApplication {

	@Value(value = "${cash.account.service}")
	private String cashAccountService;

	@Bean
	WebClient allAccountsRequest() {
		return WebClient.create(cashAccountService).mutate().build();
	}

	@Bean
	CommandLineRunner getALlAccounts(WebClient cashAccountService) {
		return strings -> {
			cashAccountService.get().uri("/all").retrieve().bodyToFlux(String.class).subscribe(System.out::println);
			cashAccountService.get().uri("/account/{id}", "accountid").retrieve().bodyToMono(String.class).subscribe(System.out::println);
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);
	}
}

package com.devsuperior.desafio;

import com.devsuperior.desafio.entities.Order;
import com.devsuperior.desafio.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesafioApplication implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(DesafioApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Order order = new Order(1034, 150.00, 20.00);
		System.out.printf("Pedido código %d\nValor total: R$ %.2f%n", order.getCode(), orderService.total(order));

		Order order2 = new Order(2282, 800.00, 10.00);
		System.out.printf("Pedido código %d\nValor total: R$ %.2f%n", order2.getCode(), orderService.total(order2));

		Order order3 = new Order(1309, 95.90, 0.00);
		System.out.printf("Pedido código %d\nValor total: R$ %.2f%n", order3.getCode(), orderService.total(order3));

	}
}

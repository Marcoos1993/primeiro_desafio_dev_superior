package com.devsuperior.primeiro_desafio;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devsuperior.primeiro_desafio.entities.Order;
import com.devsuperior.primeiro_desafio.services.OrderService;
import com.devsuperior.primeiro_desafio.services.ShippingService;

@SpringBootApplication
public class PrimeiroDesafioApplication implements CommandLineRunner {
	
	@Autowired
	private OrderService orderService;


	public static void main(String[] args) {
		SpringApplication.run(PrimeiroDesafioApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
		
		int code = sc.nextInt();
		double basic = sc.nextDouble();
		double discount = sc.nextDouble();
		
		Order order = new Order(code, basic, discount);
		
		System.out.println("Pedido código " + order.getCode());
		System.out.println("Valor total: R$ " + orderService.total(order));
	
	}


}

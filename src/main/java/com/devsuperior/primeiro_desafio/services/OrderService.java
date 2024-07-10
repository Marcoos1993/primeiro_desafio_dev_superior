package com.devsuperior.primeiro_desafio.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.primeiro_desafio.entities.Order;

@Service
public class OrderService {
	
	@Autowired
	ShippingService shippingService;
	
	
	
	public double total( Order order) {
		
		double total = order.getBasic();
		total -= order.getBasic() * order.getDiscount() / 100;
		total += shippingService.shipment(order);
		return total;
	}

	
}

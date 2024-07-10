package com.devsuperior.primeiro_desafio.services;

import org.springframework.stereotype.Service;

import com.devsuperior.primeiro_desafio.entities.Order;

@Service

public class ShippingService {
	

	public double shipment (Order order) {
		
		double shipment = 0;

		if (order.getBasic() < 100.0) {
			shipment = 20.0;
		}
		
		else if (order.getBasic() < 200.0) {
			shipment = 12.0;
		}
		
		else {
			shipment = 0.0;
		}
		
		return shipment;
		
	}
	
}

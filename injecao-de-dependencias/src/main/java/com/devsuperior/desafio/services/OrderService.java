package com.devsuperior.desafio.services;

import com.devsuperior.desafio.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

//    private final ShippingService shippingService;
//
//    public OrderService(ShippingService shippingService) {
//        this.shippingService = shippingService;
//    }

    @Autowired
    private ShippingService shippingService;

    public double total(Order order) {
        return order.getBasic() * ( 1 - order.getDiscount()/100) + shippingService.shippment(order);
}
}

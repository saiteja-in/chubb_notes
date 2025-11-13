package org.saiteja.simpleblog;

import org.springframework.stereotype.Component;
// Component == Service
@Component
public class OrderService {
    private PaymentService paymentService;
    public OrderService(PaymentService paymentService){
        this.paymentService=paymentService;
    }
    public void placeOrder(){

        paymentService.processPayment(10 );
    }
}

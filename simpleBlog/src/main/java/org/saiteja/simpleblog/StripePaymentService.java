package org.saiteja.simpleblog;

import org.springframework.stereotype.Service;

@Service
public class StripePaymentService implements PaymentService {
    @Override
    public void processPayment(double amt){
        System.out.println("stripping "+amt);
    }
}

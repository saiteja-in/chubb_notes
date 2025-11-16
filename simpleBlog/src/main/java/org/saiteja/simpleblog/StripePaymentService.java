package org.saiteja.simpleblog;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("stripe")
public class StripePaymentService implements PaymentService {
    @Value("${stripe.apiUrl}")
    private String apiUrl;
    @Override
    public void processPayment(double amt){
        System.out.println("stripping "+amt+" "+apiUrl);
    }
}

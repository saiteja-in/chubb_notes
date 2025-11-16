package org.saiteja.simpleblog;

import org.springframework.stereotype.Service;

@Service("paypal")
public class PaypalPaymentService implements PaymentService{
        @Override
        public void processPayment(double amt){
            System.out.println("palling "+amt);
        }


}

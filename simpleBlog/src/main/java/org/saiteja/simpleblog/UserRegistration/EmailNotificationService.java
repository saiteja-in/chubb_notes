package org.saiteja.simpleblog.UserRegistration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class EmailNotificationService implements NotificationService{
    @Value("${mail.host}")
    private String host;
    @Value("${mail.port}")
    private String port;

    @Override
    public void send(String message,String recipientEmail){
        System.out.println("recipient: "+recipientEmail);
        System.out.println("message "+message);
        System.out.println("host"+host);
        System.out.println("port "+port);
    }
}

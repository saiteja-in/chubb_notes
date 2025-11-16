package org.saiteja.simpleblog;

import org.saiteja.simpleblog.UserRegistration.User;
import org.saiteja.simpleblog.UserRegistration.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SimpleBlogApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SimpleBlogApplication.class, args);
//        var orderService = context.getBean(OrderService.class);
//        orderService.placeOrder();
        var userService = context.getBean(UserService.class);
        userService.registerUser(new User(1L,"saiteja","2323","Asdf"));
//        userService.registerUser(new User(1L,"saiteja","2323","Asdf"));
    }


}

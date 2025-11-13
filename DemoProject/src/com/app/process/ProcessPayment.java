package com.app.process;

import com.app.dto.Customer;
import com.app.dto.AccountBalaneException;

public abstract class ProcessPayment {

    public abstract void processFund(Customer initiator, Customer bene, double amount)
            throws AccountBalaneException;

    public abstract boolean validateCustomer(Customer c1);

    public boolean validateEmail(Customer c1) {
        return c1.getEmail() != null && c1.getEmail().contains("@");
    }

    public void initializeEmailServer() {
        System.out.println("Initializing email server...");
    }
}

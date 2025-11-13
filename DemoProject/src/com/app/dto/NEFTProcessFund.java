package com.app.dto;

import com.app.process.ProcessPayment;
import com.app.process.SMSProcessing;
import com.app.dto.AccountBalaneException;

public class NEFTProcessFund extends ProcessPayment implements SMSProcessing {

    @Override
    public void processFund(Customer initiator, Customer bene, double amount)
            throws AccountBalaneException {

        if (amount <= 0) {
            throw new AccountBalaneException("Invalid transfer amount");
        }

        if (initiator.getAmountbalance() < amount) {
            throw new AccountBalaneException("Insufficient balance");
        }

        if (amount > 2000000) {
            throw new AccountBalaneException("Amount exceeds NEFT limit (₹20 lakh)");
        }

        initiator.setAmount(initiator.getAmountbalance() - amount);
        bene.setAmount(bene.getAmountbalance() + amount);
        System.out.println("NEFT Transfer Successful!");
        sendSMS(initiator);
    }

    @Override
    public boolean validateCustomer(Customer c1) {
        return c1 != null && c1.getName() != null && !"Bin Laden".equals(c1.getName());
    }

    @Override
    public boolean sendSMS(Customer c1) {
        System.out.println("SMS sent to: " + c1.getName());
        return true;
    }
}

package com.guzelya;

import java.nio.file.AccessMode;

public class BankAccount {
    private double amount;

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }



    public void deposit(double sum){
        amount = amount + sum;
    }

    public void withDraw(int sum) throws LimitException {
        if (sum > amount){
            throw new LimitException("Your sum is greater than your amount. Amount: " + getAmount(),amount);
        } else{
            amount = amount - sum;
        }
    }
}

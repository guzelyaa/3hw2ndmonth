package com.guzelya;

public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(20000.0);

        while (true){
            try {
                bankAccount.withDraw(6000.0);
            } catch (LimitException e) {
                System.out.println(e.getMessage());
                try {
                    bankAccount.withDraw(LimitException.getRemainingAmount());
                    LimitException.setRemainingAmount(0.0);
                } catch (LimitException limitException) {
                }
                break;
            }
        }
        System.out.println("Remaining amount: " + LimitException.getRemainingAmount());
        System.out.println("Amount: " + bankAccount.getAmount());
    }
}

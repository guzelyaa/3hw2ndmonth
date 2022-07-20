package com.guzelya;

public class LimitException extends Exception {
    private static double remainingAmount;


    public LimitException(String message, double remainingAmount) {
        super(message);
        this.remainingAmount = remainingAmount;
    }

    public static double getRemainingAmount() {
        return remainingAmount;
    }

    public static void setRemainingAmount(double remainingAmount) {
        LimitException.remainingAmount = remainingAmount;
    }
}

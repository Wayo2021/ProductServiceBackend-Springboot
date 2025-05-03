package com.learning.productservices.java.solid.L_LiskovSubstitution.Bad;

public interface LoanPayment {
    public void doPayment(int amount);
    public void foreCloseLoan();
    public void doRepayment(int amount);
}

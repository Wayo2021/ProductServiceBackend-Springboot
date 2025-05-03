package com.learning.productservices.java.solid.L_LiskovSubstitution.Good;


public interface SecureLoan extends LoanPayment {
    public void foreCloseLoan();
}

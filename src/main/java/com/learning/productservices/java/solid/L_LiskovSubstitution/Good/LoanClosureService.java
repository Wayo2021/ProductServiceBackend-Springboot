package com.learning.productservices.java.solid.L_LiskovSubstitution.Good;

public class LoanClosureService {
    private SecureLoan secureLoan;

    public LoanClosureService(SecureLoan secureLoan) {
        this.secureLoan = secureLoan;
    }

    public void foreCloseLoan(){
        secureLoan.foreCloseLoan();
    }
}

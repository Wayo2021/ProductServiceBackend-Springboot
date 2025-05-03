package com.learning.productservices.java.solid.L_LiskovSubstitution.Bad;

public class LoanClosureService {
    private LoanPayment loanPayment;

    public LoanClosureService(LoanPayment loanPayment) {
        this.loanPayment = loanPayment;
    }

    public void foreCloseLoan(){
        loanPayment.foreCloseLoan();
    }
}

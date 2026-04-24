package com.p2p.services;

import com.p2p.domain.*; // Panggil isi folder domain
import java.math.BigDecimal;

public class LoanService {
    public Loan createLoan(Borrower borrower, BigDecimal amount) {
        // VALIDASI UTAMA (TC-01)
        // Jika borrower belum terverifikasi, maka proses harus dihentikan
        validateBorrower(borrower);
        validateAmount(amount);

        if (!borrower.isVerified()) {
            throw new IllegalArgumentException("Borrower not verified");
        }

        Loan loan = new Loan();

        // Jika credit score tinggi = APPROVED, Jika tidak = REJECTED
        if (borrower.getCreditScore() >= 600) {
            loan.approved();
        } else {
            loan.rejected();
        }

        return loan;
    }

    private void validateBorrower(Borrower borrower) {
        // Manggil skill canApplyLoan() milik si Borrower
        if (!borrower.canApplyLoan()) {
            throw new IllegalArgumentException("Borrower not verified");
        }
    }

    private void validateAmount(BigDecimal amount) {
        if (amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Amount must be greater than zero");
        }
    }
}

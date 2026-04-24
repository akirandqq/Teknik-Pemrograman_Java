package com.p2p.services;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.math.BigDecimal;
import com.p2p.domain.Borrower;
import com.p2p.domain.Loan;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoanServicesTest {
    // Membuat instance logger
    private static final Logger logger = LogManager.getLogger(LoanServicesTest.class);
    // @Test
    // void shouldRejectLoanWhenBorrowerNotVerified() {
    //     // Arrange (Kondisi Awal)
    //     // Bikin objek borrower dengan status KYC = false, dan credit score = 700
    //     Borrower borrower = new Borrower(false, 700); 
        
    //     // Bikin service/sistem pinjamannya
    //     LoanService loanService = new LoanService();
        
    //     // Jumlah pinjaman yang mau diajukan (misal 1000)
    //     BigDecimal amount = BigDecimal.valueOf(1000); 
        
    //     // Act & Assert (Aksi & Harapan)
    //     // Kita berharap sistem bakal melempar IllegalArgumentException pas dia ngajuin pinjaman
    //     assertThrows(IllegalArgumentException.class, () -> {
    //         loanService.createLoan(borrower, amount); 
    //     });
    // }

    // @Test
    // void shouldRejectLoanWhenAmountIsZeroOrNegative() {
    //     // Arrange
    //     Borrower borrower = new Borrower(true, 700); 
    //     LoanService loanService = new LoanService();
    //     BigDecimal amount = BigDecimal.ZERO; 
        
    //     // Act & Assert
    //     assertThrows(IllegalArgumentException.class, () -> {
    //         loanService.createLoan(borrower, amount);
    //     });
    // }

    // @Test
    // void shouldApproveLoanWhenCreditScoreHigh() {
    //     // Arrange (Kondisi Awal)
    //     // Borrower KYC valid, Credit Score 700 (High > 600)
    //     Borrower borrower = new Borrower(true, 700); 
    //     LoanService loanService = new LoanService();
    //     BigDecimal amount = BigDecimal.valueOf(1000); // Nominal wajar
        
    //     // Act (Aksi)
    //     Loan loan = loanService.createLoan(borrower, amount);
        
    //     // Assert (Harapan)
    //     // Kita berharap status yang keluar adalah APPROVED
    //     assertEquals(Loan.Status.APPROVED, loan.getStatus());
    // }

    // @Test
    // void shouldRejectLoanWhenCreditScoreLow() {
    //     // Borrower KYC valid, TAPI Credit Score cuma 500 (Low < 600)
    //     Borrower borrower = new Borrower(true, 500); 
    //     LoanService loanService = new LoanService();
    //     BigDecimal amount = BigDecimal.valueOf(1000); 
        
    //     // Act (Aksi)
    //     Loan loan = loanService.createLoan(borrower, amount);
        
    //     // Assert (Harapan)
    //     assertEquals(Loan.Status.REJECTED, loan.getStatus());
    // }


    // Update code dengan menambahkan log di setiap Test Case yang dibuat
    @Test
    void shouldRejectLoanWhenBorrowerNotVerified() {
        logger.info("Mengeksekusi TC-01: shouldRejectLoanWhenBorrowerNotVerified"); // <--- INI CCTV-NYA
        Borrower borrower = new Borrower(false, 700); 
        LoanService loanService = new LoanService();
        BigDecimal amount = BigDecimal.valueOf(1000); 
        
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            loanService.createLoan(borrower, amount); 
        });
        logger.info("Berhasil menolak! Alasan: " + exception.getMessage()); // <--- INI CCTV-NYA
    }

    @Test
    void shouldRejectLoanWhenAmountIsZeroOrNegative() {
        logger.info("Mengeksekusi TC-02: shouldRejectLoanWhenAmountIsZeroOrNegative");
        Borrower borrower = new Borrower(true, 700); 
        LoanService loanService = new LoanService();
        BigDecimal amount = BigDecimal.ZERO; 
        
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            loanService.createLoan(borrower, amount);
        });
        logger.info("Berhasil menolak! Alasan: " + exception.getMessage());
    }

    @Test
    void shouldApproveLoanWhenCreditScoreHigh() {
        logger.info("Mengeksekusi TC-03: shouldApproveLoanWhenCreditScoreHigh");
        Borrower borrower = new Borrower(true, 700); 
        LoanService loanService = new LoanService();
        BigDecimal amount = BigDecimal.valueOf(1000); 
        
        Loan loan = loanService.createLoan(borrower, amount);
        
        assertEquals(Loan.Status.APPROVED, loan.getStatus());
        logger.info("Pinjaman Diterima! Status saat ini: " + loan.getStatus());
    }

    @Test
    void shouldRejectLoanWhenCreditScoreLow() {
        logger.info("Mengeksekusi TC-04: shouldRejectLoanWhenCreditScoreLow");
        Borrower borrower = new Borrower(true, 500); 
        LoanService loanService = new LoanService();
        BigDecimal amount = BigDecimal.valueOf(1000); 
        
        Loan loan = loanService.createLoan(borrower, amount);
        
        assertEquals(Loan.Status.REJECTED, loan.getStatus());
        logger.info("Pinjaman Ditolak karena score rendah! Status saat ini: " + loan.getStatus());
    }
}

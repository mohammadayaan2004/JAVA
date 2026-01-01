package AdvancedJava.hdfc.entities;

import java.time.LocalDate;

class Account {
       
    String ifscCode;        
    String Date_of_Opening;
    String Customer_ID;
     // Core account details
    private int customerId;             // linked to Customer
    private String accountType;         // Savings, Current, Loan, FD
    private double balance;             // current balance
    private LocalDate openingDate;      // account opening date
    private String branchCode;        
    private double interestRate;        // for savings/FD
    private double overdraftLimit;      // for current account
    private double minBalance;          // required minimum balance

    // Status
    private String status;              // Active, Dormant, Closed, Blocked
    private boolean internetBankingEnabled;
    private boolean debitCardIssued; 
}

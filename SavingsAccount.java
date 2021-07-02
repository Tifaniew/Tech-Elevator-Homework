package com.techelevator;

public class SavingsAccount extends BankAccount {
    public SavingsAccount(String accountHolderName, String accountNumber) {
        //super(accountHolderName, accountNumber, DEFAULT_BALANCE);
        this(accountHolderName, accountNumber, DEFAULT_BALANCE);
    }

    public SavingsAccount(String accountHolderName, String accountNumber, int balance) {
        super(accountHolderName, accountNumber, balance);
    }

    @Override
    public int withdraw(int amountToWithdraw) {
        int newBalance = getBalance() - amountToWithdraw;
        if (newBalance > 0) {
            if(newBalance < 150) {
                amountToWithdraw += 2;
            }
            return super.withdraw(amountToWithdraw);
        }

        return getBalance();
    }
}


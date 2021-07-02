package com.techelevator;

public class CheckingAccount extends BankAccount {

    public CheckingAccount(String accountHolderName, String accountNumber) {
        super(accountHolderName, accountNumber, DEFAULT_BALANCE);

    }

    public CheckingAccount(String accountHolderName, String accountNumber, int balance) {
        super(accountHolderName, accountNumber, balance);
    }

    @Override
    public int withdraw(int amountToWithdraw) {
        int newBalance = getBalance() - amountToWithdraw;
        if (newBalance > -100) {
            if(newBalance <= 0) {
                    amountToWithdraw += 10;
        }
            return super.withdraw(amountToWithdraw);
        }
            return super.getBalance();
        }
}




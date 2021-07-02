package com.techelevator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BankCustomer implements Accountable {

    private String name;
    private String address;
    private String phoneNumber;
    private List<Accountable> accounts = new ArrayList<Accountable>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    //should return an array of accountables rather than a list

    public Accountable[] getAccounts() {
        return accounts.toArray(new Accountable[accounts.size()]);
    }

    public void addAccount(Accountable newAccount) {
        accounts.add(newAccount);

    }

    public boolean isVip() {
        int total = 0;
        for (Accountable accountable : accounts) {
            total += accountable.getBalance();
        }
        return total >= 25000.00;
    }
        public int getBalance () {
            return 0;
        }
    }


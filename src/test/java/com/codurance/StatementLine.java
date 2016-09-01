package com.codurance;

public class StatementLine {
    private final String date;
    private final int amount;
    private final int balance;

    public StatementLine(String date, int amount, int balance) {
        this.date = date;
        this.amount = amount;
        this.balance = balance;
    }

    public String getDate() {
        return date;
    }

    public int getAmount() {
        return amount;
    }

    public int getBalance() {
        return balance;
    }
}

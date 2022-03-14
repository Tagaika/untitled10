package com.company;

public class BankAccount {
    private double amount;

    public BankAccount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
    public void deposit(double sum){
        amount = amount + sum;
    }
    public void withDraw(int sum) throws LimitException {
        amount= amount - sum;
        if(sum > amount) { throw new LimitException("На вашем балансе недостаточно средств. На вашем балансе "+ amount, amount);
        }


    }
}

package fintech.model;

import java.util.ArrayList;
import java.util.List; 
 
/** 
 * @autor 12S23023 Lenni Febriyani 
 * @autor 12S23045 Chintya Regina Uli Rajagukguk 
 */ 
 
public class Account {
    private String owner;
    private String accountName;
    private double balance;
    private List<Transaction> transactions;

    public Account(String owner, String accountName) {
        this.owner = owner;
        this.accountName = accountName;
        this.balance = 0.0;
        this.transactions = new ArrayList<>();
    }

    public String getOwner() {
        return owner;
    }

    public String getAccountName() {
        return accountName;
    }

    public double getBalance() {
        return balance;
    }

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
        balance += transaction.getAmount();
    }

    @Override
    public String toString() {
        return accountName + "|" + owner + "|" + balance;
    }
}
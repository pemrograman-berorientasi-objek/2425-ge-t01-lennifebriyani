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
 
    public void deposit(double amount) { 
        if (amount > 0) { 
            balance += amount; 
            transactions.add(new Transaction("deposit", amount)); 
        } 
    } 
 
    public void withdraw(double amount) { 
        if (amount > 0 && amount <= balance) { 
            balance -= amount; 
            transactions.add(new Transaction("withdraw", amount)); 
        } 
    } 
 
    public List<Transaction> getTransactions() { 
        return transactions; 
    } 
 
    @Override 
    public String toString() { 
        return "Account{" + 
                "owner='" + owner + '\'' + 
                ", accountName='" + accountName + '\'' + 
                ", balance=" + balance + 
                '}'; 
    } 
}  
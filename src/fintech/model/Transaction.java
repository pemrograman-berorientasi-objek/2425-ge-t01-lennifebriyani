package fintech.model; 
 
/** 
 * @autor 12S23023 Lenni Febriyani 
 * @autor 12S23045 Chintya Regina Uli Rajagukguk 
 */  

public class Transaction {
    private static int idCounter = 0;
    private int id;
    private String accountName;
    private double amount;
    private String postedAt;
    private String note;

    public Transaction(String accountName, double amount, String postedAt, String note) {
        this.id = ++idCounter;
        this.accountName = accountName;
        this.amount = amount;
        this.postedAt = postedAt;
        this.note = note;
    }

    public int getId() {
        return id;
    }

    public String getAccountName() {
        return accountName;
    }

    public double getAmount() {
        return amount;
    }

    public String getPostedAt() {
        return postedAt;
    }

    public String getNote() {
        return note;
    }

    @Override
    public String toString() {
        return id + "|" + accountName + "|" + amount + "|" + postedAt + "|" + note;
    }
}
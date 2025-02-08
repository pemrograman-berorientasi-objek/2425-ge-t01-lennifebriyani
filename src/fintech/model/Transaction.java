package fintech.model; 
 
/** 
 * @autor 12S23023 Lenni Febriyani 
 * @autor 12S23045 Chintya Regina Uli Rajagukguk 
 */  
public class Transaction { 
    private String type; 
    private double amount; 
 
    public Transaction(String type, double amount) { 
        this.type = type; 
        this.amount = amount; 
    }  
 
    public String getType() { 
        return type; 
    } 
 
    public double getAmount() { 
        return amount; 
    } 
 
    @Override 
    public String toString() { 
        return "Transaction{" + 
                "type='" + type + '\'' + 
                ", amount=" + amount + 
                '}'; 
    } 
}  
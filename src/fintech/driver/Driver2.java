package fintech.driver; 
 
import fintech.model.Account; 
import fintech.model.Transaction; 
import java.util.Scanner; 
import java.text.SimpleDateFormat; 
import java.util.Date; 
 
/** 
 * @autor 12S23023 Lenni Febriyani 
 * @autor 12S23045 Chintya Regina Uli Rajagukguk 
 */ 
   
public class Driver2 { 
 
    public static void main(String[] _args) { 
        Scanner scanner = new Scanner(System.in); 
 
        // Read command 
        String command = scanner.nextLine(); 
 
        if (command.equals("create-account")) { 
            // Read owner name 
            String owner = scanner.nextLine(); 
            // Read account name 
            String accountName = scanner.nextLine(); 
 
            // Create account 
            Account account = new Account(owner, accountName); 
 
            // Print account details in the expected format 
            System.out.println(account.getAccountName() + "|" + account.getOwner() + "|" + account.getBalance()); 
 
            // Read next command 
            int transactionId = 1; 
            while (scanner.hasNextLine()) { 
                String nextCommand = scanner.nextLine(); 
                if (nextCommand.equals("deposit")) { 
                    double amount = scanner.nextDouble(); 
                    scanner.nextLine(); // consume the newline 
                    String description = scanner.nextLine(); 
                    account.deposit(amount); 
                    String timestamp = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date()); 
                    System.out.println(transactionId + "|" + account.getAccountName() + "|" + account.getBalance() + "|" + timestamp + "|" + description + "|" + amount); 
                    transactionId++; 
                } else if (nextCommand.equals("withdraw")) { 
                    double amount = scanner.nextDouble(); 
                    scanner.nextLine(); // consume the newline 
                    String description = scanner.nextLine(); 
                    account.withdraw(amount); 
                    String timestamp = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date()); 
                    System.out.println(transactionId + "|" + account.getAccountName() + "|" + account.getBalance() + "|" + timestamp + "|" + description + "|" + amount); 
                    transactionId++; 
                } else if (nextCommand.equals("exit")) { 
                    break; 
                } else { 
                    System.out.println("Invalid command"); 
                } 
            } 
        } else { 
            System.out.println("Invalid command"); 
        } 
 
        scanner.close(); 
    } 
} 
package fintech.driver;  
  
import fintech.model.Account;  
import java.util.Scanner;  
  
/**  
 * @author 12S23023 Lenni Febriyani  
 * @author 12S23045 Chintya Regina Uli Rajagukguk  
 */  
  
public class Driver1 {   
  
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
        } else {  
            System.out.println("Invalid command");  
        }  
   
        scanner.close();  
    }  
} 
package fintech.driver;

import fintech.model.Account;
import fintech.model.Transaction;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
 
/** 
 * @autor 12S23023 Lenni Febriyani 
 * @autor 12S23045 Chintya Regina Uli Rajagukguk 
 */ 
   
public class Driver2 {
    private static Map<String, Account> accounts = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read create-account command
        String command = scanner.nextLine();
        if (command.equals("create-account")) {
            String owner = scanner.nextLine();
            String accountName = scanner.nextLine();
            Account account = new Account(owner, accountName);
            accounts.put(accountName, account);
            System.out.println(account);
        }

        // Read create-transaction command
        command = scanner.nextLine();
        if (command.equals("create-transaction")) {
            String accountName = scanner.nextLine();
            double amount = Double.parseDouble(scanner.nextLine());
            String postedAt = scanner.nextLine();
            String note = scanner.nextLine();

            Account account = accounts.get(accountName);
            if (account != null) {
                Transaction transaction = new Transaction(accountName, amount, postedAt, note);
                account.addTransaction(transaction);
                System.out.println(transaction + "|" + account.getBalance());
            }
        }

        scanner.close();
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
package managers;

import entity.Account;
import java.util.Scanner;
import tools.InputProtection;

public class AccountManager {
    private final Scanner scanner;

    public AccountManager(Scanner scanner) {
        this.scanner = scanner;
    }
    
    public AccountManager(Account[] accounts) {
       System.out.println("----- Add Money to Account -----");
        System.out.print("Enter customer's account number: ");
        String accountNumber = scanner.nextLine();

        Account account = findAccountByAccountNumber(accounts, accountNumber);

        if (account != null) {
            System.out.println("Account found: " + account.getAccountNumber());
            System.out.print("Enter the amount to add: ");
            double amountToAdd = InputProtection.doubleInput(0, Double.MAX_VALUE);
            double currentBalance = account.getAccountBalance();
            account.setAccountBalance(currentBalance + amountToAdd);

            System.out.println("Money added successfully. Updated account balance: " + account.getAccountBalance());
        } else {
            System.out.println("Account with account number " + accountNumber + " not found.");
        }
    }


    private Account findAccountByAccountNumber(Account[] accounts, String accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }
}

*/


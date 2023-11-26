/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptv22homework;

import entity.Account;
import managers.SaveManager;
import managers.CustomerManager;
import managers.MedicationManager;
/*import managers.AccountManager;*/
import entity.Customer;
import entity.Medication;
import java.util.Arrays;
import java.util.Scanner;
import tools.InputProtection;

public class App {
    private final Scanner scanner; 
    private Medication[] medications;
    private Customer[] customers;
    private Account[] accounts;
    private final MedicationManager medicationManager;
    private final CustomerManager customerManager;
    /*private final AccountManager accountManager;*/
    private final SaveManager saveManager;

    public App() {
        this.scanner = new Scanner(System.in);
        this.saveManager = new SaveManager();
        this.medications = saveManager.loadMedications();
        this.customers = saveManager.loadCustomers();
        this.medicationManager = new MedicationManager(scanner);
        this.customerManager = new CustomerManager(scanner);
        /* this.accountManager = new AccountManager(scanner);*/
    }

    public void run() {
        boolean repeat = true;
        System.out.println("------- Pharmacy -------");
        do {
            System.out.println("List tasks:");
            System.out.println("0. Exit");
            System.out.println("1. Add new medication");
            System.out.println("2. Print list medications");
            System.out.println("3. Add new customer");
            System.out.println("4. Print list customers");
            System.out.println("5. Add money to a customer's account");
            System.out.println("6. Evaluate sold medications");
            System.out.println("7. Evaluate high-value customers");
            System.out.println("8. Print total turnover");
            
            System.out.print("Enter task number: ");
            int task = InputProtection.intInput(0, 6); 
            switch (task) {
                case 0:
                    repeat = false;
                    break;
                case 1:
                    this.medications = Arrays.copyOf(this.medications, this.medications.length + 1);
                    this.medications[this.medications.length - 1] = medicationManager.addMedication();
                    saveManager.saveMedications(this.medications);
                    break;
                case 2:
                    medicationManager.printListMedications(medications);
                    break;
                case 3:
                    this.customers = Arrays.copyOf(this.customers, this.customers.length + 1);
                    this.customers[this.customers.length - 1] = customerManager.addCustomer(customers);
                    saveManager.saveCustomers(customers);
                    break;
                case 4:
                    customerManager.printListCustomers(customers);
                    break;
                /*
                case 5:
                    accountManager.AccountManager(accounts);
                    saveManager.saveAccount(accounts);
                    break;
                    */
                default:
                    System.out.println("Select from the list of tasks!");
            }
            System.out.println("-----------------------");
        } while (repeat);
        System.out.println("Goodbye!");
    }
}
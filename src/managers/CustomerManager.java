/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managers;

import entity.Customer;
import java.util.Scanner;
import tools.InputProtection;

public class CustomerManager {

    private final Scanner scanner;

    public CustomerManager(Scanner scanner) {
        this.scanner = scanner;
    }
    public Customer addCustomer(Customer[] customers) {
        System.out.println("----- Add Customer -----");
        Customer customer = new Customer();
        System.out.print("Enter customer first name: ");
        customer.setFirstName(scanner.nextLine());
        System.out.print("Enter customer last name: ");
        customer.setLastName(scanner.nextLine());
        System.out.print("Enter customer phone number: ");
        customer.setPhoneNumber(scanner.nextLine());

        System.out.println("Added customer: " + customer.toString());
        return customer;
    }
    public void printListCustomers(Customer[] customers) {
        System.out.println("----- List Customers -----");
        for (int i = 0; i < customers.length; i++) {
            System.out.printf("%d. %s %s%n",
                    i + 1,
                    customers[i].getFirstName(),
                    customers[i].getLastName()
            );
        }
    }
}
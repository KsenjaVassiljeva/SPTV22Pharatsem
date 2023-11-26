/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managers;

import entity.Medication;
import java.util.Scanner;
import tools.InputProtection;

public class MedicationManager {

    private final Scanner scanner;

    public MedicationManager(Scanner scanner) {
        this.scanner = scanner;
    }

    public Medication addMedication() {
        System.out.println("----- Add Medication -----");
        Medication medication = new Medication();
        System.out.print("Enter medication name: ");
        medication.setName(scanner.nextLine());
        System.out.print("Enter manufacturer: ");
        medication.setManufacturer(scanner.nextLine());
        System.out.print("Enter price: ");
        medication.setPrice(InputProtection.doubleInput(0, Double.MAX_VALUE));
        System.out.print("Enter quantity available: ");
        medication.setQuantity(InputProtection.intInput(0, Integer.MAX_VALUE));

        System.out.println("Added medication: " + medication.toString());
        return medication;
    }

    public void printListMedications(Medication[] medications) {
        System.out.println("----- List Medications -----");
        for (int i = 0; i < medications.length; i++) {
            System.out.printf("%d. %s%n",
                    i + 1,
                    medications[i].getName()
            );
        }
    }
}

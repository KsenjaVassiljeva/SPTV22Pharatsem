package managers;

import entity.Customer;
import entity.Medication;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SaveManager {
    private final String MEDICATION_FILENAME = "medications";
    private final String CUSTOMER_FILENAME = "customers";
    private final String TRANSACTIONS_FILENAME = "transactions";

    public Medication[] loadMedications() {
        Medication[] medications = new Medication[0];
        FileInputStream fis;
        ObjectInputStream ois;
        try {
            fis = new FileInputStream(MEDICATION_FILENAME);
            ois = new ObjectInputStream(fis);
            medications = (Medication[]) ois.readObject();
        } catch (FileNotFoundException ex) {
            System.out.printf("File \"%s\" not found!%n", MEDICATION_FILENAME);
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println("Error during loading medications!");
        }
        return medications;
    }

    public void saveMedications(Medication[] medications) {
        ObjectOutputStream oos;
        FileOutputStream fos;
        try {
            fos = new FileOutputStream(MEDICATION_FILENAME);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(medications);
            oos.flush();
        } catch (FileNotFoundException ex) {
            System.out.printf("File \"%s\" not found!%n", MEDICATION_FILENAME);
        } catch (IOException ex) {
            System.out.println("Error during saving medications!");
        }
    }

    public Customer[] loadCustomers() {
        Customer[] customers = new Customer[0];
        FileInputStream fis;
        ObjectInputStream ois;
        try {
            fis = new FileInputStream(CUSTOMER_FILENAME);
            ois = new ObjectInputStream(fis);
            customers = (Customer[]) ois.readObject();
        } catch (FileNotFoundException ex) {
            System.out.printf("File \"%s\" not found!%n", CUSTOMER_FILENAME);
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println("Error during loading customers!");
        }
        return customers;
    }

    public void saveCustomers(Customer[] customers) {
        ObjectOutputStream oos;
        FileOutputStream fos;
        try {
            fos = new FileOutputStream(CUSTOMER_FILENAME);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(customers);
            oos.flush();
        } catch (FileNotFoundException ex) {
            System.out.printf("File \"%s\" not found!%n", CUSTOMER_FILENAME);
        } catch (IOException ex) {
            System.out.println("Error during saving customers!");
        }
    }
}


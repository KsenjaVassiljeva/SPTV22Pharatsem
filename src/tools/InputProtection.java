/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class InputProtection {
    public static int intInput(int beginRange, int endRange){
        Scanner scanner = new Scanner(System.in);
        int number = -1;
        do{
            try {
                number = scanner.nextInt();
                scanner.nextLine();
            } catch (Exception e) {
                scanner.nextLine();
                System.out.print("Please enter a number: ");
                continue;
            }
            if(number >= beginRange && number <= endRange){
                return number;
            }else{
                System.out.printf("Please enter a number (%d .. %d): ",beginRange, endRange);
                continue;
            }
        }while(true);
        
    }
    private static final Scanner scanner = new Scanner(System.in);
    
    public static double doubleInput(double min, double max) {
        double value;
        while (true) {
            try {
                value = Double.parseDouble(scanner.nextLine());
                if (value >= min && value <= max) {
                    break;
                } else {
                    System.out.printf("Please enter a value between %.2f and %.2f: ", min, max);
                }
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Please enter a valid double value: ");
            }
        }
        return value;
    }
}

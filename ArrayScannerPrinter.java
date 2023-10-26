/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array;

/**
 *
 * @author User
 */
import java.util.Scanner;

public class ArrayScannerPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        // Create an array
        int[] arr = new int[size];

        // Read values into the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Print the array
        System.out.print("Array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]);

            // Print a comma and space except for the last element
            if (i < size - 1) {
                System.out.print(", ");
            }
        }

        scanner.close();
    }
}


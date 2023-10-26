/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array;

/**
 *
 * @Ratul
 */
import java.util.Scanner;

public class UserDefinedTwoDArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get the dimensions of the 2D array
        System.out.print("Enter the number of rows: ");
        int numRows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int numCols = scanner.nextInt();
        
        // Create a 2D array
        int[][] matrix = new int[numRows][numCols];
        
        // Read values into the 2D array
        System.out.println("Enter the elements of the 2D array:");
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Print the 2D array
        System.out.println("2D Array:");
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // Move to the next row
        }

        scanner.close();
    }
}

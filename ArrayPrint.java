/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array;

public class ArrayPrint {
    public static void main(String[] args) {
        // Sample array of integers
        int[] numbers = {1, 2, 3, 4, 5};

        // Print the array elements
        System.out.print("Array: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            
            // Print a comma and space except for the last element
            if (i < numbers.length - 1) {
                System.out.print(", ");
            }
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sortCollection;

/**
 *
 * @author Laira Pratama
 */
public class Removeodd {

    public int[] removeOdd(int[] arr) {
        // Count even elements to calculate the size of the new array
        int evenCount = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                evenCount++;
            }
        }

        // Create a new array to store only even elements
        int[] evenArr = new int[evenCount];

        // Copy even elements and avoid modifying the original array
        int j = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                evenArr[j++] = num;
            }
        }

        // Print removed odd numbers (informative message)
        System.out.println("nilai yang dihilangkan:");
        for (int num : arr) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println("\nhasilnya"); // Newline for better formatting

        return evenArr;
    }
}



// Chapter 1 ( Triangle.java )
// French Cyril Sambilad BSIT-2E

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
    
        for (int i = 1; i <= rows; i++) {
          
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // Print 'T' with spaces between them
            for (int j = 1; j <= i; j++) {
                System.out.print("T ");
            }
           
            System.out.println();
        }

    }
}

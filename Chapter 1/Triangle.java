// Chapter 1 ( Triangle.java )
// French Cyril Sambilad BSIT-2E

public class Triangle {
    public static void main(String[] args) {
        int rows = 6; 

        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("T");
            }

            System.out.println();
        }
    }
}
/*
 public class Triangle {
    public static void main(String[] args) {
        // Print each line of the pyramid
        System.out.println("      T      ");
        System.out.println("     TTT     ");
        System.out.println("    TTTTT    ");
        System.out.println("   TTTTTTT   ");
        System.out.println("  TTTTTTTTT  ");
        System.out.println(" TTTTTTTTTTT ");
        System.out.println("TTTTTTTTTTTTT");
    }
}
*/


import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please input three numbers. ");
        
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();
        
        
        if (num1 <= num2 && num2 <= num3) {
            System.out.println("Numbers rearranged in ascending order: " + num1 + ", " + num2 + ", " + num3);
        } else {
            
            if (num1 >= num2 && num2 >= num3) {
                System.out.println("Numbers rearranged in descending order: " + num1 + ", " + num2 + ", " + num3);
            } else if (num1 >= num3 && num3 >= num2) {
                System.out.println("Numbers rearranged in descending order: " + num1 + ", " + num3 + ", " + num2);
            } else if (num2 >= num1 && num1 >= num3) {
                System.out.println("Numbers rearranged in descending order: " + num2 + ", " + num1 + ", " + num3);
            } else if (num2 >= num3 && num3 >= num1) {
                System.out.println("Numbers rearranged in descending order: " + num2 + ", " + num3 + ", " + num1);
            } else if (num3 >= num1 && num1 >= num2) {
                System.out.println("Numbers rearranged in descending order: " + num3 + ", " + num1 + ", " + num2);
            } else {
                System.out.println("Numbers rearranged in descending order: " + num3 + ", " + num2 + ", " + num1);
            }
        }
    }
}

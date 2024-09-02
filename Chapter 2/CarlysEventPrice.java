import java.util.Scanner;

public class CarlysEventPrice {
    public static void main(String[] args) {
        final int PRICE = 35;

        Scanner input = new Scanner(System.in);

        System.out.println("****************************************");
        System.out.println("* Carly's makes the food that makes   *" );
        System.out.println("*        it a party.                   *");
        System.out.println("****************************************");
        
        
        System.out.print("Enter the number of guests attending the event: ");
        int numberOfGuests = input.nextInt();

        int totalPrice = numberOfGuests * PRICE;

        System.out.println("Number of guests: " + numberOfGuests);
        System.out.println("Price per guest: $" + PRICE);
        System.out.println("Total price: $" + totalPrice);
        
        if(numberOfGuests >= 50){
          System.out.println("Is it a large event? True");
      }else{
          System.out.println("Is this a large event? False");
        }
    }
}

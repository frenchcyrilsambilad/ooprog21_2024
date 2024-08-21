// Chapter 1 ( SwingAlert.java )
// French Cyril Sambilad BSIT-2E

import javax.swing.JOptionPane;

public class SwingAlert{
   public static void main(String[] args){
      JOptionPane.showMessageDialog(null, "Hello World!");
   }
}

/*
import javax.swing.JOptionPane;

public class SwingAlert {
    public static void main(String[] args) {
        int numberToGuess = 5; 
        String guess = JOptionPane.showInputDialog("Guess a number between 1 and 10:");
        int guessedNumber = Integer.parseInt(guess);

        if (guessedNumber == numberToGuess) {
            JOptionPane.showMessageDialog(null, "You guessed it! The number is 5.");
        } else {
            JOptionPane.showMessageDialog(null, "Oops! Wrong guess. The number was 5.");
        }

        JOptionPane.showMessageDialog(null, "Thanks for playing!");
    }
}
*/

import java.util.Random;
import javax.swing.JOptionPane;

public class NumberGuessingGame {

    public static void main(String[] args) {

        int initialNumber = 1;
        int closingNumber = 100;

        int Attempts = 5;
        int score = 0;

        Random random = new Random();
        int randomNumber = random.nextInt(closingNumber - initialNumber + 1) + initialNumber;

        JOptionPane.showMessageDialog(null, "Welcome to the Number Guessing Game!");

        for (int i = initialNumber; i <= Attempts; i++) {

            String number = JOptionPane.showInputDialog("Guess the number between " + 1 + " and " + 100 + ":");
            int guessNumber = Integer.parseInt(number);

            if (guessNumber == randomNumber) {
                JOptionPane.showMessageDialog(null, "Congratulations!!!! You've guessed the correct number : " + guessNumber + " in " + i + " attempts.");
                score = Attempts - i + 1;
                break;
            }
            else if (guessNumber < randomNumber) {
                JOptionPane.showMessageDialog(null, "Your guess number is lower than the expected random number. Try again. " + ( Attempts - i ) + " Attempts Left.");
            }
            else {
                JOptionPane.showMessageDialog(null, "Your guess number is higher than the expected random number. Try again."  + ( Attempts - i ) + " Attempts Left.");
            }

        }

        if(score > 0){
            JOptionPane.showMessageDialog(null, "Your final score is: " + score + " 🎯");
        }
        else {
            JOptionPane.showMessageDialog(null, "Your final score is: " + score + " ❌");
        }

    }


}
import java.io.Console;

public class BinarySearch
{

 public static void main(String[] args)
  {
    int theAnswer = 50;
    int min = 1;
    int max = 3000;
    int numGuess;


     do {
      numGuess = (max - min) / 2 + min;

      if (numGuess == theAnswer) {
        System.out.println("You guessed it!");
      }
//If the guess was too low, set min to be one larger than the guess.
      else if (numGuess < theAnswer) {
        min = numGuess + 1;
        System.out.println("Guess higher than " + min + ".");
      }
//If the guess was too high, set max to be one smaller than the guess.
      else if (numGuess > theAnswer) {
        max = numGuess - 1;
        System.out.println("Guess lower than " + max + ".");
      }
     }
     while (numGuess != theAnswer);
   }
 }




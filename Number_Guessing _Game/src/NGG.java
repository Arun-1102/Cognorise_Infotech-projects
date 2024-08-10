

import java.util.Random;
import java.util.Scanner;

public class NGG
{

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        System.out.println("**************  Welcome to the Number Guessing Game  **************");
        System.out.println("==>>  Please Enter the maximum number of attempts that you wnat's to play  <<==");
        int maxAttempts =scan.nextInt(); // Define the maximum number of attempts
        int attempt = 0;
        int randomNumber = random.nextInt(100) + 1; // Generates random number between 1 and 100
        System.out.println("==>>  I have chosen a number between 1 and 100.  <<==");

        while (attempt < maxAttempts)
        {
            System.out.print("Enter your guess: ");
            int guess = scan.nextInt();
            //System.out.println();
            attempt++;

            if (guess < randomNumber)
            {
                System.out.println("**Your guess is too low**.\n");
            }
            else if (guess > randomNumber)
            {
                System.out.println("**Your guess is too high**.\n");
            }
            else
            {
                System.out.println("***Congratulations! You guessed the number correctly in " + attempt + " attempts.***");
                break;
            }

        }

        if (attempt == maxAttempts )//&& randomNumber != scan.nextInt())
        {
            System.out.println("**Sorry, you have reached th maximum no.of attempts**.\n");
            System.out.println("***  The number I was thinking of was: " + randomNumber+"  ***\n\n");
        }


    }
}

import java.util.Scanner;

public class guessNumber
{
  public static void main(String[] args) 
  {
    Scanner scan = new Scanner(System.in);
   // Choose a random number from 0-100 
    int rand = (int)(Math.random() * 101);

    

    

   // Ask the user to guess a number from 0 to 100 
   // Get the first guess using scan.nextInt();
   System.out.println("Please guess a number from 0 to 100");
   int input = scan.nextInt();

   // Loop while the guess does not equal the random number,
   while(input != rand)
   {
        if (input < rand)
        {
            System.out.println("Too Low!");
        }
        else if (input > rand)
        {
            System.out.println("Too High!");
        }
        System.out.println("Guess again : ");
        input = scan.nextInt();
   }

   System.out.println("You got it!");
     // If the guess is less than the random number, print out "Too low!"
   
     // If the guess is greater than the random number, print out "Too high!"
   
     // Get a new guess (save it into the same variable)
   

  // Print out something like "You got it!"

  String message = "Ix lovex youxxx";
        System.out.println(message);
        while(message.indexOf("x") != -1)
        {
            message = message.substring(0, message.indexOf("x")) + message.substring(message.indexOf("x") + 1, message.length());
            System.out.println(message);
        }

  }
}
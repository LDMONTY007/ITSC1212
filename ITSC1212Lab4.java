import java.util.Scanner;

public class ITSC1212Lab4 {
    
    public static void main(String[] args) {
        String startMessage = "****************************  START  *******************************\n";
        String endMessage = "\n****************************   END   *******************************\n";
        System.out.println(startMessage);
        
        // create a scanner object to use for user input
        // Scanner scnr = new Scanner(System.in);
        //**************************** DO NOT MODIFY ANYTHING BEFORE THIS LINE ****************************
        // Add your code here
        // String name = scnr.nextLine();
        // name = name.toUpperCase();
        // System.out.println("Welcome to ITSC1212 " + name);
        String welcomeMessage = "Welcome to ITSC1212";
        String name = "logan";
        String fullMessage = welcomeMessage + " " + name;
        fullMessage = fullMessage.toUpperCase(); //This is what causes us to get a -1, because lowercase 'to' cannot be found.
        System.out.println(fullMessage);
        System.out.println("The length of this message is: " + fullMessage.length());
        System.out.println("The word 'to' is located at index: " + fullMessage.indexOf("to"));
        
        //Part B
        // Math.random() generates a random number between 0 and 1 exclusive.
        // Math.abs(int) calculates the absolute value of an integer
        // Math.pow(double, double) calculates double raised to the power of the second double
        // Math.sqrt(double) the square root of input double
        // (Math.random()) 0-1 exclusive
        // (int) (Math.random()) always 0
        // (int) (Math.random() * 5) 0-4
        // (int) (Math.random() * 2) 0-1
        // (int) (Math.random() * 9 + 1) 1-9

        //Part C

        



         //**************************** DO NOT MODIFY ANYTHING BELOW THIS LINE ****************************
        System.out.println(endMessage);
    }
    
}

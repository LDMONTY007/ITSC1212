import java.util.Scanner;

public class ITSC1212Lab1 {
    public static void main(String[] args) 
    {
        //System.out.println("Hello");
        //System.out.println("World!");

        //Part C
        int x;
        x = 5; 
        
        //Note I would use Concatanation here but it isn't what the code uses so I won't
        System.out.print("The Value of x : ");
        System.out.println(x);
        System.out.print("The Value of x + 2 : ");
        System.out.println(x + 2);
        System.out.print("The Value of x * x : ");
        System.out.println(x * x);
        System.out.print("The Value of x / 2 : ");
        

        double y = x / 2.0;

        System.out.println(y);

        //Part D
        System.out.println("Enter a temperature in F");
        Scanner scnr = new Scanner(System.in);

        double tempF = scnr.nextDouble();
        System.out.println("The value entered was " + tempF);
        double tempC = (tempF - 32) * (5.0/9.0);
        System.out.println("The temperature in C is " + tempC);
    }
}

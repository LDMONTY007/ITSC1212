import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.Scanner;

import javax.naming.event.ObjectChangeListener;


public class Business 
{
    private static String companyName = "LD's big freaking bakery";
    private static String ownerName = "LD"; //That's me!
    private static int itemTotal = 10;
    private static MenuItem[] menu = //The only time I think this is acceptable code formatting is for an array/list of values.
    {
    new MenuItem("A1", "Large Drink", 1.95), 
    new MenuItem("A2", "Even Larger Drink", 59.95), 
    new MenuItem("A3", "A Pint", 3.95),
    new MenuItem("A4", "Pizza", 8.95),
    new MenuItem("A5", "Pasta (only noodle, and only rigatoni, no sauce, no butter)", 5.95),
    new MenuItem("A6", "Deep Dish Pizza", 6.95),
    new MenuItem("A7", "Deepest Dish Pizza (4x as much Marinara)", 19.95),
    new MenuItem("A8", "Actual Garbage", 0.95),
    new MenuItem("A9", "Chicken", 12.95),
    new MenuItem("A10", "Steak", 14.95)
    };
    private static String decorativeLine = "****************************************";
    public static void main(String[] args) throws InterruptedException 
    {
        LDUtil.consolidate(menu);
        String userName = new String();
        Scanner scnr = new Scanner(System.in);
        int itemCount = 0;
        MenuItem[] order = new MenuItem[0];

        System.out.println(decorativeLine);
        Thread.sleep(700);
        System.out.println("Welcome to " + companyName + "!");
        Thread.sleep(700);
        System.out.println("I am " + ownerName + ". what's your name?");
        userName = scnr.nextLine();
        Thread.sleep(700);
        System.out.println("Nice to meet you " + userName + "!");
        Thread.sleep(700);
        //Part B
        System.out.println("Here's what we serve, " + userName + ". Have a look:");
        for (int i = 0; i < itemTotal; i++)
        {
            Thread.sleep(700);
            //System.out.println(i + ":" + menu[i - 1]);
            System.out.println(menu[i]);
        }
        //Part C
        Thread.sleep(700);
        System.out.println("\nHow many items would you like to order? (Please enter an integer)");
        itemCount = LDUtil.GetNextOfType(scnr, int.class, 0, 20);

        order = new MenuItem[itemCount]; //instantiate the new array
        for (int i = 1; i <= itemCount; i++) //loop through array and assign values.
        {
            System.out.print("Please enter the ID of your " + LDUtil.GetOrdinalNumber(i) + " item:");
            String inputID = scnr.nextLine();
            System.out.println(inputID);
            //order[i - 1] = menu[scnr.nextInt()];
            //order[i - 1] = menu[getNextOfType(scnr, int.class, 1, itemTotal) - 1];
            MenuItem tempItem = findItem(menu, inputID);
            while(tempItem.GetID().equals("")) //if our ID is empty from the returned object then prompt the user to enter a new ID
            {
                System.out.println("Please enter a valid ID:");
                inputID = scnr.nextLine();
                tempItem = findItem(menu, inputID);
            }
            order[i - 1] = tempItem;
        }

        System.out.println("\nThank you " + userName + " for your order!"); //Thank the user

        for (int i = 0; i < itemCount; i++) //print your order
        {
            if (i == itemCount - 1)
                System.out.println(order[i]);
            else
                System.out.print(order[i] + ", ");
        }

        //Part F

        System.out.println("________________________________________");


        double total = 0;
        for (MenuItem item : order) 
        {
            total += item.GetPrice();    
        }
        total = LDUtil.RoundPoints(total, 2); //Round to 2 decimal points.
        System.out.println("\t\t$" + String.format("%.2f", total) + "\t\t"); //Eliminates trailing zeros upon printing.
        
        
        System.out.println("\nThank you " + userName + " for your order! " + "Your orders coming right up. Have a good day!"); // Thank the user

        Thread.sleep(700);
        System.out.println("\n" + decorativeLine);
        scnr.close();
    }


    

    

    

    

    public static MenuItem findItem(MenuItem[] array, String id)
    {
        for (MenuItem item : array) 
        {
            if (id.equalsIgnoreCase(item.GetID()))
            {
                return item;
            }
        }
        return new MenuItem("", "", 0); //return empty item so we know that this check failed entirely.
    }
}

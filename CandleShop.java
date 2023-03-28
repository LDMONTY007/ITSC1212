import java.util.*;

public class CandleShop 
{
    /* Pseudocode
     * 1. use a scanner within a loop to set variables 
     * for the name, type, price and burn time for each
     * type of candle DONE
     * 2. instantiate the candle objects using the given
     * information DONE
     * 3. have a loop that asks the user number of candles
     * they want to buy then in each iteration switch it
     * so that it's each type of candle. DONE
     * 4. calculate the total price of candles using our 
     * set values for candle prices DONE
     * 5. check for the price being in certain ranges to 
     * see if they have earned a discount and if they have
     * calculate the discount. DONE
     * 6. calculate the burn time of all the candles by 
     * getting the burn time of each individual candle 
     * and adding it to a single variable. DONE
     * 7. using our purchase price and our total burn time
     * calculate the cost per minute for the purchase
     * including discounts if they earned one. DONE
     * 8. then output a display that includes # of candles
     * of each type, their name and type, the total price
     * (before and after discount if applied), the total 
     * burn time, cost-per-minute. DONE
     * 
     */

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double total = 0.0;
        double discountTotal = 0.0;
        double costPerMin = 0.0;
        int totalBurnTime = 0;
        int rewardPoints = 0;
        //Call makeCandle so the user can make their new candles.
        Candle candle_1 = makeCandle(scnr, 1); //we automatically set the type here because the total calculations would be harder otherwise.
        Candle candle_2 = makeCandle(scnr, 2);
        Candle candle_3 = makeCandle(scnr, 3);
        int c1Count = 0;
        int c2Count = 0;
        int c3Count = 0;
        String input = new String("");
        while (!input.toLowerCase().equals("checkout")) //Don't exit unless we hit checkout.
        {
            int selection;
            System.out.println("Please enter the type of candle you want to purchase (When done enter \"checkout\") (you cannot enter 0 or a negative value)");
            if (scnr.hasNextInt()) //check that the next value is an integer to avoid errors.
            {
                selection = scnr.nextInt();
                scnr.nextLine(); //We have to do this so the \n is consumed here and nextLine doesn't consume it 
                //skipping player input.
                while (selection < 1 || selection > 3) //Make sure we select within this range
                {
                    System.out.println("Please enter a valid selection between 1-3, " + selection + " is not a valid input.");
                    while (!scnr.hasNextInt()) //Check that our input is an integer otherwise prompt for new value to avoid error.
                    {
                        System.out.println("Please enter an integer");
                        scnr.nextLine(); //Consume invalid value as string so we don't get an error.
                    }
                    selection = scnr.nextInt();
                    scnr.nextLine(); //We add this to consume the leftover \n
                }
                System.out.println("Please enter the number of candles you want to purchase (When done enter \"checkout\")");
                while (!scnr.hasNextInt()) //Check we are inputing and integer otherwise prompt new value.
                {
                    System.out.println("Please enter an integer");
                    scnr.nextLine(); //Consume invalid value as string so we don't get an error.
                }
                //check that our input is greater than zero.
                int count = scnr.nextInt();
                scnr.nextLine();
                while (count <= 0)
                {
                    System.out.println("Please enter a number greater than 0");
                    while (!scnr.hasNextInt()) //Check we are inputing and integer otherwise prompt new value.
                    {   
                        System.out.println("Please enter an integer");
                        scnr.nextLine(); //Consume invalid value as string so we don't get an error.
                    }
                    count = scnr.nextInt();
                    scnr.nextLine();
                }
                switch (selection) //Set our candle count based on input type from previous prompt.
                {
                    case 1 : c1Count = count; break;
                    case 2 : c2Count = count; break;
                    case 3 : c3Count = count; break;
                    default : System.out.println("an error occured in the switch statement");
                }
            }
            else if (scnr.hasNextLine()) //If we have a string value instead get that string value so we don't get an error.
            {
                input = scnr.nextLine();
            }
        }
        //calc total
        total = (candle_1.getCost() * c1Count) + (candle_2.getCost() * c2Count) + (candle_3.getCost() * c3Count);
        total = roundPoints(total, 2); //round to two decimal spaces.
        discountTotal = getDiscount(total); //Get our discount if we earned one.
        discountTotal = roundPoints(discountTotal, 2); //round to two decimal spaces.
        totalBurnTime = (c1Count * candle_1.getTime()) + (c2Count * candle_2.getTime()) + (c3Count * candle_3.getTime()); //Calc total burn time
        costPerMin = discountTotal / totalBurnTime;//Calculate cost per minute
        costPerMin = roundPoints(costPerMin, 2); //round to two decimal spaces.
        rewardPoints = calcRewards(c1Count + c2Count + c3Count); //calculate total rewards.
        //output
        System.out.println("Histogram of number purchased:"); //Histogram
        System.out.print(c1Count + " Type 1 (" + candle_1.getName() + ") candles : ");
        for (int i = 0; i < c1Count; i++)
        {
            System.out.print("#");
        }
        System.out.println();
        System.out.print(c2Count + " Type 2 (" + candle_2.getName() + ") candles : ");
        for (int i = 0; i < c2Count; i++)
        {
            System.out.print("@");
        }
        System.out.println();
        System.out.print(c3Count + " Type 3 (" + candle_3.getName() + ") candles : ");
        for (int i = 0; i < c3Count; i++)
        {
            System.out.print("+");
        }
        System.out.println();//I use the format method below which was learned here : https://stackoverflow.com/questions/27832131/round-off-a-double-while-maintaining-the-trailing-zero
        System.out.println(candle_1.getName() + " Price : $" + String.format("%.2f",candle_1.getCost())); //print name and cost
        System.out.println(candle_2.getName() + " Price : $" + String.format("%.2f",candle_2.getCost())); //print name and cost
        System.out.println(candle_3.getName() + " Price : $" + String.format("%.2f",candle_3.getCost())); //print name and cost
        System.out.println("Total : $" + String.format("%.2f", total));//print total cost
        System.out.println("Discount Total : $" + String.format("%.2f", discountTotal));//print discounted cost
        System.out.println("Total burn time : " + totalBurnTime + " Minutes"); //print total burn time
        System.out.println("Cost per minute : $" + String.format("%.2f", costPerMin)); //print cost per minute
        System.out.println("Rewards Points : " + rewardPoints); //Print rewards points.
        scnr.close();
    }

    /**
     * Creates a new candle via prompting the user for input
     * @param scnr the scanner to be used to check input
     * @param type the candle type
     * @return a new candle based off of the user's input values.
     */
    public static Candle makeCandle(Scanner scnr, int type)
    {
        System.out.println("What is this candle's name? " + "(Type " + type +")");
        String name = scnr.nextLine();
        //We don't do this because I realized the project instructions don't want us to.
        // System.out.println("What type of candle is this? (int)"); 
        // int type = scnr.nextInt();
        System.out.println("What is the cost of this candle? (double)");
        while(!scnr.hasNextDouble() && !scnr.hasNextInt()) //If the user doesn't input either of these data types say this message and check again.
        {
            System.out.println("Please enter a double value"); //this creates a \n which must be consumed for us to check the user's input.
            scnr.nextLine(); //Consume invalid value as string so we don't get an error.
        }
        double cost = scnr.nextDouble(); //get cost
        scnr.nextLine(); //elminate newline
        while(cost <= 0) //make sure our value is greater than zero otherwise prompt until we get value greater than zero.
        {
            System.out.println("Please enter a value greater than zero");
            while(!scnr.hasNextDouble() && !scnr.hasNextInt()) //If the user doesn't input either of these data types say this message and check again.
            {
                System.out.println("Please enter a double value"); //this creates a \n which must be consumed for us to check the user's input.
                scnr.nextLine(); //Consume invalid value as string so we don't get an error.
            }
            cost = scnr.nextDouble();
            scnr.nextLine();
        }

        System.out.println("How long does this candle burn? (int)");
        while(!scnr.hasNextInt()) //check that the user is actually inputing an integer value.
        {
            System.out.println("Please enter an integer value"); //this creates a \n which must be consumed for us to check the user's input.
            scnr.nextLine(); //Consume invalid value as string so we don't get an error.
        }
        int burnTime = scnr.nextInt();
        scnr.nextLine();
        while (burnTime <= 0)
        {
            System.out.println("Please enter a value greater than zero");
            while(!scnr.hasNextInt()) //check that the user is actually inputing an integer value.
            {
                System.out.println("Please enter an integer value"); //this creates a \n which must be consumed for us to check the user's input.
                scnr.nextLine(); //Consume invalid value as string so we don't get an error.
            }
            burnTime = scnr.nextInt();
            scnr.nextLine();
        }
        return new Candle(name, type, cost, burnTime);
    }

    /**
     * Checks if the given price qualifies for a discount
     * @param price price to check
     * @return The discounted price
     */
    public static double getDiscount(double price)
    {
        if (price > 20 && price <= 35) //Calc discount
            return calcDiscount(price, 5);
        else if (price > 35 && price <= 55)
            return calcDiscount(price, 7);
        else if (price > 55 && price <= 100)
            return calcDiscount(price, 10);
        else if (price > 100)
            return calcDiscount(price, 20);
        else 
            return price;
    }

    /**
     * Calculates a discounted value given the percent as an integer (i.e. 5% is 5)
     * @param value value that the discount is applied to
     * @param discountPercent percent discount as a whole number (1% = 1)
     * @return the discounted values
     */
    public static double calcDiscount(double value, int discountPercent)
    {
        double disc = value - (value * ((double)discountPercent / 100));
        return disc;
    }

    /**
     * calculates the rewards points based off of how many items the user has purchased.
     * @param purchaseCount total items purchased.
     * @return total reward points
     */
    public static int calcRewards(int purchaseCount)
    {
        return (purchaseCount / 10);
    }

    /**
     * Rounds a value up to the given amount of decimal points
     * @param value value to be rounded
     * @param points rounding point
     * @return value rounded at the given point.
     */
    public static double roundPoints(double value, int points)
    {
        double spaces = Math.pow(10, points); //we raise 10 to our points power because we have to make our value 1.151 become 115.1 so when we round it becomes 115
        return Math.round(value * spaces) / spaces; //multiply by a multiple of 10 to move the decimal place, round to the whole number, then divide by the same multiple of 10 to remake our original value but rounded.
    }
}

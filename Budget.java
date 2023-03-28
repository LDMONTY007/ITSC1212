import java.lang.Math;

public class Budget 
{
    public static void main(String[] args) 
    {
        double hWage = 10.0;
        
        //expenses
        double rent = 625.0;
        double internet = 27.0;
        double food = 250.0;
        double spending = 150.0;

        //totals
        double total = rent + internet + food + spending; //Our given total
        double savingsTotal = total + 100.0;

        //hours calculations
        int wHours = calcHours(total, hWage); //Call method.
        int savingsHours = calcHours(savingsTotal, hWage);
        
        //output
        System.out.println("Hourly wage : $" + hWage + "0");
        System.out.println("rent expenses : $" + rent + "0");
        System.out.println("internet expenses : $" + internet + "0");
        System.out.println("food expenses : $" + food + "0");
        System.out.println("spending expenses : $" + spending + "0" + "\n");
        //final
        System.out.println("Hours per week to reach $" + total + " per month : " + wHours);
        System.out.println("Hours per week to reach $" + total + " while saving $100 per month : " + savingsHours);
    }

    public static int calcHours(double mTotal, double wage) //Given the monthly total and hourly wage calculates hours per week required to meet quota.
    {
        return (int)(Math.ceil((mTotal / 4.0) / wage)); //Always round up because otherwise when casting we lose the decimal. 
        //Hours needs to be an int because the only fraction of hours would be minutes and we want hours not hours, fractional minutes.
    }
}


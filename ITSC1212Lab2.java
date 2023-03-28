public class ITSC1212Lab2 {
    public static void main(String[] args) {
        // int x = 0;
        // int y = 2000;
        // int z = 100000;

        // char a = 'a';
        // char b = 'b';

        // boolean boo = true;

        //System.out.println(x + y + z); //To store this you would need to use an int variable.
        // System.out.println(a);
        // System.out.println(a + b); //195 is printed because the decimal values representing our characters
        //were added together.

        // System.out.println(x < y);
        // System.out.println(y < z);
        // System.out.println(z < a);


        // >  Greater than
        // >= Greater than or equal to
        // < Less than
        // <= Less than or equal to
        // == equal to 
        // != not equal to

        //Part B

        // int ex = (int)4.0;
        // System.out.println(ex);

        // double x = 8.8;
        // double y = 2.2;

        // System.out.println(x / y);
        // System.out.println(x / (int) y);
        // System.out.println((int)x / y);
        // System.out.println((int)(x / y));

        // double cost = 10.10;
        // double paid = 12.33;
        // double change = paid - cost;
        // change = ((int)(change * 100)) / 100.0;
        // System.out.println("The change owed on this transaction is: " + change);

        //Part C

        int totalDays = 375;
        int years = totalDays / 365;
        int weeks = (totalDays % 365) / 7;
        int remainderDays = (totalDays % 365) % 7;

        System.out.println("\ntotal days = " + totalDays + "\nYears = " + years + "\nWeeks = " + weeks + "\nDays = " + remainderDays + "\n");
    }
}

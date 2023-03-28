public class TimeConversion {
    
    /**
     * Constructor
     */
    TimeConversion(){

    }


    /**
     * TO DO: showDecaseconds method
     * Given a number of seconds calculates 
     * and display decaseconds
    */
    // add your code here
    public void showDecaseconds(int s)
    {
        System.out.println("a decasecond is 10 secs");
        System.out.println("Decaseconds :" + (s / 10)); //s / 10 is our formula for decaseconds.
    }


    /**
     * TO DO: showJiffies method
     * Given a number of seconds calculates 
     * and display jiffies
    */
    // add your code here
    public void showJiffies(int s)
    {
        System.out.println("A jiffy is a unit of time used in computer operating systems. It is 10 milliseconds.");
        System.out.println("Jiffies :" + (s * 1000) / 10); //1000 milliseconds in 1 second. Then divide by 10 because one jiffy is 10 milliseconds.
    }


    /** 
     * TO DO: showNewYorkMinutes method
     * Given a number of seconds calculates 
     * and display New York minutes
    */
    // add your code here
    public void showNewYorkMinutes(int s)
    {
        System.out.println("A new york minute is the period of time between the traffic lights turning green and the cab behind you honking. It is 1/20th of 1 second.");
        System.out.println("New York Minutes :" + ((double)s * (1.0/20.0)));
    }

    /**
     * TO DO: showNanoCenturies method
     * Given a number of seconds calculates 
     * and display Nanocenturies
    */ 
    // add your code here
    public void showNanoCenturies(int s)
    {
        System.out.println("A nanocentury is a computing measurement coined from the expression -  \"never to let the user wait more than a few nanocenturies for a response\". It is 3.156 seconds.");
        System.out.println("Nanocenturies :" + (double)s / 3.156);
    }

     /**
     * TO DO: showScaramuccis method
     * Given a number of seconds calculates 
     * and display Scaramuccis
    */ 
    // add your code here
    public void showScaramuccis(int s)
    {
        System.out.println("A scaramucci is the tenure of former White House Communications Director Anthony Scaramucci. It is 11 days.");
        System.out.println("Scaramuccis :" + s / (60 * 60 * 24 * 11)); //this math is the amount of seconds in eleven days.
    }



    
}//end class
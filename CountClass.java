public class CountClass {
    private static int counter = 0;
    private boolean checkBool;

    //void = don't return, just run method
    //datatype = 

    //Having two methods that are the same name but have different paramaters are overload methods.
    public CountClass() //Constructors return a new object of this class.
    {
        checkBool = false; //Default
        counter++;
    }

    public CountClass(boolean tempBool) //This is a constructor
    {
        this.checkBool = tempBool;
        counter++;
    }

    public int getCounter() //This is a getter
    {
        return counter;
    }

    public void setCounter(int count)
    {   
        counter = count;
    }

    public boolean getCheckBool()
    {
        
        return checkBool;
    }
}

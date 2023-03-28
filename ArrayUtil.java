import javax.swing.text.StyledEditorKit.ForegroundAction;

public class ArrayUtil {
    private int[] intArray;

    public ArrayUtil() //Default Constructor
    {
        intArray = new int[0];
    }

    public ArrayUtil(int[] array) { //Parameter Constructor
        intArray = array;
    }

    public void setIntArray(int[] newArray)
    {
        intArray = newArray;
    }

    public int[] getIntArray()
    {
        return this.intArray;
    }

    /**
     * gets minimum value contained in array
     * @return Minimum value of array
     */
    public int minValue()
    {
        if (intArray.length == 0) {//empty array check
            return 0;
        }
        int tempInt = intArray[0]; //temp int for storing our current smallest value
        for (int i = 0; i < intArray.length; i++) { //loop through array
            if (tempInt > intArray[i]) //check if index at array is smaller than our temporary integer, if so set temp int to be the new smallest value.
            {
                tempInt = intArray[i];
            }
        }
        return tempInt; //return temp int
    }

    /**
     * gets minimum value contained in array
     * @param arr array to search
     * @return Minimum value of array
     */
    public int minValue(int[] arr) {
        if (arr.length == 0) {// empty array check
            return 0;
        }
        int tempInt = arr[0]; // temp int for storing our current smallest value
        for (int i = 0; i < arr.length; i++) { // loop through array
            if (tempInt > arr[i]) // check if index at array is smaller than our temporary integer, if so set temp
                                       // int to be the new smallest value.
            {
                tempInt = arr[i];
            }
        }
        return tempInt; // return temp int
    }

    /**
     * gets maximum value contained in array
     * 
     * @return Maximum value of array
     */
    public int maxValue() {
        if (intArray.length == 0) //empty array check
        {
            return 0;
        }
        int tempInt = intArray[0]; //temp int for storing largest value, by default we set it to first index of array so that we have a start value. (kind of like how newtons theorem works, where if you aren't given a value just start at x=0)
        for (int i = 0; i < intArray.length; i++) 
        {
            if (tempInt < intArray[i]) { //checks if our value is smaller than the array at the new index and if so changes it to the larger value.
                tempInt = intArray[i];
            }
        }
        return tempInt; //returns tempInt, our largest value
    }

    /**
     * gets maximum value contained in array
     * @param arr array to search
     * @return Maximum value of array
     */
    public int maxValue(int[] arr) {
        if (arr.length == 0) // empty array check
        {
            return 0;
        }
        int tempInt = arr[0]; // temp int for storing largest value, by default we set it to first index of
                                   // array so that we have a start value. (kind of like how newtons theorem works,
                                   // where if you aren't given a value just start at x=0)
        for (int i = 0; i < arr.length; i++) {
            if (tempInt < arr[i]) { // checks if our value is smaller than the array at the new index and if so
                                         // changes it to the larger value.
                tempInt = arr[i];
            }
        }
        return tempInt; // returns tempInt, our largest value
    }

    /**
     * Count of unique values in the array
     * 
     * @return Unique value count
     */
    public int countUniqueIntegers() {
        int count = 0;
        if (intArray.length == 0) //empty array check
        {
            return 0;
        }
        boolean isDuplicate = false; //bool to tell us when we have duplicates so we don't count them
        for (int i = 0; i < intArray.length; i++) { //loops through our integers
            for (int j = i + 1; j < intArray.length; j++) { //loops through the integers comparing them, skipping our current i when going through j (because we already checked every i before that so checking again would give logic errors.)
                if (intArray[i] == intArray[j])
                {
                    isDuplicate = true; //mark as duplicate
                    break;
                }
            }
            if (!isDuplicate)
            {
                count++; //if it isn't a duplicate then
            }
            isDuplicate = false; //after this i make sure we turn duplicate back to false.
        }
        return count;
    }

    public int countDuplicateIntegers() {
        int count = 0;
        if (intArray.length == 0) // empty array check
        {
            return 0;
        }
        boolean isDuplicate = false; // bool to tell us when we have duplicates so we don't count them
        for (int i = 0; i < intArray.length; i++) { // loops through our integers
            for (int j = i + 1; j < intArray.length; j++) { // loops through the integers comparing them, skipping our
                                                            // current i when going through j (because we already
                                                            // checked every i before that so checking again would give
                                                            // logic errors.)
                if (intArray[i] == intArray[j]) {
                    count++;
                    isDuplicate = true; // mark as duplicate
                    break;
                }
            }
            if (!isDuplicate) {
                //count++; // if it isn't a duplicate then
            }
            isDuplicate = false; // after this i make sure we turn duplicate back to false.
        }
        return count;
    }

    /**
     * Get the amount of times a number var appears
     * @param arr array to search
     * @param var number to search for
     * @return count of times this number appears in the array
     */
    public int getCountOf(int[] arr, int var) {
        int count = 0;
        if (arr.length == 0) // empty array check
        {
            return 0;
        }
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == var)
            {
                count++;
            }
        }
        return count;
    }
    

    /**
     * Removes duplicates from our array
     * @return a new array with all duplicate values removed.
     */
    public int[] removeDuplicates()
    {
        int count = 0; //we use this to track current index of the new array so we can set values later
        int[] tempArray = new int[countUniqueIntegers()];
        if (intArray.length == 0) // emtpy array check
        {
            return tempArray;
        }
        boolean isDuplicate = false; // bool to tell us when we have duplicates so we don't count them
        for (int i = 0; i < intArray.length; i++) { // loops through our integers
            for (int j = i + 1; j < intArray.length; j++) { // loops through the integers comparing them, skipping our
                                                            // current i when going through j (because we already
                                                            // checked every i before that so checking again would give
                                                            // logic errors.)
                if (intArray[i] == intArray[j]) {
                    isDuplicate = true; // mark as duplicate
                    break;
                }
            }
            if (!isDuplicate) {
                tempArray[count] = intArray[i]; // if it isn't a duplicate then add it to our new array
                count++; //increment index.
            }
            isDuplicate = false; // after this i make sure we turn duplicate back to false.
        }
        return tempArray;
    }

    /**
     * Get only the duplicate values of our array, became useless and is now deprecated.
     * @return array of duplicates excluding unique numbers.
     */
    public int[] getDuplicates()
    {
        int count = 0; // we use this to track current index of the new array so we can set values
                       // later
        int[] tempArray = new int[countDuplicateIntegers()];
        if (intArray.length == 0) // emtpy array check
        {
            return tempArray;
        }
        boolean isDuplicate = false; // bool to tell us when we have duplicates so we don't count them
        for (int i = 0; i < intArray.length; i++) { // loops through our integers
            for (int j = i + 1; j < intArray.length; j++) { // loops through the integers comparing them, skipping our
                                                            // current i when going through j (because we already
                                                            // checked every i before that so checking again would give
                                                            // logic errors.)
                if (intArray[i] == intArray[j]) {
                    isDuplicate = true; // mark as duplicate
                    tempArray[count] = intArray[j];
                    count++;
                    break;
                }
            }
            if (!isDuplicate) {
                // tempArray[count] = intArray[i]; // if it isn't a duplicate then add it to our new array
                // count++; // increment index.
            }
            isDuplicate = false; // after this i make sure we turn duplicate back to false.
        }
        return tempArray;
    }

    /**
     * Swaps 2 elements in an array
     * @param index1 first element to swap with second
     * @param index2 second element to swap with first
     */
    public void swapElements(int index1, int index2)
    {
        int tempInt = intArray[index2]; //save index 2's value temporarily so we can use it later.
        intArray[index2] = intArray[index1]; //Set index2 value to be that of index 1
        intArray[index1] = tempInt; //assign index1's value to be that of index 2
    }

    /**
     * Checks if the array is sorted and if it isn't sorts it
     * @param ascending true(ascending), false(descending)
     */
    public void isSorted(boolean ascending)
    {
        int count = 0;
        int[] tempArray = new int[intArray.length]; //we will add duplicates in later this is for testing.
        for (int i = 0; i < intArray.length; i++)
        {
            if (ascending == true)
            {
                int curInt = maxValue();
                for (int j = 0; j < intArray.length; j++) {
                    
                    if (intArray[j] < curInt) {//if our new value is smaller than the old one replace the old one.
                        if (contains(tempArray, intArray[j]) && !(getCountOf(intArray, intArray[j]) > 1
                                && getCountOf(tempArray, intArray[j]) < getCountOf(intArray, intArray[j])))
                        {
                            continue; //Essentially, if we have added this number and it's duplicates, don't add another one of this number, instead continue through the loop.
                        }
                        else
                        curInt = intArray[j]; //assign this new number
                    }
                }
                tempArray[count] = curInt; //assign our actual final smallest number within our restrictions.
                count++;

            }
            else if (ascending == false) {
                int curInt = minValue();
                for (int j = 0; j < intArray.length; j++) {

                    if (intArray[j] > curInt) {
                        if (contains(tempArray, intArray[j]) && !(getCountOf(intArray, intArray[j]) > 1
                                && getCountOf(tempArray, intArray[j]) < getCountOf(intArray, intArray[j]))) {
                            continue; // Essentially, if we have added this number and it's duplicates, don't add
                                      // another one of this number, instead continue through the loop.
                        } else
                            curInt = intArray[j];
                    }
                }
                tempArray[count] = curInt;
                count++;

            }
        }
        intArray = tempArray;
    }

    /**
     * Checks if an array contains the given integer.
     * @param arr Array to search
     * @param var value to look for in the array
     * @return true if our array contains the input var
     */
    public boolean contains(int[]arr, int var)
    {
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == var)
            {
                return true;
            }
        }
        return false;
    }

    //I am going to comment here but java automatically inserts a javadoc because it owns our toString method.
    public String toString()
    {
        String str = "";
        for (int i : intArray) {
            str += i + " ";
        }
        return str;
    }
}




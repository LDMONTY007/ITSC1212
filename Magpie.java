public class Magpie {
    
    /**
     * A default constuctor
     */
    public Magpie(){
    }
   
    /**
     * Get a default greeting
     */
    public String getGreeting() {
        return "Hello, let's talk.";
    }

    /**
     * Gives a response to a user statement
     */
    public String getResponse(String statement) {
        String response = "";
        String trimStatement = statement.trim();
        if (trimStatement.length() <= 0)
        {
            response = "Please say something";
        }
        else if (statement.indexOf("mom") >= 0 && statement.indexOf("cook") >= 0 && statement.indexOf("love") >= 0)
        {
            response = "I\'ll bet it\'s delicious";
        }
        else if (statement.indexOf("park") >= 0 && statement.indexOf("car") >= 0)
        {
            response = "Parking on campus is atrocious and expensive.";
        }
        else if (statement.indexOf("park") >= 0 && !(statement.indexOf("car") >= 0))
        {
            response = "I bet the trees there are lovely this time of year.";
        }
        else if (statement.indexOf("rock") >= 0 && statement.indexOf("music") >= 0)
        {
            response = "What is your favorite band?";
        }
        else if (statement.indexOf("rock") >= 0 && !(statement.indexOf("music") >= 0))
        {
            response = "I had a rock collection too!";
        }
        else if (statement.indexOf("near") >= 0 && statement.indexOf("starbucks") >= 0)
        {
            response = "The nearest Starbucks is in the Student Union 0.5 miles away";
        }
        else if (statement.indexOf("sister") >= 0 || statement.indexOf("brother") >= 0)
        {
            response = "Tell me more about your siblings";
        }
        else if (statement.indexOf("cat") >= 0 || statement.indexOf("dog") >= 0)
        {
            response = "Tell me more about your pets";
        }
        else if (statement.indexOf("mother") >= 0) {
            response = "Tell me more about your mother.";
        } 
        else if (statement.indexOf("no ") >= 0 || statement.indexOf(" no ") >= 0 ) {
            response = "Why so negative?";
        } 
        else if (statement.indexOf("robot") >= 0)
        {
            response = "That's actually pretty offensive.";
        }
        else if (statement.indexOf("bui") >= 0)
        {
            response = "He sounds like a good teacher.";
        }
        else if (statement.indexOf(",") >= 0)
        {
            response = "Wow, you have great punctuation";
        }
        else if (statement.indexOf("!") >= 0)
        {
            response = "Don't you take that tone with me user!";
        }
        else if (response.length() == 0) {
            response = getRandomResponse();
        }
        return response;
    }

    /**
     * Pick a generic response to use if nothing else fits.
     */
    private String getRandomResponse() {
        final int NUMBER_OF_RESPONSES = 6;
        double r = Math.random();
        int whichResponse = (int) (r * NUMBER_OF_RESPONSES);
        String response = "";

        if (whichResponse == 0) {
            response = "Interesting, tell me more.";
        }  
        if (whichResponse == 1) {
            response = "Hmmm.";
        } 
        if (whichResponse == 2) {
            response = "Do you really think so?";
        } 
        if (whichResponse == 3) {
            response = "You don't say.";
        }
        if (whichResponse == 4)
        {
            response = "Sorry, I was checking my messages. Say that again?";
        }
        if (whichResponse == 5)
        {
            response = "Did I ask?";
        }

        return response;
    }
}

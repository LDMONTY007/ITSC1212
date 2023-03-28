import java.awt.Color;
import java.util.Scanner;

public class ITSC1212Lab8 {
    
    static int randomX = (int)(Math.random() * 100) * 5; //This works, I tested it in another script.
    static int randomY = (int)(Math.random() * 100) * 5;
    static World w = new World(500,500);
    
    //a. Because in a for loop you have a limited amount of iterations, whereas in this loop
    //it will loop until you find the correct answers.
    //b. Because we want the loop to continue even if one of the answers is right, because if
    //it was && then the loop would break as soon as you guessed one value correct.

    public static void main(String[] args) throws InterruptedException {
        Turtle t = new Turtle(randomX, randomY, w);
        Scanner scan = new Scanner(System.in);
        boolean correctX = false;
        boolean correctY = false;
        boolean easyMode = false;
        String input = new String(" ");

        t.setVisible(false); // This doesn't work until you resize the window for some reason.
        System.out.println(t.isVisible());
        System.out.println("X : " + randomX);
        System.out.println("Y : " + randomY);
        System.out.println("Do you want to play in easy mode? (Y/N)");
        input = scan.nextLine();
        if (input.equals("Y"))
        {
            easyMode = true;
        }
        else
        {
            easyMode = false; //I know I don't necesarrily need this but I have it here so if you wanted to have a
            //restart ability.
        }
        // System.out.println("Enter a guess for the x position of turtle: ");
        int guessX = 0;
        // System.out.println("Enter a guess for the y position of turtle: ");
        int guessY = 0;
        while (!correctX || !correctY)
        {
            
            if (!correctX)
            {
                System.out.println("Enter a guess for the x position of turtle: ");
                guessX = scan.nextInt(); //Weird error is caused here when I input 1 below the x value, 1 below the y value
                                         //Followed by entering 1 above x val and 1 above y val. Sometimes it is just a difference of 
                                         //one on both values and it still causes it even though they aren't close to their numbers.
                                         //it seems to mostly occur when they are the same number.
                if (guessX == randomX || (easyMode && (Math.abs(guessX - randomX) <= 10))) //range of 20 10 in negative, 10 in positve.
                {
                    System.out.println("Guess X was Correct!");
                    correctX = true;
                }
                else if (guessX > randomX)
                {
                    System.out.println("Too high on the X");
                    colorGuessX(guessX);
                }
                else if (guessX < randomX)
                {
                    System.out.println("Too low on the X");
                    colorGuessX(guessX);
                }
                
            }
            
            
            
            if (!correctY)
            {
                System.out.println("Enter a guess for the y position of turtle: ");
                guessY = scan.nextInt();
                if (guessY == randomY || (easyMode && (Math.abs(guessX - randomX) <= 10)))
                {
                    System.out.println("Guess Y was Correct!");
                    correctY = true;
                }
                else if (guessY > randomY)
                {
                    System.out.println("Too high on the Y");
                    colorGuessY(guessY);
                }
                else if (guessY < randomY)
                {
                    System.out.println("Too low on the Y");
                    colorGuessY(guessY);
                }
                
            }
            
            


            
            
            
        }

        System.out.println("You found the turtle!");
        t.setVisible(true);
        scan.close();
    }

    public static void colorGuessY(int y) throws InterruptedException {
		// Set up a new Turtle to start drawing horizontal lines
		Thread.sleep(10);
		Turtle jen = new Turtle(w);
		jen.setVisible(false);
		jen.setPenColor(Color.BLACK);
		jen.setHeading(90);
		jen.penUp();
		jen.moveTo(0, y);
		jen.penDown();
		// Draw lines to block off areas of the World where the Turtle isn't
		if (y > randomY) {
			for (int i = 500; i > y; i--) {
				jen.moveTo(0, i);
				jen.forward(499);
			}
		} else {
			for (int i = 0; i < y; i++) {
				jen.moveTo(0, i);
				jen.forward(499);
			}
		}

	}

	public static void colorGuessX(int x) throws InterruptedException {
		// Set up a new Turtle to start drawing vertical lines
		Thread.sleep(10);
		Turtle jen = new Turtle(w);
		jen.setVisible(false);
		jen.setPenColor(Color.BLACK);
		jen.setHeading(180);
		jen.penUp();
		jen.moveTo(x, 0);
		jen.penDown();
		// Draw lines to block off areas of the World where the Turtle isn't
		if (x > randomX) {
			for (int i = 500; i > x; i--) {
				jen.moveTo(i, 0);
				jen.forward(499);
			}
		} else {
			for (int i = 0; i < x; i++) {
				jen.moveTo(i, 0);
				jen.forward(499);
			}
		}

	}

}

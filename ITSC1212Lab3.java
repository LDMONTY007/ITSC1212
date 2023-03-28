import java.awt.Color;

public class ITSC1212Lab3 
{
    public static void main(String[] args) {
        World w = new World(500, 500);
        Turtle tom = new Turtle(100, 250, w);
        //Turtle tom = new Turtle(w);
        //Part B
        tom.forward();
        //moves tom forward 100 pixels
        tom.turn(270);
        tom.penUp();
        //Turns tom so it faces left, then moves the pen up
        tom.forward(50);
        //Moves tom forward 50 pixels
        tom.turn(180);
        tom.penDown();
        tom.forward();
        //Turns tom around so he faces right, puts the pen down, and draws
        // a line 100 pixels long.

        //Draws an O that is in a 100x100 area, in the pic it obviously isn't 100x100 but 
        //the instructions say to do 100x100 per each letter.
        //Moved the pen so it is spaced correctly from the other letter.
        tom.penUp();
        tom.forward(15);
        tom.penDown();
        
        //draws a square, pretty self explanatory, just keeps turning right and going forward.
        tom.forward();
        tom.turnRight();
        tom.forward();
        tom.turnRight();
        tom.forward();
        tom.turnRight();
        tom.forward();
        tom.turnRight();

        //Draws an M
        //Moves our pen into place for proper letter spacing.
        tom.penUp(); 
        tom.forward(115);
        tom.penDown();

        //Draws the first line of the M and moves back to top of line.
        tom.turnRight();
        tom.forward();
        tom.turn(180);
        tom.forward();
        
        //Creates the actual divit in the M.
        tom.turn(135);
        tom.forward(50);
        tom.turn(-90);
        tom.forward(50);

        //Rotates to draw the second line for the m.
        tom.turn(135);
        tom.forward();
        tom.setVisible(false);

        //Part C

        // tom.setVisible(true);
        // tom.hexagon();
        // tom.setColor(Color.cyan);
        // tom.turnRight();
        // tom.hexagon();
        // tom.setColor(Color.magenta);
        // tom.turnRight();
        // tom.hexagon();
        // tom.setColor(Color.black);
        // tom.turnRight();
        // tom.hexagon();
        // tom.setVisible(false);

        //Part D

        // tom.setPenWidth(5);
        // tom.setVisible(true);
        // tom.setColor(Color.green);
        // tom.hexagon(25);
        // tom.setColor(Color.cyan);
        // tom.turnRight();
        // tom.hexagon(25);
        // tom.setColor(Color.magenta);
        // tom.turnRight();
        // tom.hexagon(25);
        // tom.setColor(Color.black);
        // tom.turnRight();
        // tom.hexagon(25);
        // tom.setVisible(false);

        // tom.setPenWidth(5);
        // tom.setVisible(true);
        // tom.setColor(Color.green);
        // tom.hexagon(75);
        // tom.setColor(Color.cyan);
        // tom.turnRight();
        // tom.hexagon(75);
        // tom.setColor(Color.magenta);
        // tom.turnRight();
        // tom.hexagon(75);
        // tom.setColor(Color.black);
        // tom.turnRight();
        // tom.hexagon(75);
        // tom.setVisible(false);

        // tom.setPenWidth(1);
        // tom.setVisible(true);
        // tom.setColor(Color.green);
        // tom.hexagon(100);
        // tom.setColor(Color.cyan);
        // tom.turnRight();
        // tom.hexagon(100);
        // tom.setColor(Color.magenta);
        // tom.turnRight();
        // tom.hexagon(100);
        // tom.setColor(Color.black);
        // tom.turnRight();
        // tom.hexagon(100);
        // tom.setVisible(false);
    }   
}

/**
 * Class that represents a turtle which is similar to a Logo turtle.
 * This class inherts from SimpleTurtle and is for students
 * to add methods to.
 *
 * Copyright Georgia Institute of Technology 2004
 * @author Barb Ericson ericson@cc.gatech.edu
 */
public class Turtle extends SimpleTurtle
{
  ////////////////// constructors ///////////////////////
  
  /** Constructor that takes the x and y and a picture to
   * draw on
   * @param x the starting x position
   * @param y the starting y position
   * @param picture the picture to draw on
   */
  public Turtle (int x, int y, Picture picture) 
  {
    // let the parent constructor handle it
    super(x,y,picture);
  }
  
  /** Constructor that takes the x and y and a model
   * display to draw it on
   * @param x the starting x position
   * @param y the starting y position
   * @param modelDisplayer the thing that displays the model
   */
  public Turtle (int x, int y, 
                 ModelDisplay modelDisplayer) 
  {
    // let the parent constructor handle it
    super(x,y,modelDisplayer);
  }
  
  /** Constructor that takes the model display
   * @param modelDisplay the thing that displays the model
   */
  public Turtle (ModelDisplay modelDisplay) 
  {
    // let the parent constructor handle it
    super(modelDisplay);
  }
  
  /**
   * Constructor that takes a picture to draw on
   * @param p the picture to draw on
   */
  public Turtle (Picture p)
  {
    // let the parent constructor handle it
    super(p);
  }  
  
  /////////////////// methods ///////////////////////
  
  public void hexagon() { //Draws a hexagon.

    this.forward(50);
    this.turn(60);
    this.forward(50);
    this.turn(60);
    this.forward(50);
    this.turn(60);
    this.forward(50);
    this.turn(60);
    this.forward(50);
    this.turn(60);
    this.forward(50);
    this.turn(60);

  }

  public void hexagon(int sideLength) { //Draws a hexagon of the given side Length.

    this.forward(sideLength);
    this.turn(60);
    this.forward(sideLength);
    this.turn(60);
    this.forward(sideLength);
    this.turn(60);
    this.forward(sideLength);
    this.turn(60);
    this.forward(sideLength);
    this.turn(60);
    this.forward(sideLength);
    this.turn(60);

  }

  public void drawPolygon(int sides, int sideLength) //Draws a polygon restricted to a square of size sideLength.
  {
    if (sides != 4)
    {
      System.out.println(sides);
      this.penUp();
      this.setHeading(0);
      this.backward((sideLength - ((int)((sideLength*Math.sin(Math.PI / (double)(sides)))))) / 2);
      this.setHeading(90);
      this.forward(this.getPenWidth());
      this.setHeading(0);
      this.penDown();
    }
    for (int i = 0; i < sides; i++) {
      this.turn(360 / sides);
      double angle = Math.toRadians(360 / sides);
      //this.moveTo(sides*(int)Math.cos((Math.PI/3) * i), sides*(int)Math.sin((Math.PI/3) * i));
      //this.moveTo(this.getXPos() + (sideLength*(int)Math.cos(angle + Math.PI/3 * i)), this.getYPos() + (sideLength*(int)Math.sin(angle + Math.PI/3 * i)));
      //this.forward((int)this.getDistance(this.getXPos() + (sideLength*(int)Math.cos(angle + Math.PI/3 * (i+1))), this.getYPos() + (sideLength*(int)Math.sin(angle + Math.PI/3 * (i+1)))));
      if (sides != 4)
      {
        this.forward((int)((sideLength*Math.sin(Math.PI / (double)(sides)))));
      }
      else
      {
        this.forward(sideLength);
      }
      //this.forward((sideLength * 4) / sides);
      //this.forward((sideLength * 4) / sides);
    }
    if (sides != 4)
    {
      this.penUp();
      this.setHeading(0);
      this.forward((sideLength - ((int)((sideLength*Math.sin(Math.PI / (double)(sides)))))) / 2);
      this.setHeading(90);
      this.backward(this.getPenWidth());
      this.setHeading(0);
      this.penDown();
    }
  }

  public static void main(String[] args)
  {
    World earth = new World();
    Turtle t1 = new Turtle(earth);
    t1.forward();
  }
  
   

} // this } is the end of class Turtle, put all new methods before this
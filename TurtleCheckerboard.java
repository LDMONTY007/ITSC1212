public class TurtleCheckerboard {
    public static void main(String[] args) {
        World w = new World(500,500);
        Turtle tom = new Turtle(w);
        tom.penUp();
        tom.moveTo(50,50);
        tom.setHeading(0);
        tom.penDown();

        
    }
}

import java.util.Random;
import java.awt.Color;

public class ITSC1212Lab9 {
    public static void main(String[] args) {
        //#region part A
        char symbol = '%';
        int checkerCount = 4;
        for (int row = 0; row < 4; row++)
        {
            for (int col = 0; col < 4; col++)
            {
                //If row is even and column is odd then change symbol or if row is odd and
                //column is even switch symbol, gives us checker effect.
                if ((row % 2 == 0 && col % 2 != 0) || (row % 2 != 0 && col % 2 == 0)) 
                {
                    symbol = '#';
                }
                else 
                symbol = '%';

                for (int c = checkerCount; c > 0; c--)
                {
                    System.out.print(symbol); //use print as to not create a new line.
                }
                System.out.print(" ");
            }
            System.out.println(""); //New line
        }
        //#endregion

        //#region part B
        // World w = new World(500,500);
        // Turtle tom = new Turtle(w);
        // tom.penUp();
        // tom.moveTo(50,50);
        // tom.setHeading(0);
        // tom.penDown();
        // for (int y = 0; y < 4; y++)
        // {
        //     for (int x = 0; x < 4; x++)
        //     {
        //         tom.penUp();
        //         tom.moveTo((100 * x) + 50, (100 * y) + 50); //Just multiply by our loop variables to get coordinates.
        //         tom.penDown();
        //         tom.drawPolygon(4, 75); //The lab gives us size 75.
        //     }   
            
        // }
        // tom.setVisible(false);
        //#endregion
        //#region part C
        // char symbol = '%';
        // int checkerCount = 2; //I already had this so I kept the name. This is what controls # of symbols in pattern.
        // int numRows = 9;
        // int numCols = 9;
        // for (int row = 0; row < numRows; row++)
        // {
        //     for (int col = 0; col < numCols; col++)
        //     {
        //         //If row is even and column is odd then change symbol or if row is odd and
        //         //column is even switch symbol, gives us checker effect.
        //         if ((row % 2 == 0 && col % 2 != 0) || (row % 2 != 0 && col % 2 == 0)) 
        //         {
        //             symbol = '#';
        //         }
        //         else 
        //         symbol = '%';

        //         for (int c = checkerCount; c > 0; c--)
        //         {
        //             System.out.print(symbol); //use print as to not create a new line.
        //         }
        //         System.out.print(" ");
        //     }
        //     System.out.println(""); //New line
        // }


        //#endregion

        //#region part D
        World q = new World(500,500);
        Turtle tom = new Turtle(q);
        tom.setHeading(0);
        tom.setPenWidth(5);
        for (int y = 0; y < 4; y++)
        {
            for (int x = 0; x < 4; x++)
            {
                tom.setPenColor(randColor());
                tom.penUp();
                tom.moveTo((100 * x) + 50, (100 * y) + 50); //Just multiply by our loop variables to get coordinates.
                tom.penDown();
                tom.drawPolygon(8, 75); //The lab gives us size 75.
                // tom.setColor(Color.red);
                // tom.drawPolygon(4, 75);
            }   
            
        }
        tom.setVisible(false);
        //#endregion
    }

    private static Color randColor()
    {
        Random rand = new Random();
        int r = rand.nextInt(0, 255);
        int g = rand.nextInt(0, 255);
        int b = rand.nextInt(0, 255);
        Color color = new Color(r, g, b);
        return color;
    }
}



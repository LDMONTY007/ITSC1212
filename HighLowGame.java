import java.util.Scanner;

public class HighLowGame {
    public static void main(String[] args) {
        Deck deck = new Deck();
        Scanner scnr = new Scanner(System.in);
        boolean exit = false;
        int wins = 0;
        int losses = 0;

        while (exit == false)
        {
            Card card1 = deck.drawCard();
            System.out.println("The first card is " + card1.declareCard());
            System.out.println("Will the next card be higher or lower?");
            System.out.print("Enter 1 for lower, 2 for higher: ");
            int choice = scnr.nextInt();

            Card card2 = deck.drawCard();
            System.out.println("The next card is the " + card2.declareCard());

            boolean higher = card2.getValue() > card1.getValue();
            if (card1.getValue() == card2.getValue())
            {
                System.out.println("Card Values were the same, no winner or loser this round.");
            }
            else if ((higher && choice == 2) || (!higher && choice == 1))
            {
                System.out.println("Winner!");
                wins++;
            }
            else
            {
                System.out.println("Sorry, your guess was incorrect :(");
                losses++;
            }

            System.out.println("Do you want to keep playing? (y/n)");
            scnr.nextLine(); //Consumes hidden /n
            String input = scnr.nextLine();
            if (input.toLowerCase().equals("n"))
            {
                exit = true;
            }

        }

        System.out.println("Wins : " + wins);
        System.out.println("Losses : " + losses);
        
        scnr.close();
    }
}

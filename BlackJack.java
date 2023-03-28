import java.util.Scanner;

public class BlackJack {
    public static void main(String[] args) throws InterruptedException {
        Deck deck = new Deck();
        Scanner scnr = new Scanner(System.in);

        int winCount = 0;
        int lossCount = 0;
        int tieCount = 0;
        
        boolean sentinel = false;

        while (!sentinel) {
            int houseTotal = deck.drawCard().getValue(true) + deck.drawCard().getValue(true);
            int playerTotal = deck.drawCard().getValue(true) + deck.drawCard().getValue(true);

            System.out.println("Would you like to play blackjack? (1=yes, 0=no)");
            int input = scnr.nextInt();
            scnr.nextLine();
            if (input == 0)
            {
                sentinel = true;
                break;
            }
            
            Thread.sleep(500);
            System.out.println("\nThe House is showing: " + houseTotal);
            
            while (playerTotal <= 21) {
                System.out.println("The Player is showing: " + playerTotal);
                Thread.sleep(500);
                System.out.print("Would you like to hit or stand?\n\tEnter 1 for hit 0 for stand:");

                int choice = 0;
                while (!scnr.hasNextInt()) {
                    System.out.println("Please enter an integer");
                    scnr.nextLine();
                }
                choice = scnr.nextInt();
                scnr.nextLine();
                // System.out.println("");
                if (choice == 0) {
                    break;
                } else if (choice == 1) {
                    Card nextCard = deck.drawCard();
                    Thread.sleep(500);
                    System.out.println("\nPlayer draws " + nextCard.declareCard());
                    playerTotal += nextCard.getValue(true);
                } else {
                    System.out.println("Invalid option, try again.");
                }
            }

            if (playerTotal > 21) {
                Thread.sleep(500);
                System.out.println("Game Results!");
                Thread.sleep(500);
                System.out.print("The Player busted. ");
                Thread.sleep(500);
                System.out.println("The House wins!");
                lossCount++;
            } 
            else 
            {
                Thread.sleep(500);
                System.out.println("\nThe Player stands with " + playerTotal + " points.");
                Thread.sleep(500);
                System.out.println("The House will play next.");

                while (houseTotal <= 21) {
                    Thread.sleep(500);
                    System.out.println("");
                    Thread.sleep(500);
                    System.out.println("The house is showing: " + houseTotal);
                    Card nextCard = deck.drawCard();
                    Thread.sleep(500);
                    System.out.println("House draws " + nextCard.declareCard());
                    houseTotal += nextCard.getValue(true);
                    Thread.sleep(500);
                    System.out.println("The house is showing: " + houseTotal);
                    if (houseTotal < 17) {
                        // System.out.println("The house is showing: " + houseTotal);
                        // House hits
                    } else if (houseTotal > 17 && houseTotal <= 21) {
                        // System.out.println("The House stands with " + houseTotal + " points");
                        // House stands
                        Thread.sleep(500);
                        System.out.println("");
                        break;
                    }
                    System.out.println("");
                }

                if (houseTotal > 21) {
                    Thread.sleep(500);
                    System.out.println("Game Results!");
                    Thread.sleep(500);
                    System.out.print("The House has busted. ");
                    Thread.sleep(500);
                    System.out.println("The Player Wins.");
                    winCount++;
                } else if (houseTotal > playerTotal) {
                    Thread.sleep(500);
                    System.out.println("Game Results!");
                    Thread.sleep(500);
                    System.out.print("The House is closer to 21. ");
                    Thread.sleep(500);
                    System.out.println("The House wins.");
                    lossCount++;
                } else if (houseTotal < playerTotal) {
                    Thread.sleep(500);
                    System.out.println("Game Results!");
                    Thread.sleep(500);
                    System.out.print("The Player is closer to 21. ");
                    Thread.sleep(500);
                    System.out.println("The Player wins.");
                    winCount++;
                } 
                else if (houseTotal == playerTotal) 
                {
                    Thread.sleep(500);
                    System.out.println("The score is equal. There is a tie.");
                    tieCount++;
                }
            }

        }

        System.out.println("Wins : " + winCount);
        System.out.println("Losses : " + lossCount);
        System.out.println("Ties : " + tieCount);

        scnr.close();
    }
}

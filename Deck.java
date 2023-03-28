public class Deck {
    

    public Card drawCard()
    {
        //Fill in the contents of this method
        int value = (int)(Math.random() * 13) + 1;
        int s = (int)(Math.random() * 4) + 1;
        //System.out.println(value);
        //System.out.println(s);
        String suit = null;
        switch (s)
        {
            case 1:
                suit = "Spades";
                break;
            case 2:
                suit = "Clubs";
                break;
            case 3: 
                suit = "Hearts";
                break;
            case 4: 
                suit = "Diamonds";
                break;
        }
        //System.out.println(suit);
        return new Card(value, suit);
    }
}

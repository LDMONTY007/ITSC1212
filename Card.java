public class Card {
    private int value;
    private String suit;
    public Card(int value, String suit)
    {
        this.value = value;
        this.suit = suit;
    }

    public int getValue(boolean isBlackJack)
    {
        if (!isBlackJack)
        {
            return value;
        }
        else
        {
            if (value == 1)
            {
                return 11;
            }
            else
            {
                if (value > 10)
                {
                    return 10;
                }
                else
                {
                    return value;
                }
            }
            
        }
    }

    public String getSuit()
    {
        return this.suit;
    }

    public String declareCard()
    {
        String result = null;
        switch(this.value)
        {
            case 11:
                result = "the Jack of " + this.suit;
                break;
            case 12:
                result = "the Queen of " + this.suit;
                break;
            case 13:
                result = "the King of " + this.suit;
                break;
            case 14:
                result = "the Ace of " + this.suit;
                break;
            default:
                result = "the " + this.value + " of " + this.suit;
        }
        return result;
    }
}

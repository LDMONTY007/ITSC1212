public class MenuItem {
    private String id;
    private String name;
    private double price;

    public MenuItem(String id, String name, double price)
    {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String GetID()
    {
        return this.id;
    }

    public String GetName()
    {
        return this.name;
    }

    public double GetPrice()
    {
        return this.price;
    }

    public void SetID(String id)
    {
        this.id = id;
    }

    public void SetName(String name)
    {
        this.name = name;
    }

    public void SetPrice(double price)
    {
        this.price = price;
    }

    public String toString()
    {
        return "Item ID: " + this.id + " >> " + this.name + " >> $" + this.price;
    }
}

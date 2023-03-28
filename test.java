public class test
{
    public static void main(String[] args) throws InterruptedException {
        //System.out.println(withoutString("MkjtMkx", "Mk"));
        //System.out.println(EqualIsNot("something isn't not right is it?"));
        //System.out.println(countTriple("222abyyycdXXX"));
        // CountClass count1 = new CountClass(true); //count1.count = 1
        // CountClass count2 = new CountClass(); //count2.count = 2
        // System.out.println("Count 1 : " + count1.getCounter());
        // System.out.println("Count 2 : " + count2.getCounter());
        // count1.setCounter(5);
        // System.out.println("Count 1 : " + count1.getCounter());
        // System.out.println("Count 2 : " + count2.getCounter());
        // CountClass count3 = new CountClass(true);
        //Class,   ObjectName   (keyword)
        // CountClass countObject1 = new CountClass(true);
        // System.out.println(LDUtil.CalcDiscount(60.0, 15));
        // MenuItem[] menu = {
        // new MenuItem("A1", "Large Drink", 1.95), 
        // null, 
        // new MenuItem("A3", "A Pint", 3.95),
        // null,
        // new MenuItem("A5", "Pasta (only noodle, and only rigatoni, no sauce, no butter)", 5.95),
        // null,
        // new MenuItem("A7", "Deepest Dish Pizza (4x as much Marinara)", 19.95),
        // new MenuItem("A8", "Actual Garbage", 0.95),
        // null,
        // new MenuItem("A10", "Steak", 14.95),
        // new MenuItem("A5", "Pasta (only noodle, and only rigatoni, no sauce, no butter)", 5.95),
        // null,
        // new MenuItem("A7", "Deepest Dish Pizza (4x as much Marinara)", 19.95),
        // new MenuItem("A8", "Actual Garbage", 0.95),
        // null,
        // new MenuItem("A10", "Steak", 14.95)
        // };
        // for (MenuItem menuItem : menu) { //Print out all the items in order
        //     System.out.println(menuItem);
        // }
        // menu = LDUtil.consolidate(menu); //Sort so that all null values are at the end.
        // Thread.sleep(700);
        // System.out.println("SORTED:");
        // for (MenuItem menuItem : menu) { // Print out all the items in order
        //     System.out.println(menuItem);
        // }
        int[] a = {1, 2, 1, 2};
        int[] b = {1, 2, 2};
        System.out.println(has22(a));
        System.out.println(has22(b));
    }    

    public static void print(String s)
    {
        System.out.println(s);
    }


    public static boolean has22(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (i + 1 != nums.length) {
                if (nums[i] == 2 && nums[i + 1] == 2) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String WithoutString(String base, String remove) {
        String out = base;
        while (out.toLowerCase().indexOf(remove.toLowerCase()) != -1)
        {
            out = out.replace(" " + remove + " ", "  ");
            out = out.replace(" " + remove.toUpperCase() + " ", "  ");
            out = out.replace(" " + remove.toLowerCase() + " ", "  ");
            out = out.replace(remove + " ", " ");
            out = out.replace(remove.toUpperCase() + " ", " ");
            out = out.replace(remove.toLowerCase() + " ", " ");
            out = out.replace(" " + remove.toUpperCase(), " ");
            out = out.replace(" " + remove.toLowerCase(), " ");
            out = out.replace(remove, "");
            out = out.replace(remove.toUpperCase(), "");
            out = out.replace(remove.toLowerCase(), "");
        }
        return out;
    }

    public static Boolean EqualIsNot(String str)
    {
        String out = str;
        int isCount = 0;
        int notCount = 0;
        while (out.indexOf("is") != -1 || out.indexOf("not") != -1)
        {
            if (out.indexOf("is") != -1 )
            {
                out = out.replaceFirst("is", "");
                System.out.println(out);
                isCount++;
            }
            if (out.indexOf("not") != -1 )
            {
                out = out.replaceFirst("not", "");
                System.out.println(out);
                notCount++;
            }
        }
        if (isCount == notCount)
        {
            return true;
        }
        else
            return false;
    }

    public static int CountTriple(String str) {
        char current = '`';
        int count = 0;
        int triples = 0;
        for (char i : str.toCharArray())
        {
            if (current == i)
            {
                count++;
                if (count == 3)
                {
                    triples++;
                }
                if (count > 3)
                {
                    triples++;
                }
            }
            else if (current != i)
            {
                current = i;
                count = 1;
            }
            System.out.println(current + ":" + i + ":" + count + ":" + triples);
            
        }

        
        return triples;
    }
}
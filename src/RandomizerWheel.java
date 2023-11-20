
public class RandomizerWheel {
String[] size = {"Large", "Medium", "Small"};
String[] roast = {"Light","Medium","Dark"};
String[] syrup = {"Chocolate", "Vanilla", "Caramel"};
String[] temp = {"Iced", "Warm", "Hot"};


String Size = "";
String Roast = "";
String Syrup = "";
String Tmep = "";


    public static void printLn(String txt)
    {
        System.out.println(txt);
    }

    public static boolean Syrup()
    {
        int rnd = (int)(Math.random()*2);
        if(rnd <= 1)
        {
            return true;
        }
        return false;
    }

    public static boolean Honey()
    {
        int rnd = (int)(Math.random()*2);
        if(rnd <= 1)
        {
            return true;
        }
        return false;
    }


    public  void randomizer(String whatTo)
    {
        if(whatTo.equals("size"))
        {
            int random = (int)(Math.random()*3);
            if(random == 1)
            {

            }
            else if(random == 2)
            {

            }
            else
            {

            }


        }

    }













}

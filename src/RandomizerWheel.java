
public class RandomizerWheel {
String[] size = {"Large", "Medium", "Small"};
String[] roast = {"Light","Medium","Dark"};
String[] syrup = {"Chocolate", "Vanilla", "Caramel"};
String[] temp = {"Iced", "Warm", "Hot"};


String Size = "";
String Roast = "";
String Syrup = "";
String Temp = "";


boolean s = false;
boolean r = false;
boolean sy = false;
boolean t = false;



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
                Size = size[random];
                printLn(Size);
            }
            else if(random == 2)
            {
                Size = size[random];
                printLn(Size);
            }
            else
            {
                Size = size[random];
                printLn(Size);
            }
            s = true;
        }

        else if(whatTo.equals("roast"))
        {
            int random = (int)(Math.random()*3);
            if(random == 1)
            {
                Roast = roast[random];
                printLn(Roast);
            }
            else if(random == 2)
            {
                Roast = roast[random];
                printLn(Roast);
            }
            else
            {
                Roast = roast[random];
                printLn(Roast);
            }
            r = true;
        }





    }













}

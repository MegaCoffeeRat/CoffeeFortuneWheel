
public class RandomizerWheel {
String[] size = {"Large", "Medium", "Small"};
String[] roast = {"Light","Medium","Dark"};
String[] syrup = {"Chocolate", "Vanilla", "Caramel"};
String[] temp = {"Iced", "Warm", "Hot"};


String Size = "";
String Roast = "";
String Syrup = "";
String Temp = "";

int NumOptions = 4;


boolean s = false;
boolean r = false;
boolean sy = false;
boolean t = false;


    public static void printLn(String txt)
    {
        System.out.println(txt);
    }

    public  void randomizer(int whatTo)
    {
        if(whatTo == (0))
        {
            int random = (int)(Math.random()*3);
            if(random == 1)
            {
                Size = size[random];
                printLn("Cup Size: " + Size);
            }
            else if(random == 2)
            {
                Size = size[random];
                printLn("Cup Size: " + Size);
            }
            else
            {
                Size = size[random];
                printLn("Cup Size: " + Size);
            }
            s = true;

        }
        else if(whatTo == (1))
        {
            int random = (int)(Math.random()*3);
            if(random == 1)
            {
                Roast = roast[random];
                printLn("Your Coffee Roast: " + Roast);
            }
            else if(random == 2)
            {
                Roast = roast[random];
                printLn("Your Coffee Roast: " + Roast);
            }
            else
            {
                Roast = roast[random];
                printLn("Your Coffee Roast: " + Roast);
            }
            r = true;

        }
        else if(whatTo == (2))
        {
            int random = (int)(Math.random()*3);
            if(random == 1)
            {
                Syrup = syrup[random];
                printLn("Your Flavoring will be: " + Syrup);
            }
            else if(random == 2)
            {
                Syrup = syrup[random];
                printLn("Your Flavoring will be: " + Syrup);

            }
            else
            {
                Syrup = syrup[random];
                printLn("Your Flavoring will be: " + Syrup);

            }
            sy = true;

        }
        else if(whatTo == (3))
        {
            int random = (int)(Math.random()*3);
            if(random == 1)
            {
                Temp = temp[random];
                printLn("Your Coffee's Temp will be: "+Temp);
            }
            else if(random == 2)
            {
                Temp = temp[random];
                printLn("Your Coffee's Temp will be: "+Temp);
            }
            else
            {
                Temp = temp[random];
                printLn("Your Coffee's Temp will be: "+Temp);
            }
            t = true;

        }
    }













}

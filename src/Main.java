class Main {

    public static void printLn(String txt)
    {
        System.out.println(txt);
    }

    public static void main(String[] args)
    {
        RandomizerWheel rdz = new RandomizerWheel();
        String whatTo = ""; whatTo = "size";

        printLn("> Time to Generate You a Coffee! ");
        rdz.randomizer(whatTo);
        if(rdz.s)
        {
            whatTo = "roast";
        }
        else if(rdz.r)
        {
            whatTo = "syrup";
        }
        else if(rdz.sy)
        {
            whatTo = "temp";
        }


        rdz.randomizer(whatTo);



        }

    }


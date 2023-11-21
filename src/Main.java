class Main {
    public static void printLn(String txt)
    {
        System.out.println(txt);
    }
    public static void main(String[] args) throws InterruptedException {
        RandomizerWheel rdz = new RandomizerWheel();
        String whatTo = "";
        printLn("> Time to Generate You a Coffee! ");
        for (int i = 0; i < rdz.NumOptions; i++) {
            rdz.randomizer(i);
            Thread.sleep(2000);
        }
    }
}


class MultithreadingUserClass implements Runnable {
    public void run()
    {
        String output = "";
        for(int i=0; i<10; i++)
            output += "Hello World\n";

        System.out.print(output);
    }
}
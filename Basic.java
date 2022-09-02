public class Basic {
    public static void main(String args[]) {

        final long startTime = System.currentTimeMillis();
        
        
        
        for(int i=0; i<10000; i++)
            System.out.println("Hello world!");

        final long endTime = System.currentTimeMillis();
        System.out.println("Total execution time: " + (endTime - startTime));
    }


}
// Main Class
public class Multithread {
    public static void main(String[] args) {

        final long startTime = System.currentTimeMillis();

        for (int i = 0; i < 1000; i++) { 
            MultithreadingUserClass object = new MultithreadingUserClass();
            object.run();
        }


        final long endTime = System.currentTimeMillis();
        System.out.println("Total execution time: " + (endTime - startTime));
    }
}
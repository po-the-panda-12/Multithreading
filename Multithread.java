public class Multithread {
    public static void main(String[] args) {

        //main parameters
        int n_simulation = 20; //number of times to run simulation
        int n_runs = 1000; //number of times to print line (10000/10)

        //timing variables
        long startTime;
        long endTime;
        long sum = 0;

        for(int k=0; k<n_simulation; k++) {

            startTime = System.currentTimeMillis();

            for (int i = 0; i < n_runs; i++) { 
                MultithreadingUserClass object = new MultithreadingUserClass();
                object.run();
            }

            endTime = System.currentTimeMillis();
            sum += endTime-startTime;

        }

        //clear screen
        System.out.print("\033[H\033[2J");  
        System.out.flush();

        //average of simulation 
        System.out.println(sum/n_simulation);

        
    }
}
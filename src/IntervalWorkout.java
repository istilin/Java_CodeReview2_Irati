public class IntervalWorkout {
    Exercise exercise1;
    Exercise exercise2;
    Exercise exercise3;
    int numRep;
    int breakTime;

    // Creates constructor
    public IntervalWorkout(Exercise exercise1, Exercise exercise2, Exercise exercise3, int numRep, int breakTime){
        this.exercise1 = exercise1;
        this.exercise2 = exercise2;
        this.exercise3 = exercise3;
        this.numRep = numRep;
        this.breakTime =  breakTime;
    }

    // Creates printing method
    public void printIntervalWorkout(){
        System.out.println("*****************************");
        System.out.println("Interval Workout STARTS !!!!!");
        System.out.println("*****************************");
        System.out.println("=============================");

        // Iterates as many times as there are repetitions
        for ( int i = 1; i <= this.numRep; i++){
            System.out.println("ROUND " + i + ":");
            System.out.println(this.exercise1.name);
            System.out.println(this.exercise2.name);
            System.out.println(this.exercise3.name);

            // Prints the break after each exercises round except for the last one
            if (i != this.numRep){
                System.out.println("=============================");
                System.out.println("DO THE BREAK (" + this.breakTime + " SECONDS)");
                System.out.println("=============================");
            }

            // Prints the end message after the last round
            else {
                System.out.println(" ");
                System.out.println(" ");
                System.out.println("*****************************");
                System.out.println(" CONGRATS - YOU ARE DONE !!! ");
                System.out.println("*****************************");
                System.out.println(" ");
            }
        }
    }
}
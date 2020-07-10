public class Exercise {
    String name;
    String description;
    int duration;
    boolean position_floor;

    // Creates constructor
    public Exercise(String name, String description, int duration, boolean position_floor){
        this.name = name;
        this.description = description;
        this.duration = duration;
        this.position_floor = position_floor;
    }

    // Creates printing method
    public void printExercise(){

        // Calculates the length of the exercise name
        int nameLength = this.name.length();

        // Calculates number of spaces needed to put the duration message to the right
        int spaces = 40 - nameLength;
        System.out.print(this.name);

        // Print spaces between the name of the exercise and the duration
        for (int i = 0; i < spaces; i++){
            System.out.print(" ");
        }
        System.out.println("DURATION: " + this.duration + " seconds.");
        System.out.println("-------------------------------------------------------------");
        System.out.println("DESCRIPTION: " + this.description);
        System.out.println(" ");
    }
}
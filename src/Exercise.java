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

        // Stores duration text in a variable
        String dur = "DURATION: " + this.duration + " seconds.";

        // Prints first line on the correct format
        System.out.printf("%-39s %1s %n", this.name, dur);
        // Print spaces between the name of the exercise and the duration
        System.out.println("-------------------------------------------------------------");

        // For printing description in different lines:
        String desc = "DESCRIPTION: " + this.description;
        int numLines = desc.length()/61 + 1;
        String[] descArray = desc.split(" ");
        int lineLength = 0;
        int numWords  = descArray.length;
        int word = 0;
        while (word < numWords) {
            while (lineLength < 49) {
                if (word < numWords) {
                    System.out.print(descArray[word]);
                    System.out.print(" ");
                    lineLength += descArray[word].length() + 1;
                    word++;
                }
                else{
                    break;
                }
            }
            System.out.print("\n");
            lineLength = 0;
        }
        System.out.println(" ");
    }
}
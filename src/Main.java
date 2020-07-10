import java.util.*;

public class Main {

    public static void main(String[] args) {
        // Creates Exercise instances
        Exercise pushUps = new Exercise("Push-ups", "Place your hands on the floor. Raise up onto your toes so that all of your body weight is on your hands and your feet. Bend your elbows and lower your chest down toward the floor. Then, push off the floor and extend them so that you return to starting position.", 30, true);
        Exercise planks = new Exercise("Planks", "Start on the floor on your hands and knees. Lower your forearms to the floor with elbows positioned under your shoulders and your hands shoulder-width apart. Maintain a straight line from heels through the top of your head, looking down at the floor. Now, tighten your abs and hold.", 90, true);
        Exercise squats = new Exercise("Squats", "Stand with feet a little wider than shoulder-width apart, hips stacked over knees, and knees over ankles. Extend arms out straight so they are parallel with the ground, palms facing down.  Goto a squat and exhale, then explode back up to standing, driving through heels.", 45, false);
         Exercise backwardKick = new Exercise("Backward Kick", "Get in an all-fours position with your knees and hands on the floor. Your back is straight. Lift your leg up, and straighten it. Form a 90 degree angle in the ankle.  Raise your leg with your heel pushing up and constantly forming a 90 degree angle in between the legs. Return to the starting position and repeat.", 60, true);
        Exercise legCurl = new Exercise("Leg Curl", "Stand up on, shift your weight to  one feet and pull another heel toward your buttocks. Stay for 15 seconds, then repeat with your other leg.", 90, false);
        Exercise sidewardsBackStretch = new Exercise("Sidewards Back Stretch", " Go into standing position, put your hands on your hips and then stretch with one hand over your head to the opposite side. Repeat with other hand.", 60, false);

        // Creates array and adds exercises
        ArrayList <Exercise> exercises = new ArrayList <> ();
        exercises.add(pushUps);
        exercises.add(planks);
        exercises.add(squats);
        exercises.add(backwardKick);
        exercises.add(legCurl);
        exercises.add(sidewardsBackStretch);

        // Creates IntervalWorkout instance
        IntervalWorkout interval = new IntervalWorkout(squats, backwardKick, legCurl, 4, 40);

        // Uncomment!!!
        // Prints all exercises with the print method
        for( Exercise exercise : exercises){
            exercise.printExercise();
        }

        // Uncomment!!!
        // Prints only floor exercises with the print method
        /*for( Exercise exercise : exercises){
            if(exercise.position_floor){
                exercise.printExercise();
            }
        }*/

        // Uncomment!!!
        // Prints only floor exercise with duration longer than one minute with the print method
        /*for( Exercise exercise : exercises){
            double minutes = exercise.duration/60.0;
            if(exercise.position_floor && minutes > 1){
                exercise.printExercise();
            }
        }*/

        // Uncomment!
        // prints the interval workout with the print method
        /*interval.printIntervalWorkout();*/
    }
}
package ui;

import java.util.Scanner;

import model.Song;
import model.SongsLearned;
import model.SongsLearning;
import model.SongsToLearn;

public class SongTrackerApp {
    private Song song;
    private SongsToLearn songsToLearn;
    private SongsLearning songsLearning;
    private SongsLearned songsLearned;
    private Scanner input;

    // EFFECTS: starts runSongTracker()
    public SongTrackerApp(){
        runSongTracker();
    }

    // EFFECTS: sets going to true, lets us know to keep program running.
    // sets command to null, initialized our starting classes to all be empty,
    // creates a loop that runs showDisplay() and ends when command.equals("q")
    //
    private void runSongTracker(){
        boolean going = true;
        String command = null;

        initialize();
       
        while(going){
            showDisplay();
            command = input.next();
            command = command.toLowerCase();

        if(command.equals("q")){
            going = false;
        } else {
            processCommand(command);
        }

        }
    }

    // REQUIRES: 
    // EFFECTS: Processes command for each specific input string
    // and then passes it on to corresponding method
    private void processCommand(String command){
        if(command.equals("a")){
            viewSongsToLearn();
        } else if (command.equals("b")){
            viewSongsLearning();
        } else if (command.equals("c")){
            viewSongsLearned();
        } else {
            System.out.println("Invalid Choice");
        }
    }

    // EFFECTS: Prints all of the songs in SongsToLearn
    // and gives user option to add or remove song 
    private void viewSongsToLearn() {
        // TODO STUB
    }

    // EFFECTS: Prints all of the songs in SongsLearning
    // and gives user option to add or remove song 
    private void viewSongsLearning() {
        // TODO STUB
    }

    // EFFECTS: Prints all of the songs in SongsLearned
    // and gives user option to add or remove song 
    private void viewSongsLearned() {
        // TODO STUB
    }

    // EFFECTS: Prints the display options for the menu of the application
    private void showDisplay(){
        System.out.println("\nChoose an Option");
        System.out.println("\ta -> view songs to learn");
        System.out.println("\tb -> view songs learning");
        System.out.println("\tc -> view songs learned");
        System.out.println("\tq -> quit");
    }

    // EFFECTS: Initialized all of our lists to start and be empty
    private void initialize(){
        songsToLearn = new SongsToLearn();
        songsLearning = new SongsLearning();
        songsLearned = new SongsLearned();
    }

}

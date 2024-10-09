package model;

// Represents a song that has title, instrument, learned, favourite.
public class Song {
    private String title; // title of song
    private String artist; // artist of song
    private String instrument; // instrument of song to learn
    private Boolean learned; // is song learned or not?
    private Boolean favourite; // is song favourited?
    
    /*
     * REQUIRES: title has non-zero length, artist has non-zero length,
     * instrument has non-zero length,
     * EFFECTS: title of song set to title, artist of song set to artist,
     * instrument of song set to instrument, learned initially set to false,
     * favourite initially set to false
     */
    public Song(String title, String artist, String instrument){
        this.title = title;
        this.artist = artist;
        this.instrument = instrument;
        this.learned = false;
        this.favourite = false;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getInstrument() {
        return instrument;
    }

    public Boolean isLearned() {
        return learned;
    }

    public Boolean favourite() {
        return favourite;
    }

    public Boolean makeLearned(){
        return learned = true;
    }

    public Boolean makeFavourite(){
        return favourite = true;
    }



}

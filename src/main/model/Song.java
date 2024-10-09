package model;

public class Song {
    private String title;
    private String instrument;
    private Boolean learned;
    private Boolean favourite;
    

    public Song(String title, String instrument, Boolean learned, Boolean favourite){
        this.title = title;
        this.instrument = instrument;
        this.learned = false;
        this.favourite = favourite;

    }

    public String getTitle() {
        return title;
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



}

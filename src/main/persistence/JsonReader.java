package persistence;

import model.Song;
import model.SongsLearned;
import model.SongsLearning;
import model.SongsToLearn;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

import org.json.*;

// Represents a reader that reads workroom from JSON data stored in file
public class JsonReader {
    private String source;

    // EFFECTS: constructs reader to read from source file
    public JsonReader(String source) {
        this.source = source;
    }

    // EFFECTS: reads SongsToLearn from file and returns it;
    // throws IOException if an error occurs reading data from file
    public SongsToLearn readSongsToLearn() throws IOException {
        String jsonData = readFile(source);
        JSONObject jsonObject = new JSONObject(jsonData);
        return parseSongsToLearn(jsonObject);
    }

        // EFFECTS: reads SongsLearning from file and returns it;
    // throws IOException if an error occurs reading data from file
    public SongsLearning readSongsLearning() throws IOException {
        String jsonData = readFile(source);
        JSONObject jsonObject = new JSONObject(jsonData);
        return parseSongsLearning(jsonObject);
    }

        // EFFECTS: reads SongsLearned from file and returns it;
    // throws IOException if an error occurs reading data from file
    public SongsLearned readSongsLearned() throws IOException {
        String jsonData = readFile(source);
        JSONObject jsonObject = new JSONObject(jsonData);
        return parseSongsLearned(jsonObject);
    }

    // EFFECTS: reads source file as string and returns it
    private String readFile(String source) throws IOException {
        StringBuilder contentBuilder = new StringBuilder();

        try (Stream<String> stream = Files.lines(Paths.get(source), StandardCharsets.UTF_8)) {
            stream.forEach(s -> contentBuilder.append(s));
        }

        return contentBuilder.toString();
    }

    // EFFECTS: parses SongsToLearn from JSON object and returns it
    private SongsToLearn parseSongsToLearn(JSONObject jsonObject) {
        SongsToLearn songsToLearn = new SongsToLearn();
        addSongsSongsToLearn(songsToLearn, jsonObject);
        return songsToLearn;
    }

    // MODIFIES: SongsToLearn
    // EFFECTS: parses songs from JSON object and adds them to SongsToLearn
    private void addSongsSongsToLearn(SongsToLearn songsToLearn, JSONObject jsonObject) {
        JSONArray jsonArray = jsonObject.getJSONArray("songs");
        for (Object json : jsonArray) {
            JSONObject nextSong = (JSONObject) json;
            addSongSongsToLearn(songsToLearn, nextSong);
        }
    }

    // MODIFIES: SongsToLearn
    // EFFECTS: parses song from JSON object and adds it to SongsToLearn
    private void addSongSongsToLearn(SongsToLearn songsToLearn, JSONObject jsonObject) {
        String title = jsonObject.getString("title");
        String artist = jsonObject.getString("artist");
        String instrument = jsonObject.getString("instrument");
        Song song = new Song(title, artist, instrument);
        songsToLearn.addSongToSongsToLearn(song);
    }

    // EFFECTS: parses SongsToLearn from JSON object and returns it
    private SongsLearning parseSongsLearning(JSONObject jsonObject) {
        SongsLearning songsLearning = new SongsLearning();
        addSongsSongsLearning(songsLearning, jsonObject);
        return songsLearning;
    }

        // MODIFIES: SongsToLearn
    // EFFECTS: parses songs from JSON object and adds them to SongsToLearn
    private void addSongsSongsLearning(SongsLearning songsLearning, JSONObject jsonObject) {
        JSONArray jsonArray = jsonObject.getJSONArray("songs");
        for (Object json : jsonArray) {
            JSONObject nextSong = (JSONObject) json;
            addSongSongsLearning(songsLearning, nextSong);
        }
    }

    // MODIFIES: SongsToLearn
    // EFFECTS: parses song from JSON object and adds it to SongsToLearn
    private void addSongSongsLearning(SongsLearning songsLearning, JSONObject jsonObject) {
        String title = jsonObject.getString("title");
        String artist = jsonObject.getString("artist");
        String instrument = jsonObject.getString("instrument");
        Song song = new Song(title, artist, instrument);
        songsLearning.addSongToSongsLearning(song);
    }

    // EFFECTS: parses SongsToLearn from JSON object and returns it
    private SongsLearned parseSongsLearned(JSONObject jsonObject) {
        SongsLearned songsLearned = new SongsLearned();
        addSongsSongsLearned(songsLearned, jsonObject);
        return songsLearned;
    }

        // MODIFIES: SongsToLearn
    // EFFECTS: parses songs from JSON object and adds them to SongsToLearn
    private void addSongsSongsLearned(SongsLearned songsLearned, JSONObject jsonObject) {
        JSONArray jsonArray = jsonObject.getJSONArray("songs");
        for (Object json : jsonArray) {
            JSONObject nextSong = (JSONObject) json;
            addSongSongsLearned(songsLearned, nextSong);
        }
    }

    // MODIFIES: SongsToLearn
    // EFFECTS: parses song from JSON object and adds it to SongsToLearn
    private void addSongSongsLearned(SongsLearned songsLearned, JSONObject jsonObject) {
        String title = jsonObject.getString("title");
        String artist = jsonObject.getString("artist");
        String instrument = jsonObject.getString("instrument");
        Song song = new Song(title, artist, instrument);
        songsLearned.addSongToSongsLearned(song);
    }

    
}

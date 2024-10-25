package persistence;

import model.Song;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestJson {
    protected void checkSong(String title, String artist, String instrument, Song song) {
        assertEquals(title, song.getTitle());
        assertEquals(artist, song.getArtist());
        assertEquals(instrument, song.getInstrument());
    }
}

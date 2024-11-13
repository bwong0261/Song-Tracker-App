package ui;

import model.Song;
import model.SongsToLearn;

import javax.swing.*;
import java.awt.*;

public class SongsToLearnWindow extends JFrame {
    private SongsToLearn songsToLearn;
    private JTextArea songsTextArea;

    public SongsToLearnWindow(SongsToLearn songsToLearn) {
        this.songsToLearn = songsToLearn;

        setTitle("Songs to Learn");
        setSize(400, 400);
        setLocationRelativeTo(null); // Centers the window
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Only closes this window

        // Create a text area to display the list of songs
        JTextArea songsTextArea = new JTextArea();
        songsTextArea.setEditable(false); // Make the text area read-only

        // Check if there are any songs to display
        if (songsToLearn.getSongs().isEmpty()) {
            songsTextArea.setText("You have no songs on your learn list.");
        } else {
            StringBuilder songsList = new StringBuilder();
            for (Song song : songsToLearn.getSongs()) {
                songsList.append("Title: ").append(song.getTitle())
                          .append("\nArtist: ").append(song.getArtist())
                          .append("\nInstrument: ").append(song.getInstrument())
                          .append("\n\n");
            }
            songsTextArea.setText(songsList.toString());
        }

        // Add the text area to a scroll pane in case the song list is long
        JScrollPane scrollPane = new JScrollPane(songsTextArea);
        add(scrollPane, BorderLayout.CENTER);

        setVisible(true);
    }
}
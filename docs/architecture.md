# Architecture

# bwong0261/Song-Tracker-App

## Song Learning Tracker

This application helps musicians track their song learning progress across various instruments. Users can organize songs into "To Learn," "Learning," and "Learned" categories, and monitor learning duration.

### Motivation

The project addresses the common challenge musicians face in managing their song repertoire, providing a centralized system for tracking and organizing learning progress.

### User Stories

The application supports the following core functionalities:

-   Add songs to a "To Learn" list.
-   View all songs in the "To Learn" list.
-   Transition songs from "Learning" to "Learned."
-   Favorite learned songs.
-   Save and load all song lists.

### End-User Instructions

To interact with the application:

-   **View Song Lists:** Click on the button corresponding to the desired song list (e.g., "Songs To Learn," "Songs Learning," "Songs Learned").
-   **Add/Remove Songs:** Use the "add" or "remove" buttons within the respective song list views.

## Architecture

### High-Level Overview

The Song Learning Tracker is a Java-based desktop application utilizing a Model-View-Controller (MVC) like pattern. It manages song data through persistent JSON files, allowing users to save and load their learning progress.

### Folder Structure

```
.
├── .DS_Store
├── .gitignore
├── .vscode/
├── README.md
├── UML_Design_Diagram.pdf
├── bin/
├── checkstyle.xml
├── data/
│   ├── songtracker.json
│   ├── testReaderEmptySongTracker.json
│   ├── testReaderGeneralSongTracker.json
│   ├── testWriterEmptySongTracker.json
│   └── testWriterGeneralSongTracker.json
├── lib/
│   ├── json-20240303.jar
│   └── junit-platform-console-standalone-1.10.2.jar
├── src/
│   ├── main/
│   │   ├── model/
│   │   │   ├── Event.java
│   │   │   ├── EventLog.java
│   │   │   ├── Song.java
│   │   │   ├── SongsLearned.java
│   │   │   ├── SongsLearning.java
│   │   │   └── SongsToLearn.java
│   │   ├── persistence/
│   │   │   ├── JsonReader.java
│   │   │   └── JsonWriter.java
│   │   └── ui/
│   │       ├── Main.java
│   │       ├── SongTrackerApp.java
│   │       ├── SongsLearnedWindow.java
│   │       ├── SongsLearningWindow.java
│   │       └── SongsToLearnWindow.java
│   └── test/
│       ├── model/
│       │   ├── TestEvent.java
│       │   ├── TestEventLog.java
│       │   ├── TestSong.java
│       │   ├── TestSongsLearned.java
│       │   ├── TestSongsLearning.java
│       │   └── TestSongsToLearn.java
│       └── persistence/
│           ├── TestJson.java
│           ├── TestJsonReader.java
│           └── TestJsonWriter.java
└── ...
```

### Key Design Patterns

-   **Model-View-Controller (MVC) (Implicit):** The `ui` package handles the view, `model` package manages data and business logic, and `SongTrackerApp` acts as a central controller.
-   **Persistence (Reader/Writer):** `JsonReader` and `JsonWriter` classes in the `persistence` package implement the strategy for saving and loading application state.
-   **Singleton (EventLog):** The `EventLog` class likely follows a singleton pattern to ensure a single instance for logging application events.

### Data Flow

1.  **Initialization:** The `Main` class starts the `SongTrackerApp` UI.
2.  **User Interaction:** Users interact with the UI (`SongsToLearnWindow`, `SongsLearningWindow`, `SongsLearnedWindow`) to add, move, or favorite songs.
3.  **Model Updates:** UI actions trigger updates in the `Song`, `SongsToLearn`, `SongsLearning`, and `SongsLearned` model classes.
4.  **Persistence:**
    *   **Save:** When a user saves, `JsonWriter` serializes the current state of the song lists from the model into `songtracker.json`.
    *   **Load:** When a user loads, `JsonReader` deserializes `songtracker.json` into the model classes, restoring the application state.
5.  **Event Logging:** Significant application events are recorded by `EventLog`.
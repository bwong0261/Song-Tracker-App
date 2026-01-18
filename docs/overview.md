# Project Overview

# Song Learning Tracker

## Project Overview

The Song Learning Tracker is a personal project designed to help musicians organize and track their progress in learning new songs across various instruments. It allows users to categorize songs into "want to learn," "currently learning," and "already learned" lists, providing a clear overview of their musical journey.

### Key Features

*   **Song Categorization:** Organize songs into "To Learn," "Learning," and "Learned" lists.
*   **Progress Tracking:** Monitor the duration spent learning a particular song.
*   **Song Favoriting:** Mark learned songs as favorites for easy access.
*   **Persistent Storage:** Save and load song lists to and from a file.
*   **User-Friendly Interface:** (Implied by UI package) Interact with the application through a graphical user interface.
*   **Instrument Agnostic:** Supports tracking songs for a wide choice of instruments.

### Technology Stack

| Name        | Purpose                                     |
| :---------- | :------------------------------------------ |
| Java        | Core programming language for application logic and UI |
| JSON        | Data interchange format for saving and loading song data |
| JUnit       | Testing framework for unit and integration tests |

### Project Status

This project is under active development, focusing on implementing the core functionalities for song tracking and persistence. Future enhancements will include refining the user interface and expanding tracking capabilities.

## Getting Started

### Prerequisites

*   Java Development Kit (JDK) 11 or higher

### Installation

1.  Clone the repository:
    ```bash
    git clone https://github.com/bwong0261/Song-Tracker-App.git
    ```
2.  Navigate to the project directory:
    ```bash
    cd Song-Tracker-App
    ```
3.  Compile the project:
    ```bash
    javac -cp "lib/*" src/main/ui/*.java src/main/model/*.java src/main/persistence/*.java
    ```

### Usage

To run the application:

```bash
java -cp "lib/*:src/main" ui.Main
```

### End-User Instructions

*   **Adding Songs:** To add a new song, navigate to the desired song list (e.g., "Songs To Learn") and click the "Add" button.
*   **Viewing Songs:** Click on the button corresponding to the song list you wish to view (e.g., "Songs To Learn," "Songs Learning," "Songs Learned").
*   **Moving Songs:** To move a song from "Learning" to "Learned" after completion, select the song and use the appropriate action within the application.
*   **Saving/Loading:** The application provides options to save your current song lists to a file and load previously saved lists upon startup.

## File Structure

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
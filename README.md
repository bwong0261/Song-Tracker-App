# My Personal Project

## Song Learning Tracker

- **What will the application do?**

The application will help people keep track of songs that they are learning on a large choice of instruments. This will help them organize songs into songs that they want to learn, currently learning and already finished learning. They will also be able to keep track for how many days that they have been learning a particular song.

- **Who will use it?**

The people who use it would be people who play instruments and is continually learning new songs. This can be helpful for students and also casual instrument players who are continually learning new songs.

- **Why is this project of interest to you?**

This project is of interest to me because I personally play guitar and am continually learning new songs. One of the problems that I encountered is that I lost track of the songs that I want to learn, currently learning, and have already learned. I would find it super helpful to have an application for every song that I have learned.

### User Stories ###

- As a user, I want to be able to add songs to the ones which I want to learn.

- As a user, I want to be able to view all of the songs that I want to learn.

- As a user, I want to be able to make songs that I am learning to ones that I have learnt, after I am finished learning them.

- As a user, I want to favourite songs that I have already learnt.

- As a user, I want to be able to save all of my lists of songsToLearn, songsLearning and songsLearned.

- As a user, when I start my application I want to have the option to load my lists from a previous save file and resume them.

### Instructions for End User ### 

- You can generate the first required action related to the user story "adding multiple Xs to a Y" by clicking on the button for the relevant list of songs that you want to view

- You can generate the second required action related to the user story "adding multiple Xs to a Y" by clicking on either the add / remove / mark song learning song button in "Songs To Learn", mark finished song button in "Songs Learning" and "Favourite" button in "Songs Learned"

- You can locate my visual component by favouriting a song in Songs Learned and seeing a star pop up.

- You can save the state of my application by clicking on the save button in the main menu.

- You can reload the state of my application by clicking on the load button in the main menu.

### Phase 4: Task 2 ###

Tue Nov 26 21:26:36 PST 2024
Added new song to learn:asd
Tue Nov 26 21:26:45 PST 2024
Removed song to learn:asd
Tue Nov 26 21:26:55 PST 2024
Added new song to learn:Get You
Tue Nov 26 21:26:57 PST 2024
Removed song to learn:Get You
Tue Nov 26 21:26:57 PST 2024
Started learning song:Get You
Tue Nov 26 21:27:03 PST 2024
Stopped learning song:Get You
Tue Nov 26 21:27:14 PST 2024
Added new song to learn:Valentine
Tue Nov 26 21:27:15 PST 2024
Removed song to learn:Valentine
Tue Nov 26 21:27:15 PST 2024
Started learning song:Valentine
Tue Nov 26 21:27:19 PST 2024
Stopped learning song:Valentine
Tue Nov 26 21:27:19 PST 2024
Finished learning song:Valentine
Tue Nov 26 21:27:24 PST 2024
Favourite song:Valentine

### Phase 4: Task 2 ###

Upon reflecting on my project I could greatly reduce the duplication in my code by creating an abstract class called SongsList that has all of the relevant and common methods in SongsToLearn, SongsLearning and SongsLearned. Then I would have all of these classes extend this SongsList class in order to inherit all of the defined concrete methods in this class that are the same between them all. I would also do the same for the GUI and creat a SongsListWindow abstract class that would have defined concrete methods that are shared between the three classes of SongsToLearnWindow, SongsLearningWindow and SongsLearnedWindow. These three classes would then extend the abstract class to inherit the methods but they would still implement their own class specific methods.
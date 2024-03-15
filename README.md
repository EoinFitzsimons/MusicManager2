# MusicManager
 For NCI DSA CA

Music Management Application
Overview:
Design an application that allows users to manage their music playlists. Users can create playlists, add songs, organize them by genre, and perform various operations.

Functional Requirements:
Create a Playlist of Liked Songs:
Users can create a playlist where they add their favourite songs. These liked songs will serve as the source for other playlists.
Genre-Based Playlists:
At least two genre-based playlists should be created (e.g., “Rock,” “Pop,” etc.).
Songs from the liked playlist can be moved to these genre playlists based on criteria (e.g., genre, artist, etc.).
Song Operations:
Users can add, search, delete, and move songs within their playlists.
Playlist Details:
Users should be able to see a printed list of any playlist they choose.
Display the number of songs in each playlist.
Repeatable Playlists:
Provide an option for users to create a playlist that can be set to repeat.
Implementation Guidelines:
Commit your code to GitHub at least 5 times during the implementation process.
Submit a Word document or PDF (as specified in the submission details).

Summary
Abstract Data Types (ADTs): The application uses two ADTs, a Stack and a Double Linked List.
•	Stack: The Stack is a linear data structure that follows the Last-In-First-Out (LIFO) principle. It’s used for managing the “liked” songs in the application. The last song added to the “liked” stack is the first one to be moved to a playlist, adhering to the system’s limitation.
•	Double Linked List: The Double Linked List is a complex linear data structure consisting of nodes linked in both directions. This allows for efficient alterations from any position within the list.
Interfaces: The application defines two interfaces, Stack and Double Linked List, for the ADTs. These interfaces establish a contract for what the classes can do, ensuring consistency and predictability.
•	Stack Interface: This interface defines the methods that any class implementing a stack data structure must have. These methods include operations like push (add an element) and pop (remove an element).
•	LinkedList Interface: This interface defines the methods for classes that use a linked list data structure. These methods include operations like add, remove, and search.
Classes: The application includes several classes, each with its responsibilities and roles in the system.
•	DLList: This class implements a Double Linked List. It provides methods for adding, removing, and searching songs in a playlist.
•	LinkedListInterface: This class defines the methods for using a linked list, providing a blueprint for any class that needs to use a linked list data structure.
•	MusicManagerApp: This is the main class that runs the application. It creates instances of other classes and calls their methods as needed.
•	MusicManagerGUI: This class handles the graphical user interface of the application. It creates and manages GUI elements like buttons and text fields and defines how they behave.
•	MyStack: This class implements a Stack, providing methods for adding, removing, and viewing songs in the “liked” songs stack.
•	Node: This class represents a node in the Double Linked List. Each node contains some data (a song) and references to the next and/or previous nodes.
•	StackInterface: This class defines the methods for using a stack.
Song Management: The application provides several features for managing songs and playlists.
•	Adding Songs: Users can add songs to the “liked” stack. When a song is added, it’s converted into title case for uniformity across all songs in the application.
•	Creating Playlists: Once a song is in the “liked” songs stack, it can be moved to one of two playlists, organised based on certain criteria such as genre.
•	Modifying Playlists: Users can modify their playlists by removing or swapping songs. The removal operation is case-insensitive, providing flexibility in song management.
•	Displaying Song Lists: Users can view a printed list of any playlist they wish. The list is dynamically updated whenever a song is added or removed from a playlist.
•	Repeating Playlists: The application includes a repeat feature that continuously simulates playing songs from a selected playlist.
Extras
https://github.com/EoinFitzsimons/MusicManager2

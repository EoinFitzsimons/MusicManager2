# MusicManager2

MusicManager2 is an application developed for NCI DSA CA. It uses two Abstract Data Types (ADTs), a Stack and a Double Linked List, and provides several features for managing songs and playlists.

## Abstract Data Types (ADTs)

The application uses the following ADTs:

- **Stack**: A linear data structure that follows the Last-In-First-Out (LIFO) principle. It’s used for managing the “liked” songs in the application. The last song added to the “liked” stack is the first one to be moved to a playlist, adhering to the system’s limitation.
- **Double Linked List**: A complex linear data structure consisting of nodes linked in both directions. This allows for efficient alterations from any position within the list.

## Interfaces

The application defines the following interfaces for the ADTs:

- **Stack Interface**: This interface defines the methods that any class implementing a stack data structure must have. These methods include operations like push (add an element) and pop (remove an element).
- **LinkedList Interface**: This interface defines the methods for classes that use a linked list data structure. These methods include operations like add, remove, and search.

## Classes

The application includes the following classes:

- **DLList**: This class implements a Double Linked List. It provides methods for adding, removing, and searching songs in a playlist.
- **LinkedListInterface**: This class defines the methods for using a linked list, providing a blueprint for any class that needs to use a linked list data structure.
- **MusicManagerApp**: This is the main class that runs the application. It creates instances of other classes and calls their methods as needed.
- **MusicManagerGUI**: This class handles the graphical user interface of the application. It creates and manages GUI elements like buttons and text fields and defines how they behave.
- **MyStack**: This class implements a Stack, providing methods for adding, removing, and viewing songs in the “liked” songs stack.
- **Node**: This class represents a node in the Double Linked List. Each node contains some data (a song) and references to the next and/or previous nodes.
- **StackInterface**: This class defines the methods for using a stack.

## Song Management

The application provides several features for managing songs and playlists:

- **Adding Songs**: Users can add songs to the “liked” stack. When a song is added, it’s converted into title case for uniformity across all songs in the application.
- **Creating Playlists**: Once a song is in the “liked” songs stack, it can be moved to one of two playlists, organised based on certain criteria such as genre.
- **Modifying Playlists**: Users can modify their playlists by removing or swapping songs. The removal operation is case-insensitive, providing flexibility in song management.
- **Displaying Song Lists**: Users can view a printed list of any playlist they wish. The list is dynamically updated whenever a song is added or removed from a playlist.
- **Repeating Playlists**: The application includes a repeat feature that continuously simulates playing songs from a selected playlist.

## Extras

For more information, please visit the EoinFitzsimons/MusicManager2 repository on GitHub. Activates through a menu item and a keyboard shortcut.


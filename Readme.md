# MobiLab Console Database Application

## Overview

The MobiLab Console Database Application is a simple console-based database application written in Kotlin. It allows users to interact with a list of people by adding new entries or listing existing ones. The application runs in a loop until the user decides to exit.

## How to Run

To run the application, execute the following main function in your Kotlin environment:

```kotlin
fun main(args: Array<String>) {
    val myConsoleApp = ConsoleDb()
    myConsoleApp.start()
}
```

## ConsoleDb Class

### Description

The `ConsoleDb` class is the core of the application. It provides functionality to add and list people in a simple database-like manner through a console interface.

### Properties

- **command**: A string variable that holds the current user command.
- **people**: A mutable list of `Person` objects representing the database of people.

### Methods

- **start()**: The main entry point of the application. It initializes the application, processes user commands, and continues running until the user decides to exit.

- **createPersonFromUserInput()**: A private method used to collect user input and create a new `Person` object.

## Supported Commands

The application supports the following commands:

- **'list'**: Display the list of people in the database.
- **'add'**: Add a new person to the database.
- **'exit'**: Exit the application.

## How to Use

1. Run the application using the provided `main` function.
2. Enter one of the supported commands: 'list', 'add', or 'exit'.
3. Follow the prompts to provide necessary information (e.g., person id, name, age) when adding a person.
4. To exit the application, enter the 'exit' command.

## Example Usage

```bash
Welcome to MobiLab DB
------------------------
Supported commands: 'list', 'exit', 'add'
Enter 'exit' to stop the program

> add
Adding person..
Person id: 1
Person name: John Doe
Person age: 30
------------------------
Supported commands: 'list', 'exit', 'add'
Enter 'exit' to stop the program

> list
Listing people..
[Person(id=1, name=John Doe, age=30)]
------------------------
Supported commands: 'list', 'exit', 'add'
Enter 'exit' to stop the program

> exit
Thank you for using MobiLab DB
```

Feel free to explore the commands and interact with the application to manage the list of people in the database.

**Note:** This application is a simple example and does not persist data between runs. It is intended for educational purposes and may require enhancements for production use.
# Swiggy SDE Challenge

## Problem Statement:

Design a Magical Arena. Every Player is defined by a “health” attribute, “strength” attribute and an
“attack” attribute all positive integers. The player dies if his health attribute touches 0.

## 📁 Folder Structure

          Swiggy-aSDE-Coding-Assignment/
               ├── src/
               │   ├── main/java/com/task/
               │   │   ├── Dice.java
               │   │   ├── Player.java
               │   │   ├── Arena.java
               │   │   └── Main.java
               │   └── test/java/com/task/
               │       ├── DieTest.java
               │       ├── PlayerTest.java
               │       └── ArenaTest.java
               ├─ target/
               |  └── swiggy-1.0-SNAPSHOT.jar
               └── README.md

## How to Run

1.  Ensure you have Java 22.0.1 installed.

    ```
    javac --version
    ```

    If not installed, download and install Java from [here](https://www.oracle.com/java).

2.  Ensure you have Maven installed.

    ```
    mvn --version
    ```

    If not installed, download and install Maven from [here](https://maven.apache.org/download.cgi).

3.  Navigate to the project directory.

    ```
    cd Swiggy-aSDE-Coding-Assignment
    ```

4.  Compile the source code.

    ```
    mvn package
    ```

5.  Run the application.

    ```
    java -cp target/swiggy-1.0-SNAPSHOT.jar com.task.Main
    ```

## How to Run Unit Tests

1. Navigate to the project directory.

    ```
    cd Swiggy-aSDE-Coding-Assignment
    ```

2. Run the unit tests.

    ```
    mvn test
    ```

# Building-a-Basic-Android-App-with-Kotlin-Jetpack-Compose

## Project Overview
The objective of this project is to develop a basic Android Application that implements Kotlin fundamental OOP principles and Jetpack Compose UI components. The project consists of two main sections:

### Section 1:
- **User Class**: Created a `User` class with attributes like `name`, `age`, and `email`.
- **Data Class**: Created a data class `User` to store user data.
- **Greeting Provider Interface**: Created an interface `GreetingProvider` and implemented the `provideGreeting` function.
- **Inheritance**: Created a `Person` class that inherits from the `User` class.
- **Main Class**: The main class that demonstrates the usage of all the created classes.

### Section 2:
- **UI Design with Jetpack Compose**: 
  - Created a UI design for a "Series Screen".
  - Arranged the content vertically using `Column` and added the background to the screen.
  - Used a `Box` to hold an image.
  - Displayed the series name and the date of the series.
  - Displayed video quality options (720p and 1080p) side by side using a `Row`.
  - Added buttons for "Play" and "Download".
  - Implemented a toggle button for "Add to Watchlist" which changes to red when the user adds the series to their watchlist.
  - Added a description text about the series.

## Setup Instructions

### Section 1:
1. Navigate to the `main.kt` file using this path:
   `app/src/main/java/com/example/buildingbasicandroidapp`
2. Run the file to see the output in the console.

### Section 2:
1. Open the Android Emulator.
2. Navigate to the `MainActivity.kt` file using this path:
   `app/src/main/java/com/example/buildingbasicandroidapp`
3. Run the `MainActivity.kt` in the emulator to launch the app and see the UI.

## Features Implemented:
- User class with basic attributes (`name`, `age`, `email`).
- Data class for storing user information.
- Greeting provider interface for providing greetings.
- Person class demonstrating inheritance from User class.
- Jetpack Compose-based UI for displaying a series screen.
- Buttons for play, download, and adding to the watchlist.
- Toggle functionality for the "Add to Watchlist" button.
- UI displaying series name, date, quality options, and description.

## Technologies Used:
- **Kotlin**: For writing the core Android app logic.
- **Jetpack Compose**: For building the modern UI components.
- **Android Studio**: The integrated development environment (IDE) for building and running the app.
- **Emulator**: Used for running the app on virtual devices.

## How to Contribute:
1. Fork this repository to your own GitHub account.
2. Clone the forked repository to your local machine.
3. Create a new branch for your feature or bug fix:
   ```bash
   git checkout -b feature-name


## The Following pictures show the output of the Project: 
![Screenshot 2025-03-07 144553](https://github.com/user-attachments/assets/0304073c-a021-4f9a-8d19-5423737af453)


![Screenshot 2025-03-07 134445](https://github.com/user-attachments/assets/e6349841-cd9f-4241-a536-a5d0c5145cc7)

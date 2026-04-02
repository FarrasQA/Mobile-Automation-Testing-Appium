Mobile Automation Testing Project
1. Project Description

This project is a mobile automation testing implementation for an Android application using Appium, Java, TestNG, and Gradle.

The primary objective is to validate critical user flows through automated testing, specifically:

User login functionality
Adding a product to the shopping cart

The project applies a basic Page Object Model (POM) design to ensure maintainability, readability, and reusability of the test code.

2. Setup Instructions
Prerequisites

Ensure the following tools are installed and configured:

Java JDK 17
Node.js
Appium
Android Studio (with an active emulator)
IntelliJ IDEA
Android SDK (with environment variables properly set)
Installation Steps
Clone the repository:
git clone <repository-url>
cd <project-folder>
Install project dependencies:
./gradlew clean build
Start the Appium server:
appium
Launch the Android emulator:
Open Android Studio → Device Manager → Start emulator
or via command line:
emulator -avd <emulator_name>
Install the application (APK) to the emulator:
adb install path/to/application.apk
3. Test Execution
Run via IDE:
Open the project in IntelliJ IDEA
Right-click on test classes (e.g., LoginTest or AddToCartTest)
Select Run

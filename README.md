**Mobile Automation Testing Project**

**Project Description**
This project is a mobile automation testing implementation for an Android application using Appium, Java, TestNG, and Gradle.
The primary objective is to validate critical user flows through automated testing, specifically:
 - User login functionality
 - Adding a product to the shopping cart

The project applies a basic Page Object Model (POM) design to ensure maintainability, readability, and reusability of the test code.

**Setup Instructions**
**Prerequisites**
Ensure the following tools are installed and configured:
 - Java JDK 17
 - Node.js
 - Appium
 - Android Studio (with an active emulator)
 - IntelliJ IDEA (IDE)
 - Android SDK (with environment variables properly set)

**Installation Steps**
1. Clone the repository
   
2. Start the Appium server
   
3. Launch the Android emulator
   
4. Install the application (APK) to the emulator via appium inspector:
{
  "platformName": "Android",
  "deviceName": "Android Emulator",
  "automationName": "UiAutomator2",
  "app": "path/to/application.apk"
}

**Test Execution**
Run via IDE:
1. Open the project in IntelliJ IDEA
2. Right-click on test classes (e.g., LoginTest or AddToCartTest)
3. Select Run

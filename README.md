# Terminal Proving Ground

The Terminal Proving Ground is a project that allows experimentation with the Linux CLI (Command Line Interface). It is comprised of two parts - an Android client and a Docker container instance. The Android application allows connection to the Docker virtual instance via a secure link using the SSH protocol. 

## Pre-requisites:

Latest version of Android Studio and Android SDK tools, now bundled together available [here](https://developer.android.com/studio)

A physical or virtual Android Device connected. Please note the minimum SDK version is 14 and a larger screen is more advantageous.

A stable network connection, ideally with the Android device and computer on the same network. If this is not the case, NGROK can create a TCP tunnel as a solution (e.g. `ngrok tcp 9090`)

Latest version of Docker Desktop is required for the container environment.

## Compiling

### Android Studio

Android Studio is recommended for compiling the project especially since the Terminal Proving Ground was developed in Android Studio.

You can import this project by importing from the GitHub URL. (File -> New -> Project from Version Control...)

The Android Application was compiled and install from a Windows computer, additional configuration may be required if using Linux or macOS.

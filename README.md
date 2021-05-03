# Terminal Proving Ground

The Terminal Proving Ground is a project that allows experimentation with the Linux CLI (Command Line Interface). It is comprised of two parts - an Android client and a Docker container instance. The Android application allows connection to the Docker virtual instance via a secure link using the SSH protocol. 

## Pre-requisites:

Latest version of Android Studio and Android SDK tools, now bundled together available [here](https://developer.android.com/studio)

A physical or virtual Android Device connected. Please note the minimum SDK version is 14 and a larger screen is recommended. A physical device (Oneplus 6 running Android 10) was used for testing. Virtual devices have not been tested so may not be compatible

A stable network connection, ideally with the Android device and computer on the same network. If this is not the case, NGROK can create a TCP tunnel as a solution (e.g. `ngrok tcp 9090`). NGROK is available [here](https://ngrok.com/download) and requires an account.

Latest version of Docker Desktop is required for the container environment. See Docker documentation for running on Windows as some additional setup is required.

## Compiling

### Android Studio

Android Studio is recommended for compiling the project especially since the Terminal Proving Ground was developed in Android Studio.

You can import this project by importing from the GitHub URL. (File -> New -> Project from Version Control...)

The Android Application was compiled and install from a Windows computer, additional configuration may be required if using Linux or macOS.

If the project is reopened or the IDE is restarted, a Gradle project sync is required.

### Docker

A Docker public repository was made for this project, available [here](https://hub.docker.com/r/ij298/fyp_ssh).

To pull from the repository, simply run `docker pull ij298/fyp_ssh`. This will pull the latest build.

Next run `docker run -it --name ssh_container -p 9090:22 ij298/fyp_ssh`. This will run the container and expose port 9090 for client connection. The contianer will have the name `ssh_container`.

Feel free to keep the command line window open. You can exit by executing `exit`.

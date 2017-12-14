# Connect-A-Lab

### BRA1N

    * Brandon Bocek
    * Austin Hester
    * Roy Ivey
    * Nick Nesbit

##### CS 4500 - Software Engineering
##### University of Missouri - St. Louis

Connect-A-Lab idea by Allen Savage

To build and modify I recommend IntelliJ Community Edition, a Java IDE.
You will need to go to File > Project Structure > Project and set the jdk to 1.8. While there, set the
language level to 8 for jdk-1.8, and make a folder for the build files in the same tab.
On the left, go to SDKs and make sure C:\\path\jfxrt.jar is in the classpath list in order to use JavaFX.

Now exit out of that.
In IntelliJ on the left side, you can view your files. Open ConnectALab to see project structure.
Now right-click on the src directory, and, at nearly the bottom, choose "Mark Directory As>" and choose
"Sources root".

Now you can build and run the project.
Go to Run > Edit Configurations
Press the green plus. Now you have to set the Main class. If you click on the 3 dots on the right, it will show
you potential Main classes. Pick "startup.Main".
Great. Now go to Build > Build Project
It will build for the first time. You will not have to do this again.
From now on, you can run it at any time by going to Run > Run 'Main', or by pressing the green play button
on the toolbar. If it's not there, go to View > check 'Toolbar'.

That should get you up and running with Java.

Here is a tutorial on building it to an executable jar file:
https://www.jetbrains.com/help/idea/applications-with-a-preloader-project-organization-and-packaging.html

I haven't gotten it to build into a working jar yet, but someone will figure it out.


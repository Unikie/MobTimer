MobTimer
========

An on-screen pop-up timer for Mob Programming. Helps your team to switch drivers periodically.

In Mystes, we initially used timer apps on smart phones to promt the driver change with an annoying alarm noise. Once we had two mob teams in the same open room, it quickly became clear that we needed a silent but efficient timer for the purpose.

The inspiration for creating MobTimer was seeing how Woody Zuill's team uses a similar tool for forcing driver switch in Mob Programming sessions. Unfortunately we cannot use their original .Net version of the tool because our mobs use various platforms. Thus, we decided to develop our own version of the tool with good ol' Java.

- Check out Woody's team's DeveloperTimer: https://github.com/MobProgramming/DeveloperTimer.Net
- Read more about Mob Programming from http://mobprogramming.org/

## Using MobTimer

There are no pre-built releases available yet. Building and running from source is quite simple.

In the root directory of the project:

1. Compile and create the JAR
```
javac *.java
jar cfe mobtimer.jar MobTimer *.class
```
2. Run it!
```
java -jar mobtimer.jar
```

Or as a one-liner:
```
javac *.java && jar cfe mobtimer.jar MobTimer *.class && java -jar mobtimer.jar
```

**Once you have the timer up and running, you can use it to schedule driver changes:**
* Change the number of minutes you want each turn to last, for example 15 minutes
* Click the button "NEXT DRIVER - OK GO!"
* The timer automatically minimizes and your driver can start working
* Once the time is up, the timer window will pop up on full-screen and let your team know it's time to switch drivers
* The next timer should step in, and click the "NEXT DRIVER - OK GO!" button again.

## Platforms & Requirements

MobTimer requires Java JRE to work and JDK to build.

MobTimer has been successfully used on these platforms:
- Mac OSX 10.10 with Oracle JRE for Java 1.7
- Ubutntu 14.04 with OpenJDK JRE for Java 1.7

Known problems with platforms & Java versions
- Ubutntu 14.04 with Oracle JRE for Java 1.7 doesn't allow the timer to pop on screen on top of other windows.
 - Workaround: run with OpenJDK JRE

If you test and use MobTimer on other platforms, please let us know which ones and how well it works!

## Releases

- 0.1 - Initial prototype for platform testing

## Roadmap

- 0.2 - Add list of drivers and call automatically for the next timer


## License

The MIT License (MIT)

Copyright (c) 2014 Mystes

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.


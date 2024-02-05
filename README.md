[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/eYTuOlgZ)

# Builder

## Description
Car Builder is a __Java__ with __Maven__ project that illustrates the Builder pattern design.
It includes the construction of different types of cars:
- SUV
- Sport car
  and car manuals.

## Installation
To install this project:
```shell
# Clone this repository in your local machine :
git clone https://github.com/fanjasoa18/Builder-Pattern.git
```

## Running the program:
You just have to click the runner button of the application or
If you want to run it manually:
##### compile:
```shell
   javac Builder.java Car.java CarManual.java Director.java Main.java
```
##### run:
```shell
   java Main
```

## Testing
Just click to the runner button for test, or you can do it manually:
- With Maven locally installed : `mvn clean test`
- With Maven Wrapper :
    - On Unix/Mac : `./mvnw clean test`
    - On Windows : `mvnw.cmd clean test`

## Coding standard
The coding standard used is Google java style guide

##### Linter
The linter used is checkstyle.

##### Formatter
The formatter used is Google-java-format, executed with the script format.sh as follows:
```shell
    ./format.sh
```
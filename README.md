# Project TravelMap

## Description

Design of Maps-type software. This software was implemented in Java, and can be used to read a transport map, then, by giving the GPS coordinates of departure and arrival, it calculates the shortest route (in time and distance) to make this journey using the Dijkstra algorithm. We used a graph structure to retrieve and store each stop on the Paris network and apply Dijkstra's algorithm to determine the shortest route.

## Launch of the programme
This project uses [maven](https://maven.apache.org/) for construction management.

ATo compile and run the tests, simply run ```mvn verify ``` 

In its initial version, the program provided is simple code that runs in a terminal or graphical application. 

Once the programme has been compiled, you will find an executable jar in the target folder. With the correct jar name (changing version), you can run it with: ``` java -jar project-2024.1.0.0-SNAPSHOT-jar-with-dependencies ``` 

The `--info` launch option will cause information about the application to be displayed in the console. 

The `--term` launch option will cause the application to be launched in the terminal. 

The `--gui` launch option will launch the graphical interface. 

The `-map` launch option will display the Paris metro network, so you can click on the stops to get station information.




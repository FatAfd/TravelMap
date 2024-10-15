package fr.u_paris.gla.project.Lecture_Reseau;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Link {
    private String lineName;
    private int time;
    private double distance;
    private Stop source;
    private Stop destination;
    private List<LocalTime> H_passage;


    public Link() {
    }

    public Link(String s, int time, double distance, Stop source, Stop destination) {
        this.lineName=s;
        this.time = time;
        this.distance = distance;
        this.source = source;
        this.destination = destination;
        this.H_passage = new ArrayList<>();
    }

    public String getLineName() {
        return this.lineName;
    }

    public void setLineName(String s) {
        this.lineName=s;
    }

    public int getTime() {
        return this.time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public double getDistance() {
        return this.distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public String getSourceName() {
        return this.source.getStopName();
    }

    public Stop getSource() {
        return this.source;
    }

    public void setSource(Stop source) {
        this.source = source;
    }

    public String getDestinationName() {
        return this.destination.getStopName();
    }

    public Stop getDestination() {
        return this.destination;
    }

    public void setDestination(Stop destination) {
        this.destination = destination;
    }

    public List<LocalTime> getHPassage() {
        return this.H_passage;
    }


    @Override
    public String toString() {
        return "\n\nLink: {\n" +
            "Line= " + getLineName() + "\n" +
            "Time= " + getTime() + " (sec)\n" +
            "Distance =" + getDistance() + "km\n" +
            "\tFROM= " + getSource() + "\n" +
            "\tTO= " + getDestination() + "" +
            "}\n";
    }
    
}

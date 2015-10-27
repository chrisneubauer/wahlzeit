package org.wahlzeit.model;

/**
 * TODO The class Location is supposed to be documented...
 * @author Christoph Neubauer
 */
public class Location {
    public String name;
    public Coordinate coordinate;

    public Location() {
        Location location = new Location();
        location.name = "Standpunkt";

        Coordinate coordinate = new Coordinate(0,0);
        location.coordinate = coordinate;
    }

    public Location(double latitude, double longitude) {
        Location location = new Location();
        location.name = "Standpunkt";

        Coordinate coordinate = new Coordinate(latitude, longitude);
        location.coordinate = coordinate;
    }
}

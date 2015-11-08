package org.wahlzeit.model;

/**
 * TODO The class Location is supposed to be documented...
 * @author Christoph Neubauer
 */
public class Location {
    public String name;
    public SphericCoordinate coordinate;

    public Location() {
        Location location = new Location();
        location.name = "Standpunkt";

        SphericCoordinate coordinate = new SphericCoordinate(0,0);
        location.coordinate = coordinate;
    }

    public Location(double latitude, double longitude) {
        Location location = new Location();
        location.name = "Standpunkt";

        SphericCoordinate coordinate = new SphericCoordinate(latitude, longitude);
        location.coordinate = coordinate;
    }
}

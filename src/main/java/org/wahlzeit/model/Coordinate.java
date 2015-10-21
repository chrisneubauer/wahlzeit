package org.wahlzeit.model;

/**
 * The class Coordinate adds location information to a photo
 * @author Christoph Neubauer
 */
public class Coordinate {
    public Coordinate(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }
    /**
     *
     */
    public double latitude;

    /**
     *
     */
    public double longitude;

    /**
     *
     */
    protected double getLongitude() {
        return this.longitude;
    }

    /**
     *
     */
    public double getLatitude() {
        return this.latitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getDistance(Coordinate coordinate) {
        double dlon = coordinate.getLongitude() - this.getLongitude();
        double dlat = coordinate.getLatitude() - this.getLatitude();
        double a = Math.pow((Math.sin(dlat/2)), 2) + Math.cos(this.getLatitude()) * Math.cos(coordinate.getLatitude()) * Math.pow((Math.sin(dlon/2)), 2);
        double c = 2 * Math.atan2( Math.sqrt(a), Math.sqrt(1-a) );
        double d = 6373 * c; // R is the radius of the Earth
        return d;
    }

    public double getLatitudinalDistance(Coordinate coordinate) {
        return Math.abs(this.getLatitude() - coordinate.getLatitude());
    }

    public double getLongitudinalDistance(Coordinate coordinate) {
        return Math.abs(this.getLongitude() - coordinate.getLongitude());
    }
}

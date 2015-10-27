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

    public double getDistance(Coordinate coordinate) throws IllegalArgumentException {
        double lat1 = this.getLatitude();
        double lat2 = coordinate.getLatitude();
        double long1 = this.getLongitude();
        double long2 = coordinate.getLongitude();

        if (lat1 > 90 || lat1 < -90 || lat2 > 90 || lat1 < -90) {
            throw new IllegalArgumentException("Latitude can only be between -90 and 90 degreees.");
        }
        else if (long1 > 180 || long1 < -180 || long2 > 180 || long2 < -180) {
            throw new IllegalArgumentException("Longitude can only be between -180 and 180 degrees.");
        }
        else {
            double dlon = long2 - long1;
            double dlat = lat2 - lat1;
            double a = Math.pow((Math.sin(dlat / 2)), 2) + Math.cos(lat1) * Math.cos(lat2) * Math.pow((Math.sin(dlon / 2)), 2);

            double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
            return 6373 * c; // R is the radius of the Earth
        }
    }

    public double getLatitudinalDistance(Coordinate coordinate) throws IllegalArgumentException {
        double lat1 = this.getLatitude();
        double lat2 = coordinate.getLatitude();
        if (lat1 > 90 || lat1 < -90 || lat2 > 90 || lat1 < -90) {
            throw new IllegalArgumentException("Latitude can only be between -90 and 90 degreees.");
        }
        else {
            return Math.abs(lat1 - lat2);
        }
    }

    public double getLongitudinalDistance(Coordinate coordinate) throws IllegalArgumentException {
        double long1 = this.getLongitude();
        double long2 = coordinate.getLongitude();
        if (long1 > 180 || long1 < -180 || long2 > 180 || long2 < -180) {
            throw new IllegalArgumentException("Longitude can only be between -180 and 180 degrees.");
        }
        else {
            return Math.abs(long1 - long2);
        }
    }
}

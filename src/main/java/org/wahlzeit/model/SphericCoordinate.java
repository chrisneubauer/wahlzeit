package org.wahlzeit.model;

/**
 * The class Coordinate adds location information to a photo
 * @author Christoph Neubauer
 */
public class SphericCoordinate extends AbstractCoordinate {
    private final double EARTH_RADIUS = 6371;

    public SphericCoordinate(double latitude, double longitude) {
        if (latitude > 90 || latitude < -90) {
            throw new IllegalArgumentException("Latitude can only be between -90 and 90 degreees.");

        }
        else if (longitude > 180 || longitude < -180) {
            throw new IllegalArgumentException("Longitude can only be between -180 and 180 degrees.");
        }
        else {
            this.latitude = latitude;
            this.longitude = longitude;
        }
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
     * @methodtype get
     */
    protected double getLongitude() {
        return this.longitude;
    }

    /**
     * @methodtype get
     */
    public double getLatitude() {
        return this.latitude;
    }

    /*
     * @methodtype set
     */
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    /*
     * @methodtype set
     */
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    /**
     * @methodtype get
     */
    @Override
    public double getX() {
        return EARTH_RADIUS * Math.sin(this.longitude) * Math.cos(this.latitude);
    }

    /**
     * @methodtype get
     */
    @Override
    public double getY() {
        return EARTH_RADIUS * Math.sin(this.longitude) * Math.sin(this.latitude);
    }

    /**
     * @methodtype get
     */
    @Override
    public double getZ() {
        return EARTH_RADIUS * Math.cos(this.longitude);
    }

    /*
     * @methodtype comparison
     */
    @Override
    public boolean isEqual(Coordinate coordinate) {
        if(!super.isEqual(coordinate)) {
            return false;
        }
        if (!(coordinate instanceof SphericCoordinate)) {
            return false;
        }
        SphericCoordinate sphericCoordinate = (SphericCoordinate) coordinate;
        if (Double.doubleToLongBits(latitude) != Double.doubleToLongBits(sphericCoordinate.latitude)) {
            return false;
        }
        else if (Double.doubleToLongBits(longitude) != Double.doubleToLongBits(sphericCoordinate.longitude)) {
            return false;
        }
        return true;
    }

    /**
     * @methodtype get
     */
    public double getLatitudinalDistance(SphericCoordinate coordinate) throws IllegalArgumentException {
        double lat1 = this.getLatitude();
        double lat2 = coordinate.getLatitude();
        if (lat1 > 90 || lat1 < -90 || lat2 > 90 || lat1 < -90) {
            throw new IllegalArgumentException("Latitude can only be between -90 and 90 degreees.");
        }
        else {
            return Math.abs(lat1 - lat2);
        }
    }

    /**
     * @methodtype get
     */
    public double getLongitudinalDistance(SphericCoordinate coordinate) throws IllegalArgumentException {
        double long1 = this.getLongitude();
        double long2 = coordinate.getLongitude();
        if (long1 > 180 || long1 < -180 || long2 > 180 || long2 < -180) {
            throw new IllegalArgumentException("Longitude can only be between -180 and 180 degrees.");
        }
        else {
            return Math.abs(long1 - long2);
        }
    }

    /*
     * @methodtype comparison
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        SphericCoordinate that = (SphericCoordinate) o;

        if (Double.compare(that.latitude, latitude) != 0 || Double.compare(that.longitude, longitude) != 0) {
            return false;
        }

        return true;
    }

    /*
     * @methodtype comparison
     */
    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(latitude);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(longitude);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}

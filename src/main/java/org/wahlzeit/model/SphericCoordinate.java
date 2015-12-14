package org.wahlzeit.model;

/**
 * The class Coordinate adds location information to a photo
 * @author Christoph Neubauer
 */
public class SphericCoordinate extends AbstractCoordinate {
    private final double EARTH_RADIUS = 6371;

    private SphericCoordinate(double latitude, double longitude) {
        if (latitude > 90 || latitude < -90) {
            throw new IllegalArgumentException("Latitude can only be between -90 and 90 degreees.");

        }
        else if (longitude > 180 || longitude < -180) {
            throw new IllegalArgumentException("Longitude can only be between -180 and 180 degrees.");
        }
        else {
            this.LATITUDE = latitude;
            this.LONGITUDE = longitude;
        }
    }
    /**
     *
     */
    public final double LATITUDE;

    /**
     *
     */
    public final double LONGITUDE;

    public static SphericCoordinate create(double lat, double lon) {
        return new SphericCoordinate(lat, lon);
    }
    /**
     * @methodtype get
     */
    protected double getLongitude() {
        return this.LONGITUDE;
    }

    /**
     * @methodtype get
     */
    public double getLatitude() {
        return this.LATITUDE;
    }

    /*
     * @methodtype set
     */
    public SphericCoordinate setLongitude(double longitude) {
        return new SphericCoordinate(getLatitude(), longitude);
    }

    /*
     * @methodtype set
     */
    public SphericCoordinate setLatitude(double latitude) {
        return new SphericCoordinate(latitude, getLongitude());
    }

    /**
     * @methodtype get
     */
    @Override
    public double getX() {
        return EARTH_RADIUS * Math.sin(this.LONGITUDE) * Math.cos(this.LATITUDE);
    }

    /**
     * @methodtype get
     */
    @Override
    public double getY() {
        return EARTH_RADIUS * Math.sin(this.LONGITUDE) * Math.sin(this.LATITUDE);
    }

    /**
     * @methodtype get
     */
    @Override
    public double getZ() {
        return EARTH_RADIUS * Math.cos(this.LONGITUDE);
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
        if (Double.doubleToLongBits(LATITUDE) != Double.doubleToLongBits(sphericCoordinate.LATITUDE)) {
            return false;
        }
        else if (Double.doubleToLongBits(LONGITUDE) != Double.doubleToLongBits(sphericCoordinate.LONGITUDE)) {
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

        if (Double.compare(that.LATITUDE, LATITUDE) != 0 || Double.compare(that.LONGITUDE, LONGITUDE) != 0) {
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
        temp = Double.doubleToLongBits(LATITUDE);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(LONGITUDE);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}

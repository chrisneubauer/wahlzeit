package org.wahlzeit.model;
/**
 * @COPYRIGHT (C) 2015 Schenker AG
 *
 * All rights reserved
 */

/**
 * TODO The class Coordinate is supposed to be documented...
 * @author Christoph
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
}

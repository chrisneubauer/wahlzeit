package org.wahlzeit.model;

/**
 * The class Coordinate is an interface for coordinates.
 * @author Christoph
 */
public interface Coordinate {
    public abstract double getDistance(Coordinate coordinate);
    public abstract boolean isEqual(Coordinate coordinate);
}

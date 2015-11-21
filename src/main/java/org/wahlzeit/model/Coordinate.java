package org.wahlzeit.model;

/**
 * The class Coordinate is an interface for coordinates.
 * @author Christoph
 */
public interface Coordinate {
    /*
     * @methodType get
     *
     * @precondition: requires a SphericCoordinate or CartesianCoordinate with values for x, y and z.
     * @postcondition: returns a distance between two coordinates as a double value.
     */
    public abstract double getDistance(Coordinate coordinate);

    /*
     * @methodType comparison
     *
     * @precondition: requires a SphericCoordinate or CartesianCoordinate to be compared with.
     * @postcondition: returns a boolean answer if the given coordinate is of same type and distance.
     */
    public abstract boolean isEqual(Coordinate coordinate);
}

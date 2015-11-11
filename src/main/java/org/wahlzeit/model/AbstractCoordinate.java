package org.wahlzeit.model;

/**
 * The class AbstractCoordinate contains general logic for coordinates.
 * @author Christoph
 */
public abstract class AbstractCoordinate implements Coordinate{
    /**
     * @methodtype get
     */
    public abstract double getX();

    /**
     * @methodtype get
     */
    public abstract double getY();

    /**
     * @methodtype get
     */
    public abstract double getZ();

    /**
     * @methodtype conversion
     */
    public CartesianCoordinate asCartesianCoordinate() {
        double x = this.getX();
        double y = this.getY();
        double z = this.getZ();

        return new CartesianCoordinate(x, y, z);
    }

    /**
     * @methodtype get
     */
    public double getDistance(Coordinate coordinate) {
        if(coordinate == null)
            throw new IllegalArgumentException("object given to getDistance-Method is null");

        CartesianCoordinate cartesianCoordinate = ((AbstractCoordinate) coordinate).asCartesianCoordinate();

        // always using cartesian system
        double x = this.getX();
        double y = this.getY();
        double z = this.getZ();
        double cartesianCoordinateX = cartesianCoordinate.getX();
        double cartesianCoordinateY = cartesianCoordinate.getY();
        double cartesianCoordinateZ = cartesianCoordinate.getZ();
        return Math.sqrt(Math.pow((cartesianCoordinateX - x),2) + Math.pow((cartesianCoordinateY - y),2) + Math.pow((cartesianCoordinateZ - z),2));
    }

    /**
     * @methodtype comparison
     */
    public boolean isEqual(Coordinate coordinate) {
        if (this == coordinate)
            return true;
        if (coordinate == null)
            return false;
        if(this.getDistance(coordinate) == 0.f)
            return true;
        return true;
    }
}

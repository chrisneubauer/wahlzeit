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
        // preconditions
        assert(coordinate != null);

        CartesianCoordinate cartesianCoordinate = ((AbstractCoordinate) coordinate).asCartesianCoordinate();


        // always using cartesian system
        double x = this.getX();
        double y = this.getY();
        double z = this.getZ();
        double cartesianCoordinateX = cartesianCoordinate.getX();
        double cartesianCoordinateY = cartesianCoordinate.getY();
        double cartesianCoordinateZ = cartesianCoordinate.getZ();

        double distance = Math.sqrt(Math.pow((cartesianCoordinateX - x),2) + Math.pow((cartesianCoordinateY - y),2) + Math.pow((cartesianCoordinateZ - z),2));

        // postcondition
        assert(distance >= 0.0);
        return distance;
    }

    /**
     * @methodtype comparison
     */
    public boolean isEqual(Coordinate coordinate) {
        // preconditions
        assert(coordinate != null);

        boolean isEqual = false;
        if (this == coordinate)
            isEqual = true;
        if (this.getDistance(coordinate) == 0.f)
            isEqual = true;

        return isEqual;
    }
}

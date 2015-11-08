package org.wahlzeit.model;

/**
 * The class Coordinate adds location information to a photo
 * @author Christoph Neubauer
 */
public class CartesianCoordinate implements Coordinate {

    public CartesianCoordinate(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    /**
     *
     */
    public double x;

    /**
     *
     */
    public double y;

    /*
     *
     */
    public double z;

    /**
     * @methodtype get
     */
    protected double getX() {
        return this.x;
    }

    /**
     * @methodtype get
     */
    public double getY() {
        return this.y;
    }

    /**
     * @methodtype get
     */
    public double getZ() {
        return this.z;
    }

    /*
     * @methodtype set
     */
    public void setX(double x) {
        this.x = x;
    }

    /*
     * @methodtype set
     */
    public void setY(double y) {
        this.y = y;
    }

    /*
     * @methodtype set
     */
    public void setZ(double z) {
        this.z = z;
    }

    /**
     * @methodtype get
     */
    public double getDistance(Coordinate coordinate) throws Exception {
        if (coordinate instanceof CartesianCoordinate) {
            double xAbs = Math.abs(this.getX() - ((CartesianCoordinate) coordinate).getX());
            double yAbs = Math.abs(this.getY() - ((CartesianCoordinate) coordinate).getY());
            double zAbs = Math.abs(this.getZ() - ((CartesianCoordinate) coordinate).getZ());

            double xSqr = xAbs * xAbs;
            double ySqr = yAbs * yAbs;
            double zSqr = zAbs * zAbs;

            return Math.sqrt(xSqr + ySqr + zSqr);
        }
        else
        {
            throw new Exception("Coordinate is not of type Cartesian Coordinate");
        }
    }
}

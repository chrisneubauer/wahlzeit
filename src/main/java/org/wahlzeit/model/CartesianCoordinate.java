package org.wahlzeit.model;

/**
 * The class Coordinate adds location information to a photo
 * @author Christoph Neubauer
 */
public class CartesianCoordinate extends AbstractCoordinate {

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

    /*
     * @methodtype constructor
     */
    public CartesianCoordinate(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    /**
     * @methodtype get
     */
    public double getX() {
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

    /*
     * @methodtype comparison
     */
    @Override
    public boolean isEqual(Coordinate coordinate) {
        if(!super.isEqual(coordinate))
            return false;
        if (!(coordinate instanceof CartesianCoordinate))
            return false;
        CartesianCoordinate cartesianCoordinate = (CartesianCoordinate) coordinate;
        if (Double.doubleToLongBits(x) != Double.doubleToLongBits(cartesianCoordinate.x)) {
            return false;
        }
        else if (Double.doubleToLongBits(y) != Double.doubleToLongBits(cartesianCoordinate.y)) {
            return false;
        }
        else if (Double.doubleToLongBits(z) != Double.doubleToLongBits(cartesianCoordinate.z)) {
            return false;
        }
        return true;
    }
}

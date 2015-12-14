package org.wahlzeit.model;

/**
 * The class Coordinate adds location information to a photo
 * @author Christoph Neubauer
 */
public class CartesianCoordinate extends AbstractCoordinate {

    /**
     *
     */
    public final double X;

    /**
     *
     */
    public final double Y;

    /*
     *
     */
    public final double Z;

    /*
     * @methodtype constructor
     */
    private CartesianCoordinate(double x, double y, double z) {
        this.X = x;
        this.Y = y;
        this.Z = z;
    }

    public static CartesianCoordinate create(double x, double y, double z) {
        return new CartesianCoordinate(x, y, z);
    }

    /*
     * @methodtype set
     */
    public CartesianCoordinate setX(double x) {
        return (CartesianCoordinate) getInstance(x, this.Y, this.Z);
    }

    /*
     * @methodtype set
     */
    public CartesianCoordinate setY(double y) {
        return (CartesianCoordinate) getInstance(this.X, y, this.Z);
    }

    /*
     * @methodtype set
     */
    public CartesianCoordinate setZ(double z) {
        return (CartesianCoordinate) getInstance(this.X, this.Y, z);
    }

    @Override
    public double getX() {
        return this.X;
    }

    @Override
    public double getY() {
        return this.Y;
    }

    @Override
    public double getZ() {
        return this.Z;
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
        if (Double.doubleToLongBits(X) != Double.doubleToLongBits(cartesianCoordinate.X)) {
            return false;
        }
        else if (Double.doubleToLongBits(Y) != Double.doubleToLongBits(cartesianCoordinate.Y)) {
            return false;
        }
        else if (Double.doubleToLongBits(Z) != Double.doubleToLongBits(cartesianCoordinate.Z)) {
            return false;
        }
        return true;
    }
}

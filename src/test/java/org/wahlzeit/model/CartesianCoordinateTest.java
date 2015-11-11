package org.wahlzeit.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * The class CoordinateTest tests calculation logic of the Coordinate.java class
 * @author Christoph Neubauer
 */
public class CartesianCoordinateTest {

    private CartesianCoordinate testCoords;
    private CartesianCoordinate testCoords2;
    private CartesianCoordinate testCoords3;

    @Before
    public void setUpCoordinate() {
        testCoords = new CartesianCoordinate(21.1, 54.234, 12);
        testCoords2 = new CartesianCoordinate(11.3, 140.11,11);
        testCoords3 = new CartesianCoordinate(210.1, 1554.234, 765);
    }

    @Test
    public void testCalculateDistance() throws Exception {
        double path = testCoords.getDistance(testCoords2);
        double pathReversed = testCoords2.getDistance(testCoords);

        Assert.assertEquals(86.43 , path, 0.9);
        Assert.assertEquals(path, pathReversed, 0.2);
    }

    @Test
    public void testCompareWithSphericCoordinate() {
        SphericCoordinate sc = new SphericCoordinate(12, 11);
        double result = testCoords3.getDistance(sc);
        Assert.assertEquals(5935, result, 0.2);
     }

    @Test
    public void testConversion() {
        double result = testCoords.getDistance(testCoords2);
        double result2 = testCoords.getDistance(testCoords2.asCartesianCoordinate());
        double result3 = testCoords.asCartesianCoordinate().getDistance(testCoords2.asCartesianCoordinate());

        Assert.assertEquals(result, result2, 0.2);
        Assert.assertEquals(result, result3, 0.2);
        Assert.assertEquals(result2, result3, 0.2);
    }
}

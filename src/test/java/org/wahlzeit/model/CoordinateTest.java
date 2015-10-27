package org.wahlzeit.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * The class CoordinateTest tests calculation logic of the Coordinate.java class
 * @author Christoph Neubauer
 */
public class CoordinateTest {

    private Coordinate testCoords;
    private Coordinate testCoords2;
    private Coordinate testCoords3;
    private Coordinate testCoords4;

    @Before
    public void setUpCoordinate() {
        testCoords = new Coordinate(21.1, 54.234);
        testCoords2 = new Coordinate(11.3, 140.11);
        testCoords3 = new Coordinate(210.1, 1554.234);
        testCoords4 = new Coordinate(-211.3, 240.11);
    }
    @Test
    public void testLatitudinalDistance() {
        double path = testCoords.getLatitudinalDistance(testCoords2);
        double pathReversed = testCoords2.getLatitudinalDistance(testCoords);

        Assert.assertEquals(9.8, path, 0.2);
        Assert.assertEquals(path, pathReversed, 0.2);
    }

    @Test
    public void testLongitudinalDistance() {
        double path = testCoords.getLongitudinalDistance(testCoords2);
        double pathReversed = testCoords2.getLongitudinalDistance(testCoords);

        Assert.assertEquals(85.876, path, 0.2);
        Assert.assertEquals(path, pathReversed, 0.2);
    }

    @Test
    public void testCalculateDistance() {
        double path = testCoords.getDistance(testCoords2);
        double pathReversed = testCoords2.getDistance(testCoords);

        Assert.assertEquals(14509.90, path, 0.9);
        Assert.assertEquals(path, pathReversed, 0.2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCalculateDistanceException() {
        double path = testCoords3.getDistance(testCoords4);
        double pathReversed = testCoords4.getDistance(testCoords3);

        Assert.assertEquals(16526.99, path, 0.9);
        Assert.assertEquals(path, pathReversed, 0.2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testLongitudinalDistanceException() {
        double path = testCoords3.getLongitudinalDistance(testCoords4);
        double pathReversed = testCoords4.getLongitudinalDistance(testCoords3);

        Assert.assertEquals(1314.12, path, 0.2);
        Assert.assertEquals(path, pathReversed, 0.2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testLatitudinalDistanceException() {
        double path = testCoords3.getLatitudinalDistance(testCoords4);
        double pathReversed = testCoords4.getLatitudinalDistance(testCoords3);

        Assert.assertEquals(9.8, path, 0.2);
        Assert.assertEquals(path, pathReversed, 0.2);
    }
}

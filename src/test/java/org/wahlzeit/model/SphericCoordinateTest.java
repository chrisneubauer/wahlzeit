package org.wahlzeit.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * The class CoordinateTest tests calculation logic of the Coordinate.java class
 * @author Christoph Neubauer
 */
public class SphericCoordinateTest {

    private SphericCoordinate testCoords;
    private SphericCoordinate testCoords2;
    private SphericCoordinate testCoords3;
    private SphericCoordinate testCoords4;

    @Before
    public void setUpCoordinate() {
        testCoords = SphericCoordinate.create(21.1, 54.234);
        testCoords2 = SphericCoordinate.create(11.3, 140.11);
        testCoords3 = SphericCoordinate.create(81.1, 154.234);
        testCoords4 = SphericCoordinate.create(-89.3, 20.11);
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
    public void testCalculateDistance() throws Exception {
        double path = testCoords.getDistance(testCoords2);
        double pathReversed = testCoords2.getDistance(testCoords);

        Assert.assertEquals(3392, path, 0.9);
        Assert.assertEquals(path, pathReversed, 0.2);
    }

    @Test
    public void testCalculateDistanceException() throws Exception {
        double path = testCoords3.getDistance(testCoords4);
        double pathReversed = testCoords4.getDistance(testCoords3);

        Assert.assertEquals(11014, path, 0.9);
        Assert.assertEquals(path, pathReversed, 0.2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testLongitudinalDistanceException() {
        SphericCoordinate wrongCoordinate = SphericCoordinate.create(100,0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testLatitudinalDistanceException() {
        SphericCoordinate wrongCoordinate = SphericCoordinate.create(0,200);
    }

    @Test
    public void testCompareWithCartesianCoordinate() throws Exception {
        CartesianCoordinate cc = CartesianCoordinate.create(12, 11, 10);
        testCoords3.getDistance(cc);
    }
}

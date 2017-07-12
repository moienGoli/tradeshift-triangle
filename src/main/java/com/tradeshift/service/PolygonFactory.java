package com.tradeshift.service;

import com.tradeshift.domain.Polygon;
import com.tradeshift.exception.AppException;

/**
 * Factory class with static method.
 * Is responsible for creating a polygon based on number of sides.
 *
 * Created by moien on 7/11/17.
 */

public class PolygonFactory {

    //adding private constructor to hide the implicit public one
    private PolygonFactory() {
    }

    /**
     * Creates a polygon based on number of sides if the input array:
     * 1: has at least three sides.
     * 2: has no negative or zero value
     * 3: violates no specific geometry rule e.g 'Triangle Inequality'
     *
     * @param sides an array of integers, each representing a length of a side of a polygon
     * @return based on number of sides a polygon will be returned in it's original type
     * @throws AppException if any of the mentioned triplet rules violated
     */
    public static Polygon create(double... sides){

        if (!isValidPolygon(sides)) {
            throw new AppException("Invalid polygon");
        }

        if (sides.length == 3) {
            return create(new TriangleCreator(), sides);
        } else {
            throw new AppException("Polygons with more than three sides are 'Not Implemented' yet");
        }
    }

    private static boolean isValidPolygon(double... sides) {

        return sides.length >= 3 && isAllSidesGreaterThanZero(sides);

    }

    private static boolean isAllSidesGreaterThanZero(double... sides) {

        for (double side : sides) {
            if (side <= 0)
                return false;
        }
        return true;
    }

    private static Polygon create(PolygonCreateStrategy creator, double... sides) {

        return creator.create(sides);
    }

}

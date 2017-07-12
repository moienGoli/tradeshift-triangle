package com.tradeshift.service;

import com.tradeshift.domain.*;
import com.tradeshift.exception.AppException;

/**
 * The instances of this class will create a triangle in it's original type.
 * Depending on the input array of sides the actual type of the triangle will be determined
 * <p/>
 * Created by moien on 7/12/17.
 */

public class TriangleCreator implements PolygonCreateStrategy {

    /**
     *
     * @param sides the first three elements of input array will be considered as triangle sides.
     * @return the exact triangle type. it could be Equilateral, Isosceles or Scalene otherwise AppException will be thrown.
     */
    public Polygon create(double... sides) {

        TriangleType triangleType = classifyTriangle(sides[0], sides[1], sides[2]);

        switch (triangleType) {
            case EQUILATERAL:
                return new Equilateral(sides[0], sides[1], sides[2]);
            case ISOSCELES:
                return new Isosceles(sides[0], sides[1], sides[2]);
            case SCALENE:
                return new Scalene(sides[0], sides[1], sides[2]);
            default:
                throw new AppException("Undefined/Unimplemented triangle type");
        }
    }

    private TriangleType classifyTriangle(double a, double b, double c) {

        if (a >= b + c || c >= b + a || b >= a + c) {
            throw new AppException("Triangle inequality violation");
        } else if (a == b && b == c) {
            return TriangleType.EQUILATERAL;
        } else if (b == c || a == b || c == a) {
            return TriangleType.ISOSCELES;
        } else {
            return TriangleType.SCALENE;
        }
    }
}

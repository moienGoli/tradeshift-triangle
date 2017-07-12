package com.tradeshift.domain;

/**
 * This class represents a triangle with two equal sides
 *
 * Created by moien on 7/11/17.
 */
public class Isosceles extends Triangle {

    public Isosceles(double sideA, double sideB, double sideC) {
        super(sideA, sideB, sideC);
    }

    @Override
    public TriangleType getType() {
        return TriangleType.ISOSCELES;
    }
}

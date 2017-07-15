package com.tradeshift.model;

/**
 * This class represents a triangle with three equal sides
 *
 * Created by moien on 7/11/17.
 */
public class Equilateral extends Triangle {

    Equilateral(double sideA, double sideB, double sideC) {
        super(sideA, sideB, sideC);
    }

    @Override
    public TriangleType getType() {
        return TriangleType.EQUILATERAL;
    }
}

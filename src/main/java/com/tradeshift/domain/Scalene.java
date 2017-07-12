package com.tradeshift.domain;

/**
 * This class represents a triangle with no equal sides
 *
 * Created by moien on 7/11/17.
 */
public class Scalene extends Triangle {

    public Scalene(double sideA, double sideB, double sideC) {
        super(sideA, sideB, sideC);
    }

    @Override
    public TriangleType getType() {
        return TriangleType.SCALENE;
    }
}

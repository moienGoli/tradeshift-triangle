package com.tradeshift.domain;

import java.util.ArrayList;

/**
 * Abstract superclass for different triangle types.
 * <p/>
 * Created by moien on 7/11/17.
 */
public abstract class Triangle extends Polygon {

    Triangle(double sideA, double sideB, double sideC) {

        sides = new ArrayList<>(3);
        sides.add(sideA);
        sides.add(sideB);
        sides.add(sideC);
    }

    public abstract TriangleType getType();

    public String toString() {
        return "A triangle with sides: [" + this.sides.get(0) +
                ", " + this.sides.get(1) + ", " + this.sides.get(2) + "] is " + this.getType();
    }
}

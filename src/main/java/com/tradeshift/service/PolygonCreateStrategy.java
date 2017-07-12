package com.tradeshift.service;

import com.tradeshift.domain.Polygon;

/**
 * The implementor is responsible of actually instantiating a subclass of Polygon based on the input array of sides
 *
 * Created by moien on 7/12/17.
 */
public interface PolygonCreateStrategy {

    Polygon create(double... sides);
}

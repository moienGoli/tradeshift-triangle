package com.tradeshift.model;

import java.util.List;

/**
 * It is being used simply as a common extension point
 * <p/>
 * Created by moien on 7/11/17.
 */
public abstract class Polygon {

    //Although it seems to be unnecessary and not a big deal, but you may consider converting these double values to BigDecimal.
    //Refer to this article for more info https://blogs.oracle.com/corejavatechtips/the-need-for-bigdecimal
    List<Double> sides;

}

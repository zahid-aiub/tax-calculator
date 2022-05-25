/**
 *
 */
package com.zahid.tax.utils;

import java.text.DecimalFormat;

public class MathHelper {
    private static final double ROUND_OFF = 0.05;

    /**
     * Rounds off a double value to the nearest 0.05
     */
    public static double roundoff(double value) {
        return (int) (value / ROUND_OFF + 0.5) * 0.05;
    }

    /**
     * Truncates a double value to two decimal places.
     */
    public static double truncate(double value) {
        String result = new DecimalFormat("0.00").format(value);
        return Double.parseDouble(result);
    }
}

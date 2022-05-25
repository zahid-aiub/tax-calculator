/**
 *
 */
package com.zahid.tax.utils;

import java.text.DecimalFormat;

public class MathHelper {
    private static final double ROUND_VALUE = 0.05;
    public static double roundOff(double value) {
        return (int) (value / ROUND_VALUE + 0.5) * 0.05;
    }
    public static double truncate(double value) {
        String result = new DecimalFormat("0.00").format(value);
        return Double.parseDouble(result);
    }
}

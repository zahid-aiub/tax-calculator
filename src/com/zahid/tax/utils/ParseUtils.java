package com.zahid.tax.utils;

public class ParseUtils {

    public static boolean parseBoolean(String value) {
        boolean result;

        if (value.equalsIgnoreCase("Y")) {
            result = true;
        } else if (value.equalsIgnoreCase("N")) {
            result = false;
        } else {
            throw new IllegalArgumentException("Invalid input! Please insert a correct input.");
        }
        return result;
    }

}

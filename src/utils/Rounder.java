package utils;

import java.text.DecimalFormat;

/**
 * @author Ihor Soldatenko
 * @version 1.0.0
 */

public class Rounder {
    public static String roundValue(double value) {
        DecimalFormat df = new DecimalFormat("0.00");
        return df.format(value);
    }
}

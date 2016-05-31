/**
 * The corejava package contains simple, useful core Java classes I am likely to
 * use again
 */
package com.ffwhite.corejava;

import java.util.Random;

/**
 * @author forest white
 * Dice generates a random integer from a minimum integer to a maximum integer inclusive. 
 * TODO: Not yet serialized, so not safe for
 * concurrent access.
 */
public class Dice {

    private static final Random generator = new Random();

    public static int nextRoll(int min, int max) {
        return min + generator.nextInt(max - min + 1);
    }
}
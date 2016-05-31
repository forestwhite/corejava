/**
 * The corejava package contains simple, useful core Java classes I am likely to
 * use again
 */
package com.ffwhite.corejava;

import java.util.Random;

/**
 * @author forest white
 * Dice generates random integers like dice 
 * TODO: Not yet serialized, so not safe for concurrent access.
 */
public class Dice {

    private static final Random generator = new Random();

    /**
     * Returns the result of one die roll that has an equal chance of resulting
     * in a number between the minimum and maximum values, inclusive.
     * @param min minimum number on the die, inclusive
     * @param max maximum number on the die, inclusive
     * @return result of one roll
     */
    public static int roll(int min, int max) {
        return min + generator.nextInt(max - min + 1);
    }
}
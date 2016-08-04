/**
 * The corejava package contains simple, useful core Java classes I am likely to
 * use again
 */
package com.ffwhite.corejava;

import java.util.Random;

/**
 * Dice generates random integers in a fashion similar to dice.
 * 
 * @author forest white
 * TODO: Not yet serialized, so not safe for concurrent rolling.
 */
public class Dice {

    private static final Random generator = new Random();

    /**
     * Returns the result of one die roll that has an equal chance of resulting
     * in a number between the minimum and maximum values, inclusive.
     * 
     * @param min minimum number on the die, inclusive
     * @param max maximum number on the die, inclusive
     * @return result of one roll
     */
    public static int roll(int min, int max) {
        try{
            return min + generator.nextInt(max - min + 1);
        }
        catch(IllegalArgumentException e){
            System.out.println("max must be greater than min for die roll.");
            return 0;
        }
    }
}
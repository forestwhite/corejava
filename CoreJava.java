/**
 * The corejava package contains simple, useful core Java classes I am likely to
 * use again
 */
package com.ffwhite.corejava;

import java.time.LocalDate;
import java.util.Arrays;

/**
 * Demonstrates the functionality of the corejava classes.
 *
 * @author forest white
 *
 */
public class CoreJava {

    /**
     * main method demonstrates each class in the corejava package
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int result = Dice.roll(1, 6);
        System.out.println("Your roll was " + result + ".");
        System.out.println("This month's calendar:");
        Cal thismonth = new Cal();
        thismonth.printCal();
        System.out.println("Calendar for an older date:");
        Cal oldMonth = new Cal(9, 1752);
        oldMonth.printCal();
        System.out.println("For all 0 coefficients, quadratic formula result: "
            + Arrays.toString(new QuadraticEquation().getRoots()));
        System.out.println("For a 0 first coefficient, x = "
            + Arrays.toString(QuadraticEquation.getRoots(0,4,5)));
        System.out.println("For a difference of squares, x = "
            + Arrays.toString(QuadraticEquation.getRoots(1,0,-2)));
        System.out.println("For real roots, x = "
            + Arrays.toString(QuadraticEquation.getRoots(1,-3,1)));
        System.out.println("For complex roots, quadratic formula result: "
            + Arrays.toString(QuadraticEquation.getRoots(5,1,5)));
        System.out.println("All the prime numbers up to 100 are: "
            + Arrays.toString(PrimeCalculator.getPrimes(100)));
    }
}

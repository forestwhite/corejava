/**
 * The corejava package contains simple, useful core Java classes I am likely to
 * use again
 */
package com.ffwhite.corejava;

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
        int result = Dice.roll(1,6);
        System.out.println("Your roll was " + result + ".");
        System.out.println("This month's calendar:");
        Cal thismonth = new Cal();
        thismonth.printCal();
        System.out.println("Calendar for an older date:");
        Cal oldMonth = new Cal(9,1752);
        oldMonth.printCal();
    }
    
}
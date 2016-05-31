/**
 * The corejava package contains simple, useful core Java classes I am likely to
 * use again
 */
package com.ffwhite.corejava;

/**
 *
 * @author forest white
 */
public class CoreJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int result = Dice.roll(1,6);
        System.out.println("Your roll was " + result + ".");
    }
    
}
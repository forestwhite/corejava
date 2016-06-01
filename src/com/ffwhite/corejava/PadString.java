/**
 * The corejava package contains simple, useful core Java classes I am likely to
 * use again
 */
package com.ffwhite.corejava;

/**
 * StringPadding provides some static utility classes to pad strings
 * @author forest
 */
public class PadString {

    /**
     * Adds white space to the right end of a string until string is length n
     * @param s input string to which to add padding
     * @param n full length of the output string
     * @return string with padding on the right
     */
    public static String padRight(String s, int n) {
        return String.format("%1$-" + n + "s", s);
    }

    /**
     * Adds white space to the left end of a string  until string is length n
     * @param s input string to which to add padding
     * @param n full length of the output string
     * @return string with padding on the left
     */
    public static String padLeft(String s, int n) {
        return String.format("%1$" + n + "s", s);
    }
}

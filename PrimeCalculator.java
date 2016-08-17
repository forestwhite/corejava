/**
 * The corejava package contains simple, useful core Java classes I am likely to
 * use again
 */
package com.ffwhite.corejava;

import java.util.ArrayList;
import java.util.List;

/**
 * Computes all prime numbers less than or equal to n using the Sieve of
 * Eratosthenes. Efficient up to 10 million, but will accept an integer up to
 * the maximum integer value ~2.1 billion.
 *
 * @author forest
 */
public class PrimeCalculator {
    private boolean[] sieve;
    
    /**
     * PrimeCalculator constructor with no arguments
     */
    public PrimeCalculator(){}
    
    /**
     * PrimeCalculator constructor with upper bound
     * 
     * @param max value for which primes are less than or equal to.
     */
    public PrimeCalculator(int max){
        sieve = PrimeCalculator.getSieve(max);
    }
    
    /**
     * Returns the current sieve
     * 
     * @return current sieve of prime indexes
     */
    public boolean[] getSieve(){
        boolean[] temp = sieve;
        return temp;
    }
    
    /**
     * Creates sieve of all prime numbers up to max value as a boolean array, 
     * where true indicates a prime number index and false indicates a non-prime
     * index number.
     * 
     * @param max value for which primes are less than or equal to.
     * @return array of booleans where true indicates a prime number index
     */
    public static boolean[] getSieve(int max) {
        if (max < 0) {
            throw new IllegalArgumentException("max cannot be less than zero: " + max);
        }
        boolean[] sieve = new boolean[max]; //defaults to false
        sieve[2] = true;
        //2 is the only prime number, so only set odd sieve members to true
        for (int i = 3; i < max; i += 2) {
            sieve[i] = true;
        }
        int limit = (int) Math.sqrt(max);
        //because all non-2 primes are odd, skip checking even numbers
        for (int i = 3; i < limit; i += 2) {
            if (sieve[i] == true) {
                //all multiples of i, except i, are not prime
                for (int j = i + i; j < max; j = j + i) {
                    sieve[j] = false;
                }
            }
        }
        return sieve;
    }

    /**
     * Returns an array of all prime numbers as defined the current sieve as an 
     * array of ints.
     * 
     * @return array of prime numbers as defined by the current sieve
     */
    public int[] getPrimes(){
        List<Integer> primes = new ArrayList<>();
        for(int i = 1; i<sieve.length; i++)
            if (sieve[i] == true)
                primes.add(i);
        return primes.stream().filter(i -> i != null).mapToInt(i -> i).toArray();   
    }

    /**
     * Creates an array of all prime numbers up to max value, inclusive, as an
     * array of ints. Zero and one are not prime numbers.
     * 
     * @param max value for which primes are less than or equal to.
     * @return array of prime numbers less than or equal to max
     */
    public static int[] getPrimes(int max) {
        if (max < 0) {
            throw new IllegalArgumentException("max cannot be less than zero: " + max);
        }
        boolean[] sieve = new boolean[max]; //defaults to false
        sieve[2] = true;
        List<Integer> primes = new ArrayList<>();
        primes.add(2);
        //2 is the only prime number, so only set odd sieve members to true
        for (int i = 3; i < max; i += 2) {
            sieve[i] = true;
        }
        //because all non-2 primes are odd, skip checking even numbers
        for (int i = 3; i < max; i += 2) {
            if (sieve[i] == true) {
                primes.add(i);
                //all multiples of i, except i, are not prime
                for (int j = i + i; j < max; j = j + i) {
                    sieve[j] = false;
                }
            }
        }
        return primes.stream().filter(i -> i != null).mapToInt(i -> i).toArray();
    }
}

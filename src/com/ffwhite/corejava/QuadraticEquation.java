/**
 * The corejava package contains simple, useful core Java classes I am likely to
 * use again
 */
package com.ffwhite.corejava;

/**
 * QuadraticEquation is a container for a quadratic equation with integer
 * coefficients. Roots are calculated only when requested, not when exponents
 * change.
 * @author forest
 */
public class QuadraticEquation {
    private int a, b, c;
    private double[] roots;
    
   /**
    * default constructor, all coefficients and roots are 0
    */
    QuadraticEquation(){
    }
    
   /**
    * constructor that accepts three integer coefficients
    * @param a coefficient of the variable squared term
    * @param b coefficient of the monomial variable term
    * @param c constant coefficient of unity
    */
    QuadraticEquation(int a, int b, int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    
   /**
    * mutator that chaanges all three integer coefficients
    * @param a coefficient of the variable squared term
    * @param b coefficient of the monomial variable term
    * @param c constant coefficient of unity
    */
    public void setCoefficients(int a, int b, int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    
    public double[] getRoots(){
        roots = getRoots(a,b,c);
        return roots;
    }
    
    /*
    * Calculates the roots for a quadratic equation defined by three integer
    * coefficients.
    * @param a coefficient of the variable squared term
    * @param b coefficient of the monomial variable term
    * @param c constant coefficient of unity
    * @return basis of the quadratic equation in an array of doubles
    * <ul><li>2 NaN constants if both variable exponents are zero, indicating 
    * no solution</li>
    * <li>2 doubles for real roots, including the case when exponent a is 
    * zero and there is actually one root.</li>
    * <li>3 doubles for complex roots, where first double is the common real 
    * part of the root </li>
    * </ul>
    */
    public static double[] getRoots(int a, int b, int c){
        double[] roots;
        if (a==0){
            roots = new double[]{-(double)c/b,-(double)c/b};
            return roots;
        }
        double discriminant = getDiscriminant(a,b,c);
        if(discriminant < 0){
            roots = new double[]{
                    -(double)b/(2*a),
                    -java.lang.Math.sqrt(java.lang.Math.abs(discriminant))/(2*a),
                    java.lang.Math.sqrt(java.lang.Math.abs(discriminant))/(2*a)
                };
        }
        else{
            roots = new double[]{(-b-java.lang.Math.sqrt(discriminant))/(2*a),
                (-b+java.lang.Math.sqrt(discriminant))/(2*a)};
        }
        return roots;
    }

    /*
    * Calculates the discriminant for a quadratic equation defined by three 
    * integer exponents.
    * @param a exponent of the variable squared term
    * @param b exponent of the monomial variable term
    * @param c constant exponent of unity
    * @return signed double discriminate value
    */
    public static double getDiscriminant(int a, int b, int c){
        return (double)java.lang.Math.pow(b, 2)-4*a*c; 
        // cast applies to first term, changes result
    }
}

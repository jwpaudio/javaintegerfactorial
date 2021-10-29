// ****************************************************************
// MathUtils.java
//
// Provides static mathematical utility functions.
//
// ****************************************************************

package com.joshuapardridge.throwingexceptions;

public class MathUtils {

//-------------------------------------------------------------
// Returns the factorial of the argument given
//-------------------------------------------------------------


    public static int factorial(int n) throws IllegalArgumentException
    {
        if(n<=0){
            IllegalArgumentException error = new IllegalArgumentException("You must enter a positive number");
            throw error;
        }
        else if(n>12){
            IllegalArgumentException error = new IllegalArgumentException("You cannot enter a number greater than 12");
            throw error;
        }
        else {
            int fac = 1;
            for (int i = n; i > 0; i--)
                fac *= i;
            return fac;
        }
    }
}

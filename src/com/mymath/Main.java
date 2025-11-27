/**
 * Java program to demonstrate Math.sqrt(a).
 */

package com.mymath;

import static java.lang.Double.*;

/**
 * Main class.
 */
public class Main {

    // Main method to run java program
    public static void main(String[] args) {

        // Creating numeric variable
        double number = NaN;

        // Finding root of number and printing result to console
        System.out.println(Math.sqrt(number)); // Output: Nan

        number = -0;

        // Finding root of number and printing result to console
        System.out.println(Math.sqrt(number)); // Output: 0.0

        number = 0;

        // Finding root of number and printing result to console
        System.out.println(Math.sqrt(number)); // Output: 0.0

        number = NEGATIVE_INFINITY;

        // Finding root of number and printing result to console
        System.out.println(Math.sqrt(number)); // Output: NaN

        number = POSITIVE_INFINITY;

        // Finding root of number and printing result to console
        System.out.println(Math.sqrt(number)); // Output: Infinity

        number = 9;

        // Finding root of number and printing result to console
        System.out.println(Math.sqrt(number)); // Output: 3.0

        number = -9;

        // Finding root of number and printing result to console
        System.out.println(Math.sqrt(number)); // Output: NaN

    }
}
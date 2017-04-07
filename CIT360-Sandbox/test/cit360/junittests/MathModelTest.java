/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360.junittests;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Philip
 */
public class MathModelTest {

     /**
     * Test of add method, of class MathModel.
     */
    @Test
    public void testAdd() {
        System.out.println("add test cases");

        /*******************
         * Test case #1
         *******************/

        System.out.println("\tTest case #1");
        double num1 = 1.0;
        double num2 = 2.0;
        MathModel instance = new MathModel();
        Double expResult = 3.0;
        Double result = instance.add(num1, num2);
        assertEquals(expResult, result);

        /*******************
         * Test case #2
         *******************/

        System.out.println("\tTest case #2");
        num1 = 2.2;
        num2 = 3.3;
        //MathModel instance = new MathModel();
        expResult = 5.5;
        result = instance.add(num1, num2);
        assertEquals(expResult, result);
    }

    /**
     * Test of subtract method, of class MathModel.
     */
    @Test
    public void testSubtract() {
        System.out.println("subtract test cases");

        /*******************
         * Test case #1
         *******************/

        System.out.println("\tTest case #1");
        double num1 = 7.0;
        double num2 = 2.0;
        MathModel instance = new MathModel();
        Double expResult = 5.0;
        Double result = instance.subtract(num1, num2);
        assertEquals(expResult, result);

        /*******************
         * Test case #2
         *******************/

        System.out.println("\tTest case #2");
        num1 = 4.0;
        num2 = 1.1;
        //MathModel instance = new MathModel();
        expResult = 2.9;
        result = instance.subtract(num1, num2);
        assertEquals(expResult, result);
    }

    /**
     * Test of multiply method, of class MathModel.
     */
    @Test
    public void testMultiply() {
        System.out.println("multiply test cases");

        /*******************
         * Test case #1
         *******************/

        System.out.println("\tTest case #1");
        double num1 = 5.0;
        double num2 = 11.0;
        MathModel instance = new MathModel();
        Double expResult = 55.0;
        Double result = instance.multiply(num1, num2);
        assertEquals(expResult, result);

        /*******************
         * Test case #2
         *******************/

        System.out.println("\tTest case #2");
        num1 = 2.1;
        num2 = 5.5;
        //MathModel instance = new MathModel();
        expResult = 11.55;
        result = instance.multiply(num1, num2);
        assertEquals(expResult, result);
    }

    /**
     * Test of divide method, of class MathModel.
     */
    @Test
    public void testDivide() {
        System.out.println("divide test cases");

        /*******************
         * Test case #1
         *******************/

        System.out.println("\tTest case #1");
        double num1 = 55.0;
        double num2 = 11.0;
        MathModel instance = new MathModel();
        Double expResult = 5.0;
        Double result = instance.divide(num1, num2);
        assertEquals(expResult, result);

        /*******************
         * Test case #2
         *******************/

        System.out.println("\tTest case #2");
        num1 = 7.0;
        num2 = 2.5;
        //MathModel instance = new MathModel();
        expResult = 2.8;
        result = instance.divide(num1, num2);
        assertEquals(expResult, result);
    }

}

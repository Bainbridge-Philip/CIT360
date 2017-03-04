/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360.applicationcontroller;

/**
 *
 * @author Philip
 */
public class MathModel {

    public Double add(double num1, double num2) {
        double result = num1 + num2;
        return result;
    }

    public Double subtract(double num1, double num2) {
        double result = num1 - num2;
        return result;
    }

    public Double multiply(double num1, double num2) {
        double result = num1 * num2;
        return result;
    }

    public Double divide(double num1, double num2) {
        double result = num1 / num2;
        return result;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360.acp2;

/**
 *
 * @author Philip
 */
public class MultiplicationView implements MathView {
    @Override
     public void show(String num1, String num2, String result) {
        System.out.println("The product of " + num1 + " multiplied by " + num2 + " is " + result + ".");
    }
}
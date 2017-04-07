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
class ErrorView implements MathView {
    @Override
    public void show(String num1, String num2, String operator) {
        System.out.println("Unkown operator " + operator + ".  I don't know what to do with the numbers " + num1 + " and " + num2 + ".");
    }
}

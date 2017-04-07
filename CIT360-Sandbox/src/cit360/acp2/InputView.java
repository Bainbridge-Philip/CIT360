/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360.acp2;

import cit360.MVC.*;
import java.util.Scanner;

/**
 *
 * @author Philip
 */
public class InputView {

    public String[] getInput() {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        String num1 = input.next();

        System.out.print("Enter the second number: ");
        String num2 = input.next();

        System.out.print("Enter an operator (+, -, *, /): ");
        String operator = input.next();

        String[] results = {num1, num2, operator};
        
        return results;

    }
}


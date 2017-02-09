/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360.applicationcontroller;

import java.util.Scanner;

/**
 *
 * @author Philip
 */
public class FrontController {

    public void getInput() {

        Double result;
        ApplicationController appController = new ApplicationController();
        MathModel mModel = new MathModel();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        String num1 = input.next();

        System.out.print("Enter the second number: ");
        String num2 = input.next();

        System.out.print("Enter an operator (+, -, *, /): ");
        String operator = input.next();

        String operation = appController.getOperation(operator);

        switch(operation) {
            case "add" :
                AdditionView aView = new AdditionView();
                result = mModel.add(Double.parseDouble(num1), Double.parseDouble(num2));
                aView.show(num1, num2, result.toString());
                break;
            case "subtract" :
                SubtractionView sView = new SubtractionView();
                result = mModel.subtract(Double.parseDouble(num1), Double.parseDouble(num2));
                sView.show(num1, num2, result.toString());
                break;
            case "multiply" :
                MultiplicationView mView = new MultiplicationView();
                result = mModel.multiply(Double.parseDouble(num1), Double.parseDouble(num2));
                mView.show(num1, num2, result.toString());
                break;
            case "divide" :
                DivisionView dView = new DivisionView();
                result = mModel.divide(Double.parseDouble(num1), Double.parseDouble(num2));
                dView.show(num1, num2, result.toString());
                break;
            case "unkown" :
                ErrorView eView = new ErrorView();
                eView.show(num1, num2, operator);
                break;
        }


    }
}


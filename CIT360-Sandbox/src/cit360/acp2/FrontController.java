/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360.acp2;

import java.util.Scanner;

/**
 *
 * @author Philip
 */
public class FrontController {

    public String getOperation(String operator) {

        String operation;

        switch(operator) {
            case "+" :
                operation = "add";
                break;
            case "-" :
                operation = "subtract";
                break;
            case "*" :
                operation = "multiply";
                break;
             case "/" :
                operation = "divide";
                break;
            default :
                operation = "unkown";
                break;
        }

        return operation;
    }

    public void run() {

        Double result;
        InputView iView = new InputView();
        MathModel mModel = new MathModel();

        String[] inputs = iView.getInput();

        Double num1 = Double.parseDouble(inputs[0]);
        Double num2 = Double.parseDouble(inputs[1]);
        String operator = inputs[2];

        String operation = getOperation(operator);

        ApplicationController aController = new ApplicationController();

        switch(operation) {
            case "add" :
                result = mModel.add(num1, num2);
                aController.dispatchRequest(operation, inputs[0], inputs[1], result.toString());
                break;
            case "subtract" :
                result = mModel.subtract(num1, num2);
                aController.dispatchRequest(operation, inputs[0], inputs[1], result.toString());
                break;
            case "multiply" :
                result = mModel.multiply(num1, num2);
                aController.dispatchRequest(operation, inputs[0], inputs[1], result.toString());
                break;
            case "divide" :
                result = mModel.divide(num1, num2);
                aController.dispatchRequest(operation, inputs[0], inputs[1], result.toString());
                break;
            case "unkown" :
                aController.dispatchRequest(operation, inputs[0], inputs[1], operator);
                break;
        }
    }
}


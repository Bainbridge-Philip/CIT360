/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360.MVC;

/**
 *
 * @author Philip
 */
public class ApplicationController {

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

        switch(operation) {
            case "add" :
                AdditionView aView = new AdditionView();
                result = mModel.add(num1, num2);
                aView.show(inputs[0], inputs[1], result.toString());
                break;
            case "subtract" :
                SubtractionView sView = new SubtractionView();
                result = mModel.subtract(num1, num2);
                sView.show(inputs[0], inputs[1], result.toString());
                break;
            case "multiply" :
                MultiplicationView mView = new MultiplicationView();
                result = mModel.multiply(num1, num2);
                mView.show(inputs[0], inputs[1], result.toString());
                break;
            case "divide" :
                DivisionView dView = new DivisionView();
                result = mModel.divide(num1, num2);
                dView.show(inputs[0], inputs[1], result.toString());
                break;
            case "unkown" :
                ErrorView eView = new ErrorView();
                eView.show(inputs[0], inputs[1], operator);
                break;
        }
    }
}
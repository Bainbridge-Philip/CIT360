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
public class ApplicationController {

    String operation;

    public String getOperation(String operator) {
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
}
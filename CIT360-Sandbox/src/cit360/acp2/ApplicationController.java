/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360.acp2;

import java.util.HashMap;

/**
 *
 * @author Philip
 */
public class ApplicationController {

    private HashMap<String,MathView> mViews = new HashMap();

    public ApplicationController() {

        mViews.put("add", new AdditionView());
        mViews.put("subtract", new SubtractionView());
        mViews.put("multiply", new MultiplicationView());
        mViews.put("divide", new DivisionView());
        mViews.put("unkown", new ErrorView());

    }

    public void dispatchRequest(String operation, String num1, String num2, String results) {

        mViews.get(operation).show(num1, num2, results);
    }
}
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pack.tests;

import java.lang.reflect.Method;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.internal.ConstructorOrMethod;

/**
 * This method will be invoked by TestNG before and after a method is
 * invoked.This listener will only be invoked for configuration and test
 * methods.
 *
 */

public class TestInvocation implements IInvokedMethodListener {

    @Override
    public void beforeInvocation(IInvokedMethod invokedMethod, ITestResult result) {
        ITestNGMethod testNgMethod = result.getMethod();
        ConstructorOrMethod contructorOrMethod = testNgMethod.getConstructorOrMethod();
        Method method = contructorOrMethod.getMethod();
        System.out.print("*****MethodInvoking: " + method.getName() + "*****" + "\n");
        }

    @Override
    public void afterInvocation(IInvokedMethod iim, ITestResult itr) {
        //Do Nothing
    }
    
}

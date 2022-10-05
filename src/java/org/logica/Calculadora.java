/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.logica;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author JL
 */
@WebService()
public class Calculadora {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "suma")
    public int suma(@WebParam(name = "a")
    int a, @WebParam(name = "b")
    int b) {
        //TODO write your implementation code here:
        return a + b;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "resta")
    public int resta(@WebParam(name = "a")
    int a, @WebParam(name = "b")
    int b) {
        //TODO write your implementation code here:
        return a - b;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "multiplicar")
    public float multiplicar(@WebParam(name = "a")
    float a, @WebParam(name = "b")
    float b) {
        //TODO write your implementation code here:
        return a*b;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "dividir")
    public float dividir(@WebParam(name = "a")
    float a, @WebParam(name = "b")
    float b) {
        //TODO write your implementation code here:
        return a/b;
    }
}

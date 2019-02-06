package com.kyle.ws.trainings;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.2.1
 * 2019-02-05T16:06:12.264-08:00
 * Generated source version: 3.2.1
 * 
 */
@WebService(targetNamespace = "http://trainings.ws.kyle.com", name = "CustomerOrders")
@XmlSeeAlso({ObjectFactory.class})
public interface CustomerOrders {

    @WebMethod(operationName = "NewOperation", action = "http://trainings.ws.kyle.com/NewOperation")
    @RequestWrapper(localName = "NewOperation", targetNamespace = "http://trainings.ws.kyle.com", className = "com.kyle.ws.trainings.NewOperation")
    @ResponseWrapper(localName = "NewOperationResponse", targetNamespace = "http://trainings.ws.kyle.com", className = "com.kyle.ws.trainings.NewOperationResponse")
    @WebResult(name = "out", targetNamespace = "")
    public java.lang.String newOperation(
        @WebParam(name = "in", targetNamespace = "")
        java.lang.String in
    );
}
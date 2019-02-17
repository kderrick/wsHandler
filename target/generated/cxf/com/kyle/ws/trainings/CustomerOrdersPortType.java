package com.kyle.ws.trainings;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.2.1
 * 2019-02-17T08:29:53.921-08:00
 * Generated source version: 3.2.1
 * 
 */
@WebService(targetNamespace = "http://trainings.ws.kyle.com", name = "CustomerOrdersPortType")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface CustomerOrdersPortType {

    @WebMethod(action = "http://trainings.ws.kyle.com/NewOperation")
    @WebResult(name = "getOrdersResponse", targetNamespace = "http://trainings.ws.kyle.com", partName = "parameters")
    public GetOrdersResponse getOrders(
        @WebParam(partName = "parameters", name = "getOrdersRequest", targetNamespace = "http://trainings.ws.kyle.com")
        GetOrdersRequest parameters
    );

    @WebMethod(action = "http://trainings.ws.kyle.com/NewOperation")
    @WebResult(name = "createOrdersResponse", targetNamespace = "http://trainings.ws.kyle.com", partName = "parameters")
    public CreateOrdersResponse createOrders(
        @WebParam(partName = "parameters", name = "createOrdersRequest", targetNamespace = "http://trainings.ws.kyle.com")
        CreateOrdersRequest parameters
    );
}
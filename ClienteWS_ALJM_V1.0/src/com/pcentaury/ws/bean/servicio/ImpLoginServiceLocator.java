/**
 * ImpLoginServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.pcentaury.ws.bean.servicio;

public class ImpLoginServiceLocator extends org.apache.axis.client.Service implements com.pcentaury.ws.bean.servicio.ImpLoginService {

    public ImpLoginServiceLocator() {
    }


    public ImpLoginServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ImpLoginServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ImpLogin
    private java.lang.String ImpLogin_address = "http://localhost:8083/wsAJM_V1.1/services/ImpLogin";

    public java.lang.String getImpLoginAddress() {
        return ImpLogin_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ImpLoginWSDDServiceName = "ImpLogin";

    public java.lang.String getImpLoginWSDDServiceName() {
        return ImpLoginWSDDServiceName;
    }

    public void setImpLoginWSDDServiceName(java.lang.String name) {
        ImpLoginWSDDServiceName = name;
    }

    public com.pcentaury.ws.bean.servicio.ImpLogin getImpLogin() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ImpLogin_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getImpLogin(endpoint);
    }

    public com.pcentaury.ws.bean.servicio.ImpLogin getImpLogin(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.pcentaury.ws.bean.servicio.ImpLoginSoapBindingStub _stub = new com.pcentaury.ws.bean.servicio.ImpLoginSoapBindingStub(portAddress, this);
            _stub.setPortName(getImpLoginWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setImpLoginEndpointAddress(java.lang.String address) {
        ImpLogin_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.pcentaury.ws.bean.servicio.ImpLogin.class.isAssignableFrom(serviceEndpointInterface)) {
                com.pcentaury.ws.bean.servicio.ImpLoginSoapBindingStub _stub = new com.pcentaury.ws.bean.servicio.ImpLoginSoapBindingStub(new java.net.URL(ImpLogin_address), this);
                _stub.setPortName(getImpLoginWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ImpLogin".equals(inputPortName)) {
            return getImpLogin();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://servicio.bean.ws.pcentaury.com", "ImpLoginService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://servicio.bean.ws.pcentaury.com", "ImpLogin"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ImpLogin".equals(portName)) {
            setImpLoginEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}

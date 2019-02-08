package com.pcentaury.ws.bean.servicio;

public class ImpLoginProxy implements com.pcentaury.ws.bean.servicio.ImpLogin {
  private String _endpoint = null;
  private com.pcentaury.ws.bean.servicio.ImpLogin impLogin = null;
  
  public ImpLoginProxy() {
    _initImpLoginProxy();
  }
  
  public ImpLoginProxy(String endpoint) {
    _endpoint = endpoint;
    _initImpLoginProxy();
  }
  
  private void _initImpLoginProxy() {
    try {
      impLogin = (new com.pcentaury.ws.bean.servicio.ImpLoginServiceLocator()).getImpLogin();
      if (impLogin != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)impLogin)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)impLogin)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (impLogin != null)
      ((javax.xml.rpc.Stub)impLogin)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.pcentaury.ws.bean.servicio.ImpLogin getImpLogin() {
    if (impLogin == null)
      _initImpLoginProxy();
    return impLogin;
  }
  
  public com.pcentaury.ws.bean.BLogin autenticar(com.pcentaury.ws.bean.BLogin objRecibido) throws java.rmi.RemoteException{
    if (impLogin == null)
      _initImpLoginProxy();
    return impLogin.autenticar(objRecibido);
  }
  
  
}
package com.github.hadrychen.service.impl;

public class CalculateProxy implements com.github.hadrychen.service.impl.Calculate {
  private String _endpoint = null;
  private com.github.hadrychen.service.impl.Calculate calculate = null;
  
  public CalculateProxy() {
    _initCalculateProxy();
  }
  
  public CalculateProxy(String endpoint) {
    _endpoint = endpoint;
    _initCalculateProxy();
  }
  
  private void _initCalculateProxy() {
    try {
      calculate = (new com.github.hadrychen.service.impl.CalculateServiceLocator()).getCalculatePort();
      if (calculate != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)calculate)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)calculate)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (calculate != null)
      ((javax.xml.rpc.Stub)calculate)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.github.hadrychen.service.impl.Calculate getCalculate() {
    if (calculate == null)
      _initCalculateProxy();
    return calculate;
  }
  
  public int getResult() throws java.rmi.RemoteException{
    if (calculate == null)
      _initCalculateProxy();
    return calculate.getResult();
  }
  
  public int getX() throws java.rmi.RemoteException{
    if (calculate == null)
      _initCalculateProxy();
    return calculate.getX();
  }
  
  public void setX(int arg0) throws java.rmi.RemoteException{
    if (calculate == null)
      _initCalculateProxy();
    calculate.setX(arg0);
  }
  
  public int getY() throws java.rmi.RemoteException{
    if (calculate == null)
      _initCalculateProxy();
    return calculate.getY();
  }
  
  public void setY(int arg0) throws java.rmi.RemoteException{
    if (calculate == null)
      _initCalculateProxy();
    calculate.setY(arg0);
  }
  
  
}
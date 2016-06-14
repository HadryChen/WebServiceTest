/**
 * CalculateService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.github.hadrychen.service.impl;

public interface CalculateService extends javax.xml.rpc.Service {
    public java.lang.String getCalculatePortAddress();

    public com.github.hadrychen.service.impl.Calculate getCalculatePort() throws javax.xml.rpc.ServiceException;

    public com.github.hadrychen.service.impl.Calculate getCalculatePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}

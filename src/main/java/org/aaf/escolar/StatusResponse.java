/**
 * StatusResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.aaf.escolar;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class StatusResponse  implements java.io.Serializable {
    private java.lang.String codigo;

    private java.lang.String mensagem;

    private boolean status;

    public StatusResponse() {
    }

    public StatusResponse(
           java.lang.String codigo,
           java.lang.String mensagem,
           boolean status) {
           this.codigo = codigo;
           this.mensagem = mensagem;
           this.status = status;
    }


    /**
     * Gets the codigo value for this StatusResponse.
     * 
     * @return codigo
     */
    public java.lang.String getCodigo() {
        return codigo;
    }


    /**
     * Sets the codigo value for this StatusResponse.
     * 
     * @param codigo
     */
    public void setCodigo(java.lang.String codigo) {
        this.codigo = codigo;
    }


    /**
     * Gets the mensagem value for this StatusResponse.
     * 
     * @return mensagem
     */
    public java.lang.String getMensagem() {
        return mensagem;
    }


    /**
     * Sets the mensagem value for this StatusResponse.
     * 
     * @param mensagem
     */
    public void setMensagem(java.lang.String mensagem) {
        this.mensagem = mensagem;
    }


    /**
     * Gets the status value for this StatusResponse.
     * 
     * @return status
     */
    public boolean isStatus() {
        return status;
    }


    /**
     * Sets the status value for this StatusResponse.
     * 
     * @param status
     */
    public void setStatus(boolean status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StatusResponse)) return false;
        StatusResponse other = (StatusResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codigo==null && other.getCodigo()==null) || 
             (this.codigo!=null &&
              this.codigo.equals(other.getCodigo()))) &&
            ((this.mensagem==null && other.getMensagem()==null) || 
             (this.mensagem!=null &&
              this.mensagem.equals(other.getMensagem()))) &&
            this.status == other.isStatus();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCodigo() != null) {
            _hashCode += getCodigo().hashCode();
        }
        if (getMensagem() != null) {
            _hashCode += getMensagem().hashCode();
        }
        _hashCode += (isStatus() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

}

/**
 * OperatingSystemVersion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201306.cm;


/**
 * Represents a Operating System Version Criterion.
 *             <p>A criterion of this type can only be created using
 * an ID. A criterion of this type is only targetable.
 *             <span class="constraint AdxEnabled">This is enabled for
 * AdX.</span>
 */
public class OperatingSystemVersion  extends com.google.api.ads.adwords.axis.v201306.cm.Criterion  implements java.io.Serializable {
    /* The name of the operating system.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "OperatingSystemName".</span>
     *                     <span class="constraint ReadOnly">This field is
     * read only and should not be set.  If this field is sent to the API,
     * it will be ignored.</span> */
    private java.lang.String name;

    /* The OS Major Version number.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "OsMajorVersion".</span>
     *                     <span class="constraint ReadOnly">This field is
     * read only and should not be set.  If this field is sent to the API,
     * it will be ignored.</span> */
    private java.lang.Integer osMajorVersion;

    /* The OS Minor Version number.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "OsMinorVersion".</span>
     *                     <span class="constraint ReadOnly">This field is
     * read only and should not be set.  If this field is sent to the API,
     * it will be ignored.</span> */
    private java.lang.Integer osMinorVersion;

    /* The operator type.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "OperatorType".</span>
     *                     <span class="constraint ReadOnly">This field is
     * read only and should not be set.  If this field is sent to the API,
     * it will be ignored.</span> */
    private com.google.api.ads.adwords.axis.v201306.cm.OperatingSystemVersionOperatorType operatorType;

    public OperatingSystemVersion() {
    }

    public OperatingSystemVersion(
           java.lang.Long id,
           com.google.api.ads.adwords.axis.v201306.cm.CriterionType type,
           java.lang.String criterionType,
           java.lang.String name,
           java.lang.Integer osMajorVersion,
           java.lang.Integer osMinorVersion,
           com.google.api.ads.adwords.axis.v201306.cm.OperatingSystemVersionOperatorType operatorType) {
        super(
            id,
            type,
            criterionType);
        this.name = name;
        this.osMajorVersion = osMajorVersion;
        this.osMinorVersion = osMinorVersion;
        this.operatorType = operatorType;
    }


    /**
     * Gets the name value for this OperatingSystemVersion.
     * 
     * @return name   * The name of the operating system.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "OperatingSystemName".</span>
     *                     <span class="constraint ReadOnly">This field is
     * read only and should not be set.  If this field is sent to the API,
     * it will be ignored.</span>
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this OperatingSystemVersion.
     * 
     * @param name   * The name of the operating system.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "OperatingSystemName".</span>
     *                     <span class="constraint ReadOnly">This field is
     * read only and should not be set.  If this field is sent to the API,
     * it will be ignored.</span>
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the osMajorVersion value for this OperatingSystemVersion.
     * 
     * @return osMajorVersion   * The OS Major Version number.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "OsMajorVersion".</span>
     *                     <span class="constraint ReadOnly">This field is
     * read only and should not be set.  If this field is sent to the API,
     * it will be ignored.</span>
     */
    public java.lang.Integer getOsMajorVersion() {
        return osMajorVersion;
    }


    /**
     * Sets the osMajorVersion value for this OperatingSystemVersion.
     * 
     * @param osMajorVersion   * The OS Major Version number.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "OsMajorVersion".</span>
     *                     <span class="constraint ReadOnly">This field is
     * read only and should not be set.  If this field is sent to the API,
     * it will be ignored.</span>
     */
    public void setOsMajorVersion(java.lang.Integer osMajorVersion) {
        this.osMajorVersion = osMajorVersion;
    }


    /**
     * Gets the osMinorVersion value for this OperatingSystemVersion.
     * 
     * @return osMinorVersion   * The OS Minor Version number.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "OsMinorVersion".</span>
     *                     <span class="constraint ReadOnly">This field is
     * read only and should not be set.  If this field is sent to the API,
     * it will be ignored.</span>
     */
    public java.lang.Integer getOsMinorVersion() {
        return osMinorVersion;
    }


    /**
     * Sets the osMinorVersion value for this OperatingSystemVersion.
     * 
     * @param osMinorVersion   * The OS Minor Version number.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "OsMinorVersion".</span>
     *                     <span class="constraint ReadOnly">This field is
     * read only and should not be set.  If this field is sent to the API,
     * it will be ignored.</span>
     */
    public void setOsMinorVersion(java.lang.Integer osMinorVersion) {
        this.osMinorVersion = osMinorVersion;
    }


    /**
     * Gets the operatorType value for this OperatingSystemVersion.
     * 
     * @return operatorType   * The operator type.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "OperatorType".</span>
     *                     <span class="constraint ReadOnly">This field is
     * read only and should not be set.  If this field is sent to the API,
     * it will be ignored.</span>
     */
    public com.google.api.ads.adwords.axis.v201306.cm.OperatingSystemVersionOperatorType getOperatorType() {
        return operatorType;
    }


    /**
     * Sets the operatorType value for this OperatingSystemVersion.
     * 
     * @param operatorType   * The operator type.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "OperatorType".</span>
     *                     <span class="constraint ReadOnly">This field is
     * read only and should not be set.  If this field is sent to the API,
     * it will be ignored.</span>
     */
    public void setOperatorType(com.google.api.ads.adwords.axis.v201306.cm.OperatingSystemVersionOperatorType operatorType) {
        this.operatorType = operatorType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OperatingSystemVersion)) return false;
        OperatingSystemVersion other = (OperatingSystemVersion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.osMajorVersion==null && other.getOsMajorVersion()==null) || 
             (this.osMajorVersion!=null &&
              this.osMajorVersion.equals(other.getOsMajorVersion()))) &&
            ((this.osMinorVersion==null && other.getOsMinorVersion()==null) || 
             (this.osMinorVersion!=null &&
              this.osMinorVersion.equals(other.getOsMinorVersion()))) &&
            ((this.operatorType==null && other.getOperatorType()==null) || 
             (this.operatorType!=null &&
              this.operatorType.equals(other.getOperatorType())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getOsMajorVersion() != null) {
            _hashCode += getOsMajorVersion().hashCode();
        }
        if (getOsMinorVersion() != null) {
            _hashCode += getOsMinorVersion().hashCode();
        }
        if (getOperatorType() != null) {
            _hashCode += getOperatorType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OperatingSystemVersion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "OperatingSystemVersion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("osMajorVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "osMajorVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("osMinorVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "osMinorVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operatorType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "operatorType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "OperatingSystemVersion.OperatorType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}

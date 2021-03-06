/**
 * ReportDefinitionField.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201309.cm;


/**
 * Represents the fields that can be used to create a ReportDefinition.
 * This class allows the user to query the list of fields applicable
 * to a
 *             given report type. Consumers of reports will be able use
 * the retrieved
 *             fields through the {@link ReportDefinitionService#getReportFields}
 * api and run the corresponding reports.
 */
public class ReportDefinitionField  implements java.io.Serializable {
    /* The field name.
     *                 <span class="constraint ReadOnly">This field is read
     * only and should not be set.  If this field is sent to the API, it
     * will be ignored.</span> */
    private java.lang.String fieldName;

    /* The name that is displayed in the downloaded report.
     *                 <span class="constraint ReadOnly">This field is read
     * only and should not be set.  If this field is sent to the API, it
     * will be ignored.</span> */
    private java.lang.String displayFieldName;

    /* The XML attribute in the downloaded report.
     *                 <span class="constraint ReadOnly">This field is read
     * only and should not be set.  If this field is sent to the API, it
     * will be ignored.</span> */
    private java.lang.String xmlAttributeName;

    /* The type of field. Useful for knowing what operation type to
     * pass in for
     *                 a given field in a predicate.
     *                 <span class="constraint ReadOnly">This field is read
     * only and should not be set.  If this field is sent to the API, it
     * will be ignored.</span> */
    private java.lang.String fieldType;

    /* List of enum values for the corresponing field iff the field
     * is an enum
     *                 type.
     *                 <span class="constraint ReadOnly">This field is read
     * only and should not be set.  If this field is sent to the API, it
     * will be ignored.</span> */
    private java.lang.String[] enumValues;

    /* Indicates if the user can select this field.
     *                 <span class="constraint ReadOnly">This field is read
     * only and should not be set.  If this field is sent to the API, it
     * will be ignored.</span> */
    private java.lang.Boolean canSelect;

    /* Indicates if the user can filter on this field.
     *                 <span class="constraint ReadOnly">This field is read
     * only and should not be set.  If this field is sent to the API, it
     * will be ignored.</span> */
    private java.lang.Boolean canFilter;

    /* Indicates that the field is an enum type.
     *                 <span class="constraint ReadOnly">This field is read
     * only and should not be set.  If this field is sent to the API, it
     * will be ignored.</span> */
    private java.lang.Boolean isEnumType;

    /* Indicates that the field is only available with beta access.
     * <span class="constraint ReadOnly">This field is read only and should
     * not be set.  If this field is sent to the API, it will be ignored.</span> */
    private java.lang.Boolean isBeta;

    /* List of enum values in api to their corresponding display values
     * in the
     *                 downloaded reports.
     *                 <span class="constraint ReadOnly">This field is read
     * only and should not be set.  If this field is sent to the API, it
     * will be ignored.</span> */
    private com.google.api.ads.adwords.axis.v201309.cm.EnumValuePair[] enumValuePairs;

    public ReportDefinitionField() {
    }

    public ReportDefinitionField(
           java.lang.String fieldName,
           java.lang.String displayFieldName,
           java.lang.String xmlAttributeName,
           java.lang.String fieldType,
           java.lang.String[] enumValues,
           java.lang.Boolean canSelect,
           java.lang.Boolean canFilter,
           java.lang.Boolean isEnumType,
           java.lang.Boolean isBeta,
           com.google.api.ads.adwords.axis.v201309.cm.EnumValuePair[] enumValuePairs) {
           this.fieldName = fieldName;
           this.displayFieldName = displayFieldName;
           this.xmlAttributeName = xmlAttributeName;
           this.fieldType = fieldType;
           this.enumValues = enumValues;
           this.canSelect = canSelect;
           this.canFilter = canFilter;
           this.isEnumType = isEnumType;
           this.isBeta = isBeta;
           this.enumValuePairs = enumValuePairs;
    }


    /**
     * Gets the fieldName value for this ReportDefinitionField.
     * 
     * @return fieldName   * The field name.
     *                 <span class="constraint ReadOnly">This field is read
     * only and should not be set.  If this field is sent to the API, it
     * will be ignored.</span>
     */
    public java.lang.String getFieldName() {
        return fieldName;
    }


    /**
     * Sets the fieldName value for this ReportDefinitionField.
     * 
     * @param fieldName   * The field name.
     *                 <span class="constraint ReadOnly">This field is read
     * only and should not be set.  If this field is sent to the API, it
     * will be ignored.</span>
     */
    public void setFieldName(java.lang.String fieldName) {
        this.fieldName = fieldName;
    }


    /**
     * Gets the displayFieldName value for this ReportDefinitionField.
     * 
     * @return displayFieldName   * The name that is displayed in the downloaded report.
     *                 <span class="constraint ReadOnly">This field is read
     * only and should not be set.  If this field is sent to the API, it
     * will be ignored.</span>
     */
    public java.lang.String getDisplayFieldName() {
        return displayFieldName;
    }


    /**
     * Sets the displayFieldName value for this ReportDefinitionField.
     * 
     * @param displayFieldName   * The name that is displayed in the downloaded report.
     *                 <span class="constraint ReadOnly">This field is read
     * only and should not be set.  If this field is sent to the API, it
     * will be ignored.</span>
     */
    public void setDisplayFieldName(java.lang.String displayFieldName) {
        this.displayFieldName = displayFieldName;
    }


    /**
     * Gets the xmlAttributeName value for this ReportDefinitionField.
     * 
     * @return xmlAttributeName   * The XML attribute in the downloaded report.
     *                 <span class="constraint ReadOnly">This field is read
     * only and should not be set.  If this field is sent to the API, it
     * will be ignored.</span>
     */
    public java.lang.String getXmlAttributeName() {
        return xmlAttributeName;
    }


    /**
     * Sets the xmlAttributeName value for this ReportDefinitionField.
     * 
     * @param xmlAttributeName   * The XML attribute in the downloaded report.
     *                 <span class="constraint ReadOnly">This field is read
     * only and should not be set.  If this field is sent to the API, it
     * will be ignored.</span>
     */
    public void setXmlAttributeName(java.lang.String xmlAttributeName) {
        this.xmlAttributeName = xmlAttributeName;
    }


    /**
     * Gets the fieldType value for this ReportDefinitionField.
     * 
     * @return fieldType   * The type of field. Useful for knowing what operation type to
     * pass in for
     *                 a given field in a predicate.
     *                 <span class="constraint ReadOnly">This field is read
     * only and should not be set.  If this field is sent to the API, it
     * will be ignored.</span>
     */
    public java.lang.String getFieldType() {
        return fieldType;
    }


    /**
     * Sets the fieldType value for this ReportDefinitionField.
     * 
     * @param fieldType   * The type of field. Useful for knowing what operation type to
     * pass in for
     *                 a given field in a predicate.
     *                 <span class="constraint ReadOnly">This field is read
     * only and should not be set.  If this field is sent to the API, it
     * will be ignored.</span>
     */
    public void setFieldType(java.lang.String fieldType) {
        this.fieldType = fieldType;
    }


    /**
     * Gets the enumValues value for this ReportDefinitionField.
     * 
     * @return enumValues   * List of enum values for the corresponing field iff the field
     * is an enum
     *                 type.
     *                 <span class="constraint ReadOnly">This field is read
     * only and should not be set.  If this field is sent to the API, it
     * will be ignored.</span>
     */
    public java.lang.String[] getEnumValues() {
        return enumValues;
    }


    /**
     * Sets the enumValues value for this ReportDefinitionField.
     * 
     * @param enumValues   * List of enum values for the corresponing field iff the field
     * is an enum
     *                 type.
     *                 <span class="constraint ReadOnly">This field is read
     * only and should not be set.  If this field is sent to the API, it
     * will be ignored.</span>
     */
    public void setEnumValues(java.lang.String[] enumValues) {
        this.enumValues = enumValues;
    }

    public java.lang.String getEnumValues(int i) {
        return this.enumValues[i];
    }

    public void setEnumValues(int i, java.lang.String _value) {
        this.enumValues[i] = _value;
    }


    /**
     * Gets the canSelect value for this ReportDefinitionField.
     * 
     * @return canSelect   * Indicates if the user can select this field.
     *                 <span class="constraint ReadOnly">This field is read
     * only and should not be set.  If this field is sent to the API, it
     * will be ignored.</span>
     */
    public java.lang.Boolean getCanSelect() {
        return canSelect;
    }


    /**
     * Sets the canSelect value for this ReportDefinitionField.
     * 
     * @param canSelect   * Indicates if the user can select this field.
     *                 <span class="constraint ReadOnly">This field is read
     * only and should not be set.  If this field is sent to the API, it
     * will be ignored.</span>
     */
    public void setCanSelect(java.lang.Boolean canSelect) {
        this.canSelect = canSelect;
    }


    /**
     * Gets the canFilter value for this ReportDefinitionField.
     * 
     * @return canFilter   * Indicates if the user can filter on this field.
     *                 <span class="constraint ReadOnly">This field is read
     * only and should not be set.  If this field is sent to the API, it
     * will be ignored.</span>
     */
    public java.lang.Boolean getCanFilter() {
        return canFilter;
    }


    /**
     * Sets the canFilter value for this ReportDefinitionField.
     * 
     * @param canFilter   * Indicates if the user can filter on this field.
     *                 <span class="constraint ReadOnly">This field is read
     * only and should not be set.  If this field is sent to the API, it
     * will be ignored.</span>
     */
    public void setCanFilter(java.lang.Boolean canFilter) {
        this.canFilter = canFilter;
    }


    /**
     * Gets the isEnumType value for this ReportDefinitionField.
     * 
     * @return isEnumType   * Indicates that the field is an enum type.
     *                 <span class="constraint ReadOnly">This field is read
     * only and should not be set.  If this field is sent to the API, it
     * will be ignored.</span>
     */
    public java.lang.Boolean getIsEnumType() {
        return isEnumType;
    }


    /**
     * Sets the isEnumType value for this ReportDefinitionField.
     * 
     * @param isEnumType   * Indicates that the field is an enum type.
     *                 <span class="constraint ReadOnly">This field is read
     * only and should not be set.  If this field is sent to the API, it
     * will be ignored.</span>
     */
    public void setIsEnumType(java.lang.Boolean isEnumType) {
        this.isEnumType = isEnumType;
    }


    /**
     * Gets the isBeta value for this ReportDefinitionField.
     * 
     * @return isBeta   * Indicates that the field is only available with beta access.
     * <span class="constraint ReadOnly">This field is read only and should
     * not be set.  If this field is sent to the API, it will be ignored.</span>
     */
    public java.lang.Boolean getIsBeta() {
        return isBeta;
    }


    /**
     * Sets the isBeta value for this ReportDefinitionField.
     * 
     * @param isBeta   * Indicates that the field is only available with beta access.
     * <span class="constraint ReadOnly">This field is read only and should
     * not be set.  If this field is sent to the API, it will be ignored.</span>
     */
    public void setIsBeta(java.lang.Boolean isBeta) {
        this.isBeta = isBeta;
    }


    /**
     * Gets the enumValuePairs value for this ReportDefinitionField.
     * 
     * @return enumValuePairs   * List of enum values in api to their corresponding display values
     * in the
     *                 downloaded reports.
     *                 <span class="constraint ReadOnly">This field is read
     * only and should not be set.  If this field is sent to the API, it
     * will be ignored.</span>
     */
    public com.google.api.ads.adwords.axis.v201309.cm.EnumValuePair[] getEnumValuePairs() {
        return enumValuePairs;
    }


    /**
     * Sets the enumValuePairs value for this ReportDefinitionField.
     * 
     * @param enumValuePairs   * List of enum values in api to their corresponding display values
     * in the
     *                 downloaded reports.
     *                 <span class="constraint ReadOnly">This field is read
     * only and should not be set.  If this field is sent to the API, it
     * will be ignored.</span>
     */
    public void setEnumValuePairs(com.google.api.ads.adwords.axis.v201309.cm.EnumValuePair[] enumValuePairs) {
        this.enumValuePairs = enumValuePairs;
    }

    public com.google.api.ads.adwords.axis.v201309.cm.EnumValuePair getEnumValuePairs(int i) {
        return this.enumValuePairs[i];
    }

    public void setEnumValuePairs(int i, com.google.api.ads.adwords.axis.v201309.cm.EnumValuePair _value) {
        this.enumValuePairs[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReportDefinitionField)) return false;
        ReportDefinitionField other = (ReportDefinitionField) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fieldName==null && other.getFieldName()==null) || 
             (this.fieldName!=null &&
              this.fieldName.equals(other.getFieldName()))) &&
            ((this.displayFieldName==null && other.getDisplayFieldName()==null) || 
             (this.displayFieldName!=null &&
              this.displayFieldName.equals(other.getDisplayFieldName()))) &&
            ((this.xmlAttributeName==null && other.getXmlAttributeName()==null) || 
             (this.xmlAttributeName!=null &&
              this.xmlAttributeName.equals(other.getXmlAttributeName()))) &&
            ((this.fieldType==null && other.getFieldType()==null) || 
             (this.fieldType!=null &&
              this.fieldType.equals(other.getFieldType()))) &&
            ((this.enumValues==null && other.getEnumValues()==null) || 
             (this.enumValues!=null &&
              java.util.Arrays.equals(this.enumValues, other.getEnumValues()))) &&
            ((this.canSelect==null && other.getCanSelect()==null) || 
             (this.canSelect!=null &&
              this.canSelect.equals(other.getCanSelect()))) &&
            ((this.canFilter==null && other.getCanFilter()==null) || 
             (this.canFilter!=null &&
              this.canFilter.equals(other.getCanFilter()))) &&
            ((this.isEnumType==null && other.getIsEnumType()==null) || 
             (this.isEnumType!=null &&
              this.isEnumType.equals(other.getIsEnumType()))) &&
            ((this.isBeta==null && other.getIsBeta()==null) || 
             (this.isBeta!=null &&
              this.isBeta.equals(other.getIsBeta()))) &&
            ((this.enumValuePairs==null && other.getEnumValuePairs()==null) || 
             (this.enumValuePairs!=null &&
              java.util.Arrays.equals(this.enumValuePairs, other.getEnumValuePairs())));
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
        if (getFieldName() != null) {
            _hashCode += getFieldName().hashCode();
        }
        if (getDisplayFieldName() != null) {
            _hashCode += getDisplayFieldName().hashCode();
        }
        if (getXmlAttributeName() != null) {
            _hashCode += getXmlAttributeName().hashCode();
        }
        if (getFieldType() != null) {
            _hashCode += getFieldType().hashCode();
        }
        if (getEnumValues() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEnumValues());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEnumValues(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCanSelect() != null) {
            _hashCode += getCanSelect().hashCode();
        }
        if (getCanFilter() != null) {
            _hashCode += getCanFilter().hashCode();
        }
        if (getIsEnumType() != null) {
            _hashCode += getIsEnumType().hashCode();
        }
        if (getIsBeta() != null) {
            _hashCode += getIsBeta().hashCode();
        }
        if (getEnumValuePairs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEnumValuePairs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEnumValuePairs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReportDefinitionField.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "ReportDefinitionField"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "fieldName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayFieldName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "displayFieldName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xmlAttributeName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "xmlAttributeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "fieldType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enumValues");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "enumValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canSelect");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "canSelect"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canFilter");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "canFilter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isEnumType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "isEnumType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isBeta");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "isBeta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enumValuePairs");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "enumValuePairs"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201309", "EnumValuePair"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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

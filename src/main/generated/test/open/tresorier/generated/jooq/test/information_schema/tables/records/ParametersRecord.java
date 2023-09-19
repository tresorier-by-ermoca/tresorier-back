/*
 * This file is generated by jOOQ.
 */
package open.tresorier.generated.jooq.test.information_schema.tables.records;


import open.tresorier.generated.jooq.test.information_schema.tables.Parameters;

import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ParametersRecord extends TableRecordImpl<ParametersRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>INFORMATION_SCHEMA.PARAMETERS.SPECIFIC_CATALOG</code>.
     */
    public ParametersRecord setSpecificCatalog(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.PARAMETERS.SPECIFIC_CATALOG</code>.
     */
    public String getSpecificCatalog() {
        return (String) get(0);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.PARAMETERS.SPECIFIC_SCHEMA</code>.
     */
    public ParametersRecord setSpecificSchema(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.PARAMETERS.SPECIFIC_SCHEMA</code>.
     */
    public String getSpecificSchema() {
        return (String) get(1);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.PARAMETERS.SPECIFIC_NAME</code>.
     */
    public ParametersRecord setSpecificName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.PARAMETERS.SPECIFIC_NAME</code>.
     */
    public String getSpecificName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.PARAMETERS.ORDINAL_POSITION</code>.
     */
    public ParametersRecord setOrdinalPosition(Integer value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.PARAMETERS.ORDINAL_POSITION</code>.
     */
    public Integer getOrdinalPosition() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.PARAMETERS.PARAMETER_MODE</code>.
     */
    public ParametersRecord setParameterMode(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.PARAMETERS.PARAMETER_MODE</code>.
     */
    public String getParameterMode() {
        return (String) get(4);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.PARAMETERS.IS_RESULT</code>.
     */
    public ParametersRecord setIsResult(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.PARAMETERS.IS_RESULT</code>.
     */
    public String getIsResult() {
        return (String) get(5);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.PARAMETERS.AS_LOCATOR</code>.
     */
    public ParametersRecord setAsLocator(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.PARAMETERS.AS_LOCATOR</code>.
     */
    public String getAsLocator() {
        return (String) get(6);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.PARAMETERS.PARAMETER_NAME</code>.
     */
    public ParametersRecord setParameterName(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.PARAMETERS.PARAMETER_NAME</code>.
     */
    public String getParameterName() {
        return (String) get(7);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.PARAMETERS.DATA_TYPE</code>.
     */
    public ParametersRecord setDataType(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.PARAMETERS.DATA_TYPE</code>.
     */
    public String getDataType() {
        return (String) get(8);
    }

    /**
     * Setter for
     * <code>INFORMATION_SCHEMA.PARAMETERS.CHARACTER_MAXIMUM_LENGTH</code>.
     */
    public ParametersRecord setCharacterMaximumLength(Long value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for
     * <code>INFORMATION_SCHEMA.PARAMETERS.CHARACTER_MAXIMUM_LENGTH</code>.
     */
    public Long getCharacterMaximumLength() {
        return (Long) get(9);
    }

    /**
     * Setter for
     * <code>INFORMATION_SCHEMA.PARAMETERS.CHARACTER_OCTET_LENGTH</code>.
     */
    public ParametersRecord setCharacterOctetLength(Long value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for
     * <code>INFORMATION_SCHEMA.PARAMETERS.CHARACTER_OCTET_LENGTH</code>.
     */
    public Long getCharacterOctetLength() {
        return (Long) get(10);
    }

    /**
     * Setter for
     * <code>INFORMATION_SCHEMA.PARAMETERS.CHARACTER_SET_CATALOG</code>.
     */
    public ParametersRecord setCharacterSetCatalog(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for
     * <code>INFORMATION_SCHEMA.PARAMETERS.CHARACTER_SET_CATALOG</code>.
     */
    public String getCharacterSetCatalog() {
        return (String) get(11);
    }

    /**
     * Setter for
     * <code>INFORMATION_SCHEMA.PARAMETERS.CHARACTER_SET_SCHEMA</code>.
     */
    public ParametersRecord setCharacterSetSchema(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for
     * <code>INFORMATION_SCHEMA.PARAMETERS.CHARACTER_SET_SCHEMA</code>.
     */
    public String getCharacterSetSchema() {
        return (String) get(12);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.PARAMETERS.CHARACTER_SET_NAME</code>.
     */
    public ParametersRecord setCharacterSetName(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.PARAMETERS.CHARACTER_SET_NAME</code>.
     */
    public String getCharacterSetName() {
        return (String) get(13);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.PARAMETERS.COLLATION_CATALOG</code>.
     */
    public ParametersRecord setCollationCatalog(String value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.PARAMETERS.COLLATION_CATALOG</code>.
     */
    public String getCollationCatalog() {
        return (String) get(14);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.PARAMETERS.COLLATION_SCHEMA</code>.
     */
    public ParametersRecord setCollationSchema(String value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.PARAMETERS.COLLATION_SCHEMA</code>.
     */
    public String getCollationSchema() {
        return (String) get(15);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.PARAMETERS.COLLATION_NAME</code>.
     */
    public ParametersRecord setCollationName(String value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.PARAMETERS.COLLATION_NAME</code>.
     */
    public String getCollationName() {
        return (String) get(16);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.PARAMETERS.NUMERIC_PRECISION</code>.
     */
    public ParametersRecord setNumericPrecision(Integer value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.PARAMETERS.NUMERIC_PRECISION</code>.
     */
    public Integer getNumericPrecision() {
        return (Integer) get(17);
    }

    /**
     * Setter for
     * <code>INFORMATION_SCHEMA.PARAMETERS.NUMERIC_PRECISION_RADIX</code>.
     */
    public ParametersRecord setNumericPrecisionRadix(Integer value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for
     * <code>INFORMATION_SCHEMA.PARAMETERS.NUMERIC_PRECISION_RADIX</code>.
     */
    public Integer getNumericPrecisionRadix() {
        return (Integer) get(18);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.PARAMETERS.NUMERIC_SCALE</code>.
     */
    public ParametersRecord setNumericScale(Integer value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.PARAMETERS.NUMERIC_SCALE</code>.
     */
    public Integer getNumericScale() {
        return (Integer) get(19);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.PARAMETERS.DATETIME_PRECISION</code>.
     */
    public ParametersRecord setDatetimePrecision(Integer value) {
        set(20, value);
        return this;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.PARAMETERS.DATETIME_PRECISION</code>.
     */
    public Integer getDatetimePrecision() {
        return (Integer) get(20);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.PARAMETERS.INTERVAL_TYPE</code>.
     */
    public ParametersRecord setIntervalType(String value) {
        set(21, value);
        return this;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.PARAMETERS.INTERVAL_TYPE</code>.
     */
    public String getIntervalType() {
        return (String) get(21);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.PARAMETERS.INTERVAL_PRECISION</code>.
     */
    public ParametersRecord setIntervalPrecision(Integer value) {
        set(22, value);
        return this;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.PARAMETERS.INTERVAL_PRECISION</code>.
     */
    public Integer getIntervalPrecision() {
        return (Integer) get(22);
    }

    /**
     * Setter for
     * <code>INFORMATION_SCHEMA.PARAMETERS.MAXIMUM_CARDINALITY</code>.
     */
    public ParametersRecord setMaximumCardinality(Integer value) {
        set(23, value);
        return this;
    }

    /**
     * Getter for
     * <code>INFORMATION_SCHEMA.PARAMETERS.MAXIMUM_CARDINALITY</code>.
     */
    public Integer getMaximumCardinality() {
        return (Integer) get(23);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.PARAMETERS.DTD_IDENTIFIER</code>.
     */
    public ParametersRecord setDtdIdentifier(String value) {
        set(24, value);
        return this;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.PARAMETERS.DTD_IDENTIFIER</code>.
     */
    public String getDtdIdentifier() {
        return (String) get(24);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.PARAMETERS.DECLARED_DATA_TYPE</code>.
     */
    public ParametersRecord setDeclaredDataType(String value) {
        set(25, value);
        return this;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.PARAMETERS.DECLARED_DATA_TYPE</code>.
     */
    public String getDeclaredDataType() {
        return (String) get(25);
    }

    /**
     * Setter for
     * <code>INFORMATION_SCHEMA.PARAMETERS.DECLARED_NUMERIC_PRECISION</code>.
     */
    public ParametersRecord setDeclaredNumericPrecision(Integer value) {
        set(26, value);
        return this;
    }

    /**
     * Getter for
     * <code>INFORMATION_SCHEMA.PARAMETERS.DECLARED_NUMERIC_PRECISION</code>.
     */
    public Integer getDeclaredNumericPrecision() {
        return (Integer) get(26);
    }

    /**
     * Setter for
     * <code>INFORMATION_SCHEMA.PARAMETERS.DECLARED_NUMERIC_SCALE</code>.
     */
    public ParametersRecord setDeclaredNumericScale(Integer value) {
        set(27, value);
        return this;
    }

    /**
     * Getter for
     * <code>INFORMATION_SCHEMA.PARAMETERS.DECLARED_NUMERIC_SCALE</code>.
     */
    public Integer getDeclaredNumericScale() {
        return (Integer) get(27);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.PARAMETERS.PARAMETER_DEFAULT</code>.
     */
    public ParametersRecord setParameterDefault(String value) {
        set(28, value);
        return this;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.PARAMETERS.PARAMETER_DEFAULT</code>.
     */
    public String getParameterDefault() {
        return (String) get(28);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.PARAMETERS.GEOMETRY_TYPE</code>.
     */
    public ParametersRecord setGeometryType(String value) {
        set(29, value);
        return this;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.PARAMETERS.GEOMETRY_TYPE</code>.
     */
    public String getGeometryType() {
        return (String) get(29);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.PARAMETERS.GEOMETRY_SRID</code>.
     */
    public ParametersRecord setGeometrySrid(Integer value) {
        set(30, value);
        return this;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.PARAMETERS.GEOMETRY_SRID</code>.
     */
    public Integer getGeometrySrid() {
        return (Integer) get(30);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ParametersRecord
     */
    public ParametersRecord() {
        super(Parameters.PARAMETERS);
    }

    /**
     * Create a detached, initialised ParametersRecord
     */
    public ParametersRecord(String specificCatalog, String specificSchema, String specificName, Integer ordinalPosition, String parameterMode, String isResult, String asLocator, String parameterName, String dataType, Long characterMaximumLength, Long characterOctetLength, String characterSetCatalog, String characterSetSchema, String characterSetName, String collationCatalog, String collationSchema, String collationName, Integer numericPrecision, Integer numericPrecisionRadix, Integer numericScale, Integer datetimePrecision, String intervalType, Integer intervalPrecision, Integer maximumCardinality, String dtdIdentifier, String declaredDataType, Integer declaredNumericPrecision, Integer declaredNumericScale, String parameterDefault, String geometryType, Integer geometrySrid) {
        super(Parameters.PARAMETERS);

        setSpecificCatalog(specificCatalog);
        setSpecificSchema(specificSchema);
        setSpecificName(specificName);
        setOrdinalPosition(ordinalPosition);
        setParameterMode(parameterMode);
        setIsResult(isResult);
        setAsLocator(asLocator);
        setParameterName(parameterName);
        setDataType(dataType);
        setCharacterMaximumLength(characterMaximumLength);
        setCharacterOctetLength(characterOctetLength);
        setCharacterSetCatalog(characterSetCatalog);
        setCharacterSetSchema(characterSetSchema);
        setCharacterSetName(characterSetName);
        setCollationCatalog(collationCatalog);
        setCollationSchema(collationSchema);
        setCollationName(collationName);
        setNumericPrecision(numericPrecision);
        setNumericPrecisionRadix(numericPrecisionRadix);
        setNumericScale(numericScale);
        setDatetimePrecision(datetimePrecision);
        setIntervalType(intervalType);
        setIntervalPrecision(intervalPrecision);
        setMaximumCardinality(maximumCardinality);
        setDtdIdentifier(dtdIdentifier);
        setDeclaredDataType(declaredDataType);
        setDeclaredNumericPrecision(declaredNumericPrecision);
        setDeclaredNumericScale(declaredNumericScale);
        setParameterDefault(parameterDefault);
        setGeometryType(geometryType);
        setGeometrySrid(geometrySrid);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised ParametersRecord
     */
    public ParametersRecord(open.tresorier.generated.jooq.test.information_schema.tables.pojos.Parameters value) {
        super(Parameters.PARAMETERS);

        if (value != null) {
            setSpecificCatalog(value.getSpecificCatalog());
            setSpecificSchema(value.getSpecificSchema());
            setSpecificName(value.getSpecificName());
            setOrdinalPosition(value.getOrdinalPosition());
            setParameterMode(value.getParameterMode());
            setIsResult(value.getIsResult());
            setAsLocator(value.getAsLocator());
            setParameterName(value.getParameterName());
            setDataType(value.getDataType());
            setCharacterMaximumLength(value.getCharacterMaximumLength());
            setCharacterOctetLength(value.getCharacterOctetLength());
            setCharacterSetCatalog(value.getCharacterSetCatalog());
            setCharacterSetSchema(value.getCharacterSetSchema());
            setCharacterSetName(value.getCharacterSetName());
            setCollationCatalog(value.getCollationCatalog());
            setCollationSchema(value.getCollationSchema());
            setCollationName(value.getCollationName());
            setNumericPrecision(value.getNumericPrecision());
            setNumericPrecisionRadix(value.getNumericPrecisionRadix());
            setNumericScale(value.getNumericScale());
            setDatetimePrecision(value.getDatetimePrecision());
            setIntervalType(value.getIntervalType());
            setIntervalPrecision(value.getIntervalPrecision());
            setMaximumCardinality(value.getMaximumCardinality());
            setDtdIdentifier(value.getDtdIdentifier());
            setDeclaredDataType(value.getDeclaredDataType());
            setDeclaredNumericPrecision(value.getDeclaredNumericPrecision());
            setDeclaredNumericScale(value.getDeclaredNumericScale());
            setParameterDefault(value.getParameterDefault());
            setGeometryType(value.getGeometryType());
            setGeometrySrid(value.getGeometrySrid());
            resetChangedOnNotNull();
        }
    }
}

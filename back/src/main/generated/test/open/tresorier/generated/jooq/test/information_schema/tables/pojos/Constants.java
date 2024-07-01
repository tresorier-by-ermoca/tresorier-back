/*
 * This file is generated by jOOQ.
 */
package open.tresorier.generated.jooq.test.information_schema.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class Constants implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String constantCatalog;
    private final String constantSchema;
    private final String constantName;
    private final String valueDefinition;
    private final String dataType;
    private final Long characterMaximumLength;
    private final Long characterOctetLength;
    private final String characterSetCatalog;
    private final String characterSetSchema;
    private final String characterSetName;
    private final String collationCatalog;
    private final String collationSchema;
    private final String collationName;
    private final Integer numericPrecision;
    private final Integer numericPrecisionRadix;
    private final Integer numericScale;
    private final Integer datetimePrecision;
    private final String intervalType;
    private final Integer intervalPrecision;
    private final Integer maximumCardinality;
    private final String dtdIdentifier;
    private final String declaredDataType;
    private final Integer declaredNumericPrecision;
    private final Integer declaredNumericScale;
    private final String geometryType;
    private final Integer geometrySrid;
    private final String remarks;

    public Constants(Constants value) {
        this.constantCatalog = value.constantCatalog;
        this.constantSchema = value.constantSchema;
        this.constantName = value.constantName;
        this.valueDefinition = value.valueDefinition;
        this.dataType = value.dataType;
        this.characterMaximumLength = value.characterMaximumLength;
        this.characterOctetLength = value.characterOctetLength;
        this.characterSetCatalog = value.characterSetCatalog;
        this.characterSetSchema = value.characterSetSchema;
        this.characterSetName = value.characterSetName;
        this.collationCatalog = value.collationCatalog;
        this.collationSchema = value.collationSchema;
        this.collationName = value.collationName;
        this.numericPrecision = value.numericPrecision;
        this.numericPrecisionRadix = value.numericPrecisionRadix;
        this.numericScale = value.numericScale;
        this.datetimePrecision = value.datetimePrecision;
        this.intervalType = value.intervalType;
        this.intervalPrecision = value.intervalPrecision;
        this.maximumCardinality = value.maximumCardinality;
        this.dtdIdentifier = value.dtdIdentifier;
        this.declaredDataType = value.declaredDataType;
        this.declaredNumericPrecision = value.declaredNumericPrecision;
        this.declaredNumericScale = value.declaredNumericScale;
        this.geometryType = value.geometryType;
        this.geometrySrid = value.geometrySrid;
        this.remarks = value.remarks;
    }

    public Constants(
        String constantCatalog,
        String constantSchema,
        String constantName,
        String valueDefinition,
        String dataType,
        Long characterMaximumLength,
        Long characterOctetLength,
        String characterSetCatalog,
        String characterSetSchema,
        String characterSetName,
        String collationCatalog,
        String collationSchema,
        String collationName,
        Integer numericPrecision,
        Integer numericPrecisionRadix,
        Integer numericScale,
        Integer datetimePrecision,
        String intervalType,
        Integer intervalPrecision,
        Integer maximumCardinality,
        String dtdIdentifier,
        String declaredDataType,
        Integer declaredNumericPrecision,
        Integer declaredNumericScale,
        String geometryType,
        Integer geometrySrid,
        String remarks
    ) {
        this.constantCatalog = constantCatalog;
        this.constantSchema = constantSchema;
        this.constantName = constantName;
        this.valueDefinition = valueDefinition;
        this.dataType = dataType;
        this.characterMaximumLength = characterMaximumLength;
        this.characterOctetLength = characterOctetLength;
        this.characterSetCatalog = characterSetCatalog;
        this.characterSetSchema = characterSetSchema;
        this.characterSetName = characterSetName;
        this.collationCatalog = collationCatalog;
        this.collationSchema = collationSchema;
        this.collationName = collationName;
        this.numericPrecision = numericPrecision;
        this.numericPrecisionRadix = numericPrecisionRadix;
        this.numericScale = numericScale;
        this.datetimePrecision = datetimePrecision;
        this.intervalType = intervalType;
        this.intervalPrecision = intervalPrecision;
        this.maximumCardinality = maximumCardinality;
        this.dtdIdentifier = dtdIdentifier;
        this.declaredDataType = declaredDataType;
        this.declaredNumericPrecision = declaredNumericPrecision;
        this.declaredNumericScale = declaredNumericScale;
        this.geometryType = geometryType;
        this.geometrySrid = geometrySrid;
        this.remarks = remarks;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.CONSTANTS.CONSTANT_CATALOG</code>.
     */
    public String getConstantCatalog() {
        return this.constantCatalog;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.CONSTANTS.CONSTANT_SCHEMA</code>.
     */
    public String getConstantSchema() {
        return this.constantSchema;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.CONSTANTS.CONSTANT_NAME</code>.
     */
    public String getConstantName() {
        return this.constantName;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.CONSTANTS.VALUE_DEFINITION</code>.
     */
    public String getValueDefinition() {
        return this.valueDefinition;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.CONSTANTS.DATA_TYPE</code>.
     */
    public String getDataType() {
        return this.dataType;
    }

    /**
     * Getter for
     * <code>INFORMATION_SCHEMA.CONSTANTS.CHARACTER_MAXIMUM_LENGTH</code>.
     */
    public Long getCharacterMaximumLength() {
        return this.characterMaximumLength;
    }

    /**
     * Getter for
     * <code>INFORMATION_SCHEMA.CONSTANTS.CHARACTER_OCTET_LENGTH</code>.
     */
    public Long getCharacterOctetLength() {
        return this.characterOctetLength;
    }

    /**
     * Getter for
     * <code>INFORMATION_SCHEMA.CONSTANTS.CHARACTER_SET_CATALOG</code>.
     */
    public String getCharacterSetCatalog() {
        return this.characterSetCatalog;
    }

    /**
     * Getter for
     * <code>INFORMATION_SCHEMA.CONSTANTS.CHARACTER_SET_SCHEMA</code>.
     */
    public String getCharacterSetSchema() {
        return this.characterSetSchema;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.CONSTANTS.CHARACTER_SET_NAME</code>.
     */
    public String getCharacterSetName() {
        return this.characterSetName;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.CONSTANTS.COLLATION_CATALOG</code>.
     */
    public String getCollationCatalog() {
        return this.collationCatalog;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.CONSTANTS.COLLATION_SCHEMA</code>.
     */
    public String getCollationSchema() {
        return this.collationSchema;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.CONSTANTS.COLLATION_NAME</code>.
     */
    public String getCollationName() {
        return this.collationName;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.CONSTANTS.NUMERIC_PRECISION</code>.
     */
    public Integer getNumericPrecision() {
        return this.numericPrecision;
    }

    /**
     * Getter for
     * <code>INFORMATION_SCHEMA.CONSTANTS.NUMERIC_PRECISION_RADIX</code>.
     */
    public Integer getNumericPrecisionRadix() {
        return this.numericPrecisionRadix;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.CONSTANTS.NUMERIC_SCALE</code>.
     */
    public Integer getNumericScale() {
        return this.numericScale;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.CONSTANTS.DATETIME_PRECISION</code>.
     */
    public Integer getDatetimePrecision() {
        return this.datetimePrecision;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.CONSTANTS.INTERVAL_TYPE</code>.
     */
    public String getIntervalType() {
        return this.intervalType;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.CONSTANTS.INTERVAL_PRECISION</code>.
     */
    public Integer getIntervalPrecision() {
        return this.intervalPrecision;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.CONSTANTS.MAXIMUM_CARDINALITY</code>.
     */
    public Integer getMaximumCardinality() {
        return this.maximumCardinality;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.CONSTANTS.DTD_IDENTIFIER</code>.
     */
    public String getDtdIdentifier() {
        return this.dtdIdentifier;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.CONSTANTS.DECLARED_DATA_TYPE</code>.
     */
    public String getDeclaredDataType() {
        return this.declaredDataType;
    }

    /**
     * Getter for
     * <code>INFORMATION_SCHEMA.CONSTANTS.DECLARED_NUMERIC_PRECISION</code>.
     */
    public Integer getDeclaredNumericPrecision() {
        return this.declaredNumericPrecision;
    }

    /**
     * Getter for
     * <code>INFORMATION_SCHEMA.CONSTANTS.DECLARED_NUMERIC_SCALE</code>.
     */
    public Integer getDeclaredNumericScale() {
        return this.declaredNumericScale;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.CONSTANTS.GEOMETRY_TYPE</code>.
     */
    public String getGeometryType() {
        return this.geometryType;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.CONSTANTS.GEOMETRY_SRID</code>.
     */
    public Integer getGeometrySrid() {
        return this.geometrySrid;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.CONSTANTS.REMARKS</code>.
     */
    public String getRemarks() {
        return this.remarks;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Constants other = (Constants) obj;
        if (this.constantCatalog == null) {
            if (other.constantCatalog != null)
                return false;
        }
        else if (!this.constantCatalog.equals(other.constantCatalog))
            return false;
        if (this.constantSchema == null) {
            if (other.constantSchema != null)
                return false;
        }
        else if (!this.constantSchema.equals(other.constantSchema))
            return false;
        if (this.constantName == null) {
            if (other.constantName != null)
                return false;
        }
        else if (!this.constantName.equals(other.constantName))
            return false;
        if (this.valueDefinition == null) {
            if (other.valueDefinition != null)
                return false;
        }
        else if (!this.valueDefinition.equals(other.valueDefinition))
            return false;
        if (this.dataType == null) {
            if (other.dataType != null)
                return false;
        }
        else if (!this.dataType.equals(other.dataType))
            return false;
        if (this.characterMaximumLength == null) {
            if (other.characterMaximumLength != null)
                return false;
        }
        else if (!this.characterMaximumLength.equals(other.characterMaximumLength))
            return false;
        if (this.characterOctetLength == null) {
            if (other.characterOctetLength != null)
                return false;
        }
        else if (!this.characterOctetLength.equals(other.characterOctetLength))
            return false;
        if (this.characterSetCatalog == null) {
            if (other.characterSetCatalog != null)
                return false;
        }
        else if (!this.characterSetCatalog.equals(other.characterSetCatalog))
            return false;
        if (this.characterSetSchema == null) {
            if (other.characterSetSchema != null)
                return false;
        }
        else if (!this.characterSetSchema.equals(other.characterSetSchema))
            return false;
        if (this.characterSetName == null) {
            if (other.characterSetName != null)
                return false;
        }
        else if (!this.characterSetName.equals(other.characterSetName))
            return false;
        if (this.collationCatalog == null) {
            if (other.collationCatalog != null)
                return false;
        }
        else if (!this.collationCatalog.equals(other.collationCatalog))
            return false;
        if (this.collationSchema == null) {
            if (other.collationSchema != null)
                return false;
        }
        else if (!this.collationSchema.equals(other.collationSchema))
            return false;
        if (this.collationName == null) {
            if (other.collationName != null)
                return false;
        }
        else if (!this.collationName.equals(other.collationName))
            return false;
        if (this.numericPrecision == null) {
            if (other.numericPrecision != null)
                return false;
        }
        else if (!this.numericPrecision.equals(other.numericPrecision))
            return false;
        if (this.numericPrecisionRadix == null) {
            if (other.numericPrecisionRadix != null)
                return false;
        }
        else if (!this.numericPrecisionRadix.equals(other.numericPrecisionRadix))
            return false;
        if (this.numericScale == null) {
            if (other.numericScale != null)
                return false;
        }
        else if (!this.numericScale.equals(other.numericScale))
            return false;
        if (this.datetimePrecision == null) {
            if (other.datetimePrecision != null)
                return false;
        }
        else if (!this.datetimePrecision.equals(other.datetimePrecision))
            return false;
        if (this.intervalType == null) {
            if (other.intervalType != null)
                return false;
        }
        else if (!this.intervalType.equals(other.intervalType))
            return false;
        if (this.intervalPrecision == null) {
            if (other.intervalPrecision != null)
                return false;
        }
        else if (!this.intervalPrecision.equals(other.intervalPrecision))
            return false;
        if (this.maximumCardinality == null) {
            if (other.maximumCardinality != null)
                return false;
        }
        else if (!this.maximumCardinality.equals(other.maximumCardinality))
            return false;
        if (this.dtdIdentifier == null) {
            if (other.dtdIdentifier != null)
                return false;
        }
        else if (!this.dtdIdentifier.equals(other.dtdIdentifier))
            return false;
        if (this.declaredDataType == null) {
            if (other.declaredDataType != null)
                return false;
        }
        else if (!this.declaredDataType.equals(other.declaredDataType))
            return false;
        if (this.declaredNumericPrecision == null) {
            if (other.declaredNumericPrecision != null)
                return false;
        }
        else if (!this.declaredNumericPrecision.equals(other.declaredNumericPrecision))
            return false;
        if (this.declaredNumericScale == null) {
            if (other.declaredNumericScale != null)
                return false;
        }
        else if (!this.declaredNumericScale.equals(other.declaredNumericScale))
            return false;
        if (this.geometryType == null) {
            if (other.geometryType != null)
                return false;
        }
        else if (!this.geometryType.equals(other.geometryType))
            return false;
        if (this.geometrySrid == null) {
            if (other.geometrySrid != null)
                return false;
        }
        else if (!this.geometrySrid.equals(other.geometrySrid))
            return false;
        if (this.remarks == null) {
            if (other.remarks != null)
                return false;
        }
        else if (!this.remarks.equals(other.remarks))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.constantCatalog == null) ? 0 : this.constantCatalog.hashCode());
        result = prime * result + ((this.constantSchema == null) ? 0 : this.constantSchema.hashCode());
        result = prime * result + ((this.constantName == null) ? 0 : this.constantName.hashCode());
        result = prime * result + ((this.valueDefinition == null) ? 0 : this.valueDefinition.hashCode());
        result = prime * result + ((this.dataType == null) ? 0 : this.dataType.hashCode());
        result = prime * result + ((this.characterMaximumLength == null) ? 0 : this.characterMaximumLength.hashCode());
        result = prime * result + ((this.characterOctetLength == null) ? 0 : this.characterOctetLength.hashCode());
        result = prime * result + ((this.characterSetCatalog == null) ? 0 : this.characterSetCatalog.hashCode());
        result = prime * result + ((this.characterSetSchema == null) ? 0 : this.characterSetSchema.hashCode());
        result = prime * result + ((this.characterSetName == null) ? 0 : this.characterSetName.hashCode());
        result = prime * result + ((this.collationCatalog == null) ? 0 : this.collationCatalog.hashCode());
        result = prime * result + ((this.collationSchema == null) ? 0 : this.collationSchema.hashCode());
        result = prime * result + ((this.collationName == null) ? 0 : this.collationName.hashCode());
        result = prime * result + ((this.numericPrecision == null) ? 0 : this.numericPrecision.hashCode());
        result = prime * result + ((this.numericPrecisionRadix == null) ? 0 : this.numericPrecisionRadix.hashCode());
        result = prime * result + ((this.numericScale == null) ? 0 : this.numericScale.hashCode());
        result = prime * result + ((this.datetimePrecision == null) ? 0 : this.datetimePrecision.hashCode());
        result = prime * result + ((this.intervalType == null) ? 0 : this.intervalType.hashCode());
        result = prime * result + ((this.intervalPrecision == null) ? 0 : this.intervalPrecision.hashCode());
        result = prime * result + ((this.maximumCardinality == null) ? 0 : this.maximumCardinality.hashCode());
        result = prime * result + ((this.dtdIdentifier == null) ? 0 : this.dtdIdentifier.hashCode());
        result = prime * result + ((this.declaredDataType == null) ? 0 : this.declaredDataType.hashCode());
        result = prime * result + ((this.declaredNumericPrecision == null) ? 0 : this.declaredNumericPrecision.hashCode());
        result = prime * result + ((this.declaredNumericScale == null) ? 0 : this.declaredNumericScale.hashCode());
        result = prime * result + ((this.geometryType == null) ? 0 : this.geometryType.hashCode());
        result = prime * result + ((this.geometrySrid == null) ? 0 : this.geometrySrid.hashCode());
        result = prime * result + ((this.remarks == null) ? 0 : this.remarks.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Constants (");

        sb.append(constantCatalog);
        sb.append(", ").append(constantSchema);
        sb.append(", ").append(constantName);
        sb.append(", ").append(valueDefinition);
        sb.append(", ").append(dataType);
        sb.append(", ").append(characterMaximumLength);
        sb.append(", ").append(characterOctetLength);
        sb.append(", ").append(characterSetCatalog);
        sb.append(", ").append(characterSetSchema);
        sb.append(", ").append(characterSetName);
        sb.append(", ").append(collationCatalog);
        sb.append(", ").append(collationSchema);
        sb.append(", ").append(collationName);
        sb.append(", ").append(numericPrecision);
        sb.append(", ").append(numericPrecisionRadix);
        sb.append(", ").append(numericScale);
        sb.append(", ").append(datetimePrecision);
        sb.append(", ").append(intervalType);
        sb.append(", ").append(intervalPrecision);
        sb.append(", ").append(maximumCardinality);
        sb.append(", ").append(dtdIdentifier);
        sb.append(", ").append(declaredDataType);
        sb.append(", ").append(declaredNumericPrecision);
        sb.append(", ").append(declaredNumericScale);
        sb.append(", ").append(geometryType);
        sb.append(", ").append(geometrySrid);
        sb.append(", ").append(remarks);

        sb.append(")");
        return sb.toString();
    }
}

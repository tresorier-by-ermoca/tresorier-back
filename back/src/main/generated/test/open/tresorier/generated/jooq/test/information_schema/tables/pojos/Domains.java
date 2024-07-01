/*
 * This file is generated by jOOQ.
 */
package open.tresorier.generated.jooq.test.information_schema.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class Domains implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String domainCatalog;
    private final String domainSchema;
    private final String domainName;
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
    private final String domainDefault;
    private final Integer maximumCardinality;
    private final String dtdIdentifier;
    private final String declaredDataType;
    private final Integer declaredNumericPrecision;
    private final Integer declaredNumericScale;
    private final String geometryType;
    private final Integer geometrySrid;
    private final String domainOnUpdate;
    private final String parentDomainCatalog;
    private final String parentDomainSchema;
    private final String parentDomainName;
    private final String remarks;

    public Domains(Domains value) {
        this.domainCatalog = value.domainCatalog;
        this.domainSchema = value.domainSchema;
        this.domainName = value.domainName;
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
        this.domainDefault = value.domainDefault;
        this.maximumCardinality = value.maximumCardinality;
        this.dtdIdentifier = value.dtdIdentifier;
        this.declaredDataType = value.declaredDataType;
        this.declaredNumericPrecision = value.declaredNumericPrecision;
        this.declaredNumericScale = value.declaredNumericScale;
        this.geometryType = value.geometryType;
        this.geometrySrid = value.geometrySrid;
        this.domainOnUpdate = value.domainOnUpdate;
        this.parentDomainCatalog = value.parentDomainCatalog;
        this.parentDomainSchema = value.parentDomainSchema;
        this.parentDomainName = value.parentDomainName;
        this.remarks = value.remarks;
    }

    public Domains(
        String domainCatalog,
        String domainSchema,
        String domainName,
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
        String domainDefault,
        Integer maximumCardinality,
        String dtdIdentifier,
        String declaredDataType,
        Integer declaredNumericPrecision,
        Integer declaredNumericScale,
        String geometryType,
        Integer geometrySrid,
        String domainOnUpdate,
        String parentDomainCatalog,
        String parentDomainSchema,
        String parentDomainName,
        String remarks
    ) {
        this.domainCatalog = domainCatalog;
        this.domainSchema = domainSchema;
        this.domainName = domainName;
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
        this.domainDefault = domainDefault;
        this.maximumCardinality = maximumCardinality;
        this.dtdIdentifier = dtdIdentifier;
        this.declaredDataType = declaredDataType;
        this.declaredNumericPrecision = declaredNumericPrecision;
        this.declaredNumericScale = declaredNumericScale;
        this.geometryType = geometryType;
        this.geometrySrid = geometrySrid;
        this.domainOnUpdate = domainOnUpdate;
        this.parentDomainCatalog = parentDomainCatalog;
        this.parentDomainSchema = parentDomainSchema;
        this.parentDomainName = parentDomainName;
        this.remarks = remarks;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.DOMAINS.DOMAIN_CATALOG</code>.
     */
    public String getDomainCatalog() {
        return this.domainCatalog;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.DOMAINS.DOMAIN_SCHEMA</code>.
     */
    public String getDomainSchema() {
        return this.domainSchema;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.DOMAINS.DOMAIN_NAME</code>.
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.DOMAINS.DATA_TYPE</code>.
     */
    public String getDataType() {
        return this.dataType;
    }

    /**
     * Getter for
     * <code>INFORMATION_SCHEMA.DOMAINS.CHARACTER_MAXIMUM_LENGTH</code>.
     */
    public Long getCharacterMaximumLength() {
        return this.characterMaximumLength;
    }

    /**
     * Getter for
     * <code>INFORMATION_SCHEMA.DOMAINS.CHARACTER_OCTET_LENGTH</code>.
     */
    public Long getCharacterOctetLength() {
        return this.characterOctetLength;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.DOMAINS.CHARACTER_SET_CATALOG</code>.
     */
    public String getCharacterSetCatalog() {
        return this.characterSetCatalog;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.DOMAINS.CHARACTER_SET_SCHEMA</code>.
     */
    public String getCharacterSetSchema() {
        return this.characterSetSchema;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.DOMAINS.CHARACTER_SET_NAME</code>.
     */
    public String getCharacterSetName() {
        return this.characterSetName;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.DOMAINS.COLLATION_CATALOG</code>.
     */
    public String getCollationCatalog() {
        return this.collationCatalog;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.DOMAINS.COLLATION_SCHEMA</code>.
     */
    public String getCollationSchema() {
        return this.collationSchema;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.DOMAINS.COLLATION_NAME</code>.
     */
    public String getCollationName() {
        return this.collationName;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.DOMAINS.NUMERIC_PRECISION</code>.
     */
    public Integer getNumericPrecision() {
        return this.numericPrecision;
    }

    /**
     * Getter for
     * <code>INFORMATION_SCHEMA.DOMAINS.NUMERIC_PRECISION_RADIX</code>.
     */
    public Integer getNumericPrecisionRadix() {
        return this.numericPrecisionRadix;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.DOMAINS.NUMERIC_SCALE</code>.
     */
    public Integer getNumericScale() {
        return this.numericScale;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.DOMAINS.DATETIME_PRECISION</code>.
     */
    public Integer getDatetimePrecision() {
        return this.datetimePrecision;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.DOMAINS.INTERVAL_TYPE</code>.
     */
    public String getIntervalType() {
        return this.intervalType;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.DOMAINS.INTERVAL_PRECISION</code>.
     */
    public Integer getIntervalPrecision() {
        return this.intervalPrecision;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.DOMAINS.DOMAIN_DEFAULT</code>.
     */
    public String getDomainDefault() {
        return this.domainDefault;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.DOMAINS.MAXIMUM_CARDINALITY</code>.
     */
    public Integer getMaximumCardinality() {
        return this.maximumCardinality;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.DOMAINS.DTD_IDENTIFIER</code>.
     */
    public String getDtdIdentifier() {
        return this.dtdIdentifier;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.DOMAINS.DECLARED_DATA_TYPE</code>.
     */
    public String getDeclaredDataType() {
        return this.declaredDataType;
    }

    /**
     * Getter for
     * <code>INFORMATION_SCHEMA.DOMAINS.DECLARED_NUMERIC_PRECISION</code>.
     */
    public Integer getDeclaredNumericPrecision() {
        return this.declaredNumericPrecision;
    }

    /**
     * Getter for
     * <code>INFORMATION_SCHEMA.DOMAINS.DECLARED_NUMERIC_SCALE</code>.
     */
    public Integer getDeclaredNumericScale() {
        return this.declaredNumericScale;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.DOMAINS.GEOMETRY_TYPE</code>.
     */
    public String getGeometryType() {
        return this.geometryType;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.DOMAINS.GEOMETRY_SRID</code>.
     */
    public Integer getGeometrySrid() {
        return this.geometrySrid;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.DOMAINS.DOMAIN_ON_UPDATE</code>.
     */
    public String getDomainOnUpdate() {
        return this.domainOnUpdate;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.DOMAINS.PARENT_DOMAIN_CATALOG</code>.
     */
    public String getParentDomainCatalog() {
        return this.parentDomainCatalog;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.DOMAINS.PARENT_DOMAIN_SCHEMA</code>.
     */
    public String getParentDomainSchema() {
        return this.parentDomainSchema;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.DOMAINS.PARENT_DOMAIN_NAME</code>.
     */
    public String getParentDomainName() {
        return this.parentDomainName;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.DOMAINS.REMARKS</code>.
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
        final Domains other = (Domains) obj;
        if (this.domainCatalog == null) {
            if (other.domainCatalog != null)
                return false;
        }
        else if (!this.domainCatalog.equals(other.domainCatalog))
            return false;
        if (this.domainSchema == null) {
            if (other.domainSchema != null)
                return false;
        }
        else if (!this.domainSchema.equals(other.domainSchema))
            return false;
        if (this.domainName == null) {
            if (other.domainName != null)
                return false;
        }
        else if (!this.domainName.equals(other.domainName))
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
        if (this.domainDefault == null) {
            if (other.domainDefault != null)
                return false;
        }
        else if (!this.domainDefault.equals(other.domainDefault))
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
        if (this.domainOnUpdate == null) {
            if (other.domainOnUpdate != null)
                return false;
        }
        else if (!this.domainOnUpdate.equals(other.domainOnUpdate))
            return false;
        if (this.parentDomainCatalog == null) {
            if (other.parentDomainCatalog != null)
                return false;
        }
        else if (!this.parentDomainCatalog.equals(other.parentDomainCatalog))
            return false;
        if (this.parentDomainSchema == null) {
            if (other.parentDomainSchema != null)
                return false;
        }
        else if (!this.parentDomainSchema.equals(other.parentDomainSchema))
            return false;
        if (this.parentDomainName == null) {
            if (other.parentDomainName != null)
                return false;
        }
        else if (!this.parentDomainName.equals(other.parentDomainName))
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
        result = prime * result + ((this.domainCatalog == null) ? 0 : this.domainCatalog.hashCode());
        result = prime * result + ((this.domainSchema == null) ? 0 : this.domainSchema.hashCode());
        result = prime * result + ((this.domainName == null) ? 0 : this.domainName.hashCode());
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
        result = prime * result + ((this.domainDefault == null) ? 0 : this.domainDefault.hashCode());
        result = prime * result + ((this.maximumCardinality == null) ? 0 : this.maximumCardinality.hashCode());
        result = prime * result + ((this.dtdIdentifier == null) ? 0 : this.dtdIdentifier.hashCode());
        result = prime * result + ((this.declaredDataType == null) ? 0 : this.declaredDataType.hashCode());
        result = prime * result + ((this.declaredNumericPrecision == null) ? 0 : this.declaredNumericPrecision.hashCode());
        result = prime * result + ((this.declaredNumericScale == null) ? 0 : this.declaredNumericScale.hashCode());
        result = prime * result + ((this.geometryType == null) ? 0 : this.geometryType.hashCode());
        result = prime * result + ((this.geometrySrid == null) ? 0 : this.geometrySrid.hashCode());
        result = prime * result + ((this.domainOnUpdate == null) ? 0 : this.domainOnUpdate.hashCode());
        result = prime * result + ((this.parentDomainCatalog == null) ? 0 : this.parentDomainCatalog.hashCode());
        result = prime * result + ((this.parentDomainSchema == null) ? 0 : this.parentDomainSchema.hashCode());
        result = prime * result + ((this.parentDomainName == null) ? 0 : this.parentDomainName.hashCode());
        result = prime * result + ((this.remarks == null) ? 0 : this.remarks.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Domains (");

        sb.append(domainCatalog);
        sb.append(", ").append(domainSchema);
        sb.append(", ").append(domainName);
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
        sb.append(", ").append(domainDefault);
        sb.append(", ").append(maximumCardinality);
        sb.append(", ").append(dtdIdentifier);
        sb.append(", ").append(declaredDataType);
        sb.append(", ").append(declaredNumericPrecision);
        sb.append(", ").append(declaredNumericScale);
        sb.append(", ").append(geometryType);
        sb.append(", ").append(geometrySrid);
        sb.append(", ").append(domainOnUpdate);
        sb.append(", ").append(parentDomainCatalog);
        sb.append(", ").append(parentDomainSchema);
        sb.append(", ").append(parentDomainName);
        sb.append(", ").append(remarks);

        sb.append(")");
        return sb.toString();
    }
}

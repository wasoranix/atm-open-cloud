
package com.hsbc.mx.atm.model.openbanking;

import java.util.Date;

import com.hsbc.mx.atm.model.JsonObjectBase;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <p>
 * <b> Meta. </b>
 * </p>
 */
@JsonAutoDetect
@JsonIgnoreProperties(ignoreUnknown = true)
public class Meta extends JsonObjectBase {

    @JsonProperty("LastUpdated")
    private Date lastUpdated;

    @JsonProperty("TotalResults")
    private Long totalResults;

    @JsonProperty("Agreement")
    private String agreement;

    @JsonProperty("License")
    private String license;

    @JsonProperty("TermsOfUse")
    private String termsOfUse;

    /**
     * @return the lastUpdated
     */
    public Date getLastUpdated() {
        return this.lastUpdated;
    }

    /**
     * @param lastUpdated
     *            the lastUpdated to set
     */
    public void setLastUpdated(final Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    /**
     * @return the totalResults
     */
    public Long getTotalResults() {
        return this.totalResults;
    }

    /**
     * @param totalResults
     *            the totalResults to set
     */
    public void setTotalResults(final Long totalResults) {
        this.totalResults = totalResults;
    }

    /**
     * @return the agreement
     */
    public String getAgreement() {
        return this.agreement;
    }

    /**
     * @param agreement
     *            the agreement to set
     */
    public void setAgreement(final String agreement) {
        this.agreement = agreement;
    }

    /**
     * @return the license
     */
    public String getLicense() {
        return this.license;
    }

    /**
     * @param license
     *            the license to set
     */
    public void setLicense(final String license) {
        this.license = license;
    }

    /**
     * @return the termsOfUse
     */
    public String getTermsOfUse() {
        return this.termsOfUse;
    }

    /**
     * @param termsOfUse
     *            the termsOfUse to set
     */
    public void setTermsOfUse(final String termsOfUse) {
        this.termsOfUse = termsOfUse;
    }


}

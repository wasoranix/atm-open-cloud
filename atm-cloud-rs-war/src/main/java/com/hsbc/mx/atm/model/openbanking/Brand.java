
package com.hsbc.mx.atm.model.openbanking;

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
public class Brand extends JsonObjectBase {
    @JsonProperty("BrandName")
    private String brandName;

    @JsonProperty("ATM")
    private ATM[] atms;

    /**
     * @return the brandName
     */
    public String getBrandName() {
        return this.brandName;
    }

    /**
     * @param brandName
     *            the brandName to set
     */
    public void setBrandName(final String brandName) {
        this.brandName = brandName;
    }

    /**
     * @return the atms
     */
    public ATM[] getAtms() {
        return this.atms;
    }

    /**
     * @param atms
     *            the atms to set
     */
    public void setAtms(final ATM[] atms) {
        this.atms = atms;
    }


}

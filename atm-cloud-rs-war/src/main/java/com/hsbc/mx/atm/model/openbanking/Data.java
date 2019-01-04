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
public class Data extends JsonObjectBase {

    @JsonProperty("Brand")
    private Brand[] brand;

    /**
     * @return the brand
     */
    public Brand[] getBrand() {
        return this.brand;
    }

    /**
     * @param brand
     *            the brand to set
     */
    public void setBrand(final Brand[] brand) {
        this.brand = brand;
    }


}

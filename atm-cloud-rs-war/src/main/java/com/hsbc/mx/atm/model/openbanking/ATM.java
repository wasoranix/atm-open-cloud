
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
public class ATM extends JsonObjectBase {


    @JsonProperty("Identification")
    private String identification;
    @JsonProperty("SupportedLanguages")
    private String[] supportedLanguages;

    @JsonProperty("SupportedCurrencies")
    private String[] supportedCurrencies;

    @JsonProperty("Branch")
    private Branch branch;

    @JsonProperty("Location")
    private Location location;

    /**
     * @return the identification
     */
    public String getIdentification() {
        return this.identification;
    }

    /**
     * @param identification
     *            the identification to set
     */
    public void setIdentification(final String identification) {
        this.identification = identification;
    }

    /**
     * @return the supportedLanguages
     */
    public String[] getSupportedLanguages() {
        return this.supportedLanguages;
    }

    /**
     * @param supportedLanguages
     *            the supportedLanguages to set
     */
    public void setSupportedLanguages(final String[] supportedLanguages) {
        this.supportedLanguages = supportedLanguages;
    }

    /**
     * @return the supportedCurrencies
     */
    public String[] getSupportedCurrencies() {
        return this.supportedCurrencies;
    }

    /**
     * @param supportedCurrencies
     *            the supportedCurrencies to set
     */
    public void setSupportedCurrencies(final String[] supportedCurrencies) {
        this.supportedCurrencies = supportedCurrencies;
    }

    /**
     * @return the branch
     */
    public Branch getBranch() {
        return this.branch;
    }

    /**
     * @param branch
     *            the branch to set
     */
    public void setBranch(final Branch branch) {
        this.branch = branch;
    }

    /**
     * @return the location
     */
    public Location getLocation() {
        return this.location;
    }

    /**
     * @param location
     *            the location to set
     */
    public void setLocation(final Location location) {
        this.location = location;
    }


}


package com.hsbc.mx.atm.model.openbanking;

import com.hsbc.mx.atm.model.JsonObjectBase;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <p>
 * <b> Location. </b>
 * </p>
 */
@JsonAutoDetect
@JsonIgnoreProperties(ignoreUnknown = true)
public class Location extends JsonObjectBase {

    @JsonProperty("Site")
    private Site site;

    @JsonProperty("PostalAddress")
    private PostalAddress postalAddress;

    /**
     * @return the site
     */
    public Site getSite() {
        return this.site;
    }

    /**
     * @param site
     *            the site to set
     */
    public void setSite(final Site site) {
        this.site = site;
    }

    /**
     * @return the postalAddress
     */
    public PostalAddress getPostalAddress() {
        return this.postalAddress;
    }

    /**
     * @param postalAddress
     *            the postalAddress to set
     */
    public void setPostalAddress(final PostalAddress postalAddress) {
        this.postalAddress = postalAddress;
    }


}

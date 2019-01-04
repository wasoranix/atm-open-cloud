
package com.hsbc.mx.atm.model.openbanking;

import com.hsbc.mx.atm.model.JsonObjectBase;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <p>
 * <b> TODO : Insert description of the class's responsibility/role. </b>
 * </p>
 */
@JsonAutoDetect
@JsonIgnoreProperties(ignoreUnknown = true)
public class Branch extends JsonObjectBase {

    @JsonProperty("Identification")
    private String identification;

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


}

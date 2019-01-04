
package com.hsbc.mx.atm.model.openbanking;

import com.hsbc.mx.atm.model.JsonObjectBase;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <p>
 * <b> GeoLocation. </b>
 * </p>
 */

@JsonAutoDetect
@JsonIgnoreProperties(ignoreUnknown = true)
public class GeoLocation extends JsonObjectBase {
    @JsonProperty("GeographicCoordinates")
    private GeographicCoordinates geographicCoordinates;

    /**
     * @return the geographicCoordinates
     */
    public GeographicCoordinates getGeographicCoordinates() {
        return this.geographicCoordinates;
    }

    /**
     * @param geographicCoordinates
     *            the geographicCoordinates to set
     */
    public void setGeographicCoordinates(final GeographicCoordinates geographicCoordinates) {
        this.geographicCoordinates = geographicCoordinates;
    }


}

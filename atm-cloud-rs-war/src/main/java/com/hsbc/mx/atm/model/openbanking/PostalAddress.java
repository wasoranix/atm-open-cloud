
package com.hsbc.mx.atm.model.openbanking;

import com.hsbc.mx.atm.model.JsonObjectBase;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * <p>
 * <b> PostalAddress. </b>
 * </p>
 */
@JsonAutoDetect
@JsonIgnoreProperties(ignoreUnknown = true)
public class PostalAddress extends JsonObjectBase {

    @JsonProperty("AddressLine")
    private String[] addressLine;

    @JsonProperty("BuildingNumber")
    private String buildingNumber;

    @JsonProperty("StreetName")
    private String streetName;

    @JsonProperty("TownName")
    private String townName;

    @JsonProperty("CountrySubDivision")
    private String[] countrySubDivision;

    @JsonProperty("Country")
    private String country;

    @JsonProperty("PostCode")
    private String postCode;

    @JsonProperty("GeoLocation")
    private GeoLocation geoLocation;


}

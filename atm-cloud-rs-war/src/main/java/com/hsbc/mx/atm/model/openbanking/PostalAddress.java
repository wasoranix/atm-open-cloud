
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

    /**
     * @return the addressLine
     */
    public String[] getAddressLine() {
        return this.addressLine;
    }

    /**
     * @param addressLine
     *            the addressLine to set
     */
    public void setAddressLine(final String[] addressLine) {
        this.addressLine = addressLine;
    }

    /**
     * @return the buildingNumber
     */
    public String getBuildingNumber() {
        return this.buildingNumber;
    }

    /**
     * @param buildingNumber
     *            the buildingNumber to set
     */
    public void setBuildingNumber(final String buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

    /**
     * @return the streetName
     */
    public String getStreetName() {
        return this.streetName;
    }

    /**
     * @param streetName
     *            the streetName to set
     */
    public void setStreetName(final String streetName) {
        this.streetName = streetName;
    }

    /**
     * @return the townName
     */
    public String getTownName() {
        return this.townName;
    }

    /**
     * @param townName
     *            the townName to set
     */
    public void setTownName(final String townName) {
        this.townName = townName;
    }

    /**
     * @return the countrySubDivision
     */
    public String[] getCountrySubDivision() {
        return this.countrySubDivision;
    }

    /**
     * @param countrySubDivision
     *            the countrySubDivision to set
     */
    public void setCountrySubDivision(final String[] countrySubDivision) {
        this.countrySubDivision = countrySubDivision;
    }

    /**
     * @return the country
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * @param country
     *            the country to set
     */
    public void setCountry(final String country) {
        this.country = country;
    }

    /**
     * @return the postCode
     */
    public String getPostCode() {
        return this.postCode;
    }

    /**
     * @param postCode
     *            the postCode to set
     */
    public void setPostCode(final String postCode) {
        this.postCode = postCode;
    }

    /**
     * @return the geoLocation
     */
    public GeoLocation getGeoLocation() {
        return this.geoLocation;
    }

    /**
     * @param geoLocation
     *            the geoLocation to set
     */
    public void setGeoLocation(final GeoLocation geoLocation) {
        this.geoLocation = geoLocation;
    }


}

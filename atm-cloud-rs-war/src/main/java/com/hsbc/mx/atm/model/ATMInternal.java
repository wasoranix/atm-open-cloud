
package com.hsbc.mx.atm.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * <p>
 * <b> Meta. </b>
 * </p>
 */
@JsonAutoDetect
@JsonIgnoreProperties(ignoreUnknown = true)
public class ATMInternal extends JsonObjectBase {

    private String id;

    private String languages;

    private String currencies;

    private String branch;

    private String locationSite;

    private String addressLine;

    private String buildingNumber;

    private String streetName;

    private String townName;

    private String countrySubDivision;

    private String country;

    private String postCode;

    private Double latitude;

    private Double longitude;

    /**
     * @return the id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @param id
     *            the id to set
     */
    public void setId(final String id) {
        this.id = id;
    }

    /**
     * @return the languages
     */
    public String getLanguages() {
        return this.languages;
    }

    /**
     * @param languages
     *            the languages to set
     */
    public void setLanguages(final String languages) {
        this.languages = languages;
    }

    /**
     * @return the currencies
     */
    public String getCurrencies() {
        return this.currencies;
    }

    /**
     * @param currencies
     *            the currencies to set
     */
    public void setCurrencies(final String currencies) {
        this.currencies = currencies;
    }

    /**
     * @return the branch
     */
    public String getBranch() {
        return this.branch;
    }

    /**
     * @param branch
     *            the branch to set
     */
    public void setBranch(final String branch) {
        this.branch = branch;
    }

    /**
     * @return the locationSite
     */
    public String getLocationSite() {
        return this.locationSite;
    }

    /**
     * @param locationSite
     *            the locationSite to set
     */
    public void setLocationSite(final String locationSite) {
        this.locationSite = locationSite;
    }

    /**
     * @return the addressLine
     */
    public String getAddressLine() {
        return this.addressLine;
    }

    /**
     * @param addressLine
     *            the addressLine to set
     */
    public void setAddressLine(final String addressLine) {
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
    public String getCountrySubDivision() {
        return this.countrySubDivision;
    }

    /**
     * @param countrySubDivision
     *            the countrySubDivision to set
     */
    public void setCountrySubDivision(final String countrySubDivision) {
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
     * @return the latitude
     */
    public Double getLatitude() {
        return this.latitude;
    }

    /**
     * @param latitude
     *            the latitude to set
     */
    public void setLatitude(final Double latitude) {
        this.latitude = latitude;
    }

    /**
     * @return the longitude
     */
    public Double getLongitude() {
        return this.longitude;
    }

    /**
     * @param longitude
     *            the longitude to set
     */
    public void setLongitude(final Double longitude) {
        this.longitude = longitude;
    }


}
